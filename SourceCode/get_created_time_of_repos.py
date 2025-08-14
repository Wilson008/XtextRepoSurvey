import requests
import csv
from datetime import datetime
import pandas as pd
import os
import time
from requests.adapters import HTTPAdapter
from urllib3.util.retry import Retry
import re

# GitHub Access Token
access_token = 'xxx'

# CSV file path
csv_file_path = 'SourceCode/Benchmarks_Order_Repos.csv'

# Output file paths with timestamp to avoid conflicts
timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
output_csv_file_path = f'SourceCode/repos_real_created_time_{timestamp}.csv'
output_excel_file_path = f'SourceCode/repos_real_created_time_{timestamp}.xlsx'

# Headers for authentication
headers = {
    'Authorization': f'token {access_token}',
    'Accept': 'application/vnd.github.v3+json',
    'User-Agent': 'Python-Script'
}

# 创建带重试机制的session
def create_session():
    session = requests.Session()
    retry_strategy = Retry(
        total=3,  # 总重试次数
        backoff_factor=1,  # 重试间隔
        status_forcelist=[429, 500, 502, 503, 504],  # 需要重试的HTTP状态码
        allowed_methods=["HEAD", "GET", "OPTIONS"]
    )
    adapter = HTTPAdapter(max_retries=retry_strategy)
    session.mount("http://", adapter)
    session.mount("https://", adapter)
    return session

def get_earliest_commit_date(owner, repo, session):
    """获取仓库最早的commit时间（从最后几页开始查找）"""
    print(f"    -> 查找最早commit...")
    
    try:
        # 首先获取仓库的默认分支
        repo_url = f'https://api.github.com/repos/{owner}/{repo}'
        repo_response = session.get(repo_url, headers=headers, timeout=30)
        
        if repo_response.status_code != 200:
            print(f"    -> 无法获取仓库信息: {repo_response.status_code}")
            return None
        
        repo_info = repo_response.json()
        default_branch = repo_info.get('default_branch', 'main')
        
        # 获取commits
        commits_url = f'https://api.github.com/repos/{owner}/{repo}/commits'
        
        earliest_commit_date = None
        earliest_commit_sha = None
        
        # 先获取第一页看看总体情况
        params = {
            'sha': default_branch,
            'per_page': 100,
            'page': 1
        }
        
        response = session.get(commits_url, headers=headers, params=params, timeout=30)
        
        if response.status_code == 200:
            commits = response.json()
            print(f"    -> 找到commits，开始查找最早的...")
            
            # 检查是否有更多页面
            link_header = response.headers.get('Link', '')
            total_pages = 1
            
            # 解析Link header来找到最后一页
            if 'rel="last"' in link_header:
                last_page_match = re.search(r'page=(\d+)>; rel="last"', link_header)
                if last_page_match:
                    total_pages = int(last_page_match.group(1))
            
            print(f"    -> 总页数: {total_pages}")
            
            # 从最后几页开始查找（最早的commits在最后）
            # 但限制最多检查最后5页，避免过度消耗API
            start_page = max(1, total_pages - 4)
            
            for page in range(start_page, total_pages + 1):
                print(f"    -> 检查第 {page} 页...")
                
                params['page'] = page
                page_response = session.get(commits_url, headers=headers, params=params, timeout=30)
                
                if page_response.status_code == 200:
                    page_commits = page_response.json()
                    
                    for commit in page_commits:
                        commit_date = commit['commit']['author']['date']
                        commit_sha = commit['sha']
                        
                        if earliest_commit_date is None or commit_date < earliest_commit_date:
                            earliest_commit_date = commit_date
                            earliest_commit_sha = commit_sha
                
                    # 添加延迟避免rate limit
                    time.sleep(0.2)
                else:
                    print(f"    -> 获取第 {page} 页失败: {page_response.status_code}")
            
            if earliest_commit_date:
                earliest_date = earliest_commit_date.split('T')[0]
                print(f"    -> 找到最早commit: {earliest_date} (SHA: {earliest_commit_sha[:8] if earliest_commit_sha else 'N/A'})")
                return earliest_date
            else:
                print(f"    -> 未找到commits")
                return None
                
        elif response.status_code == 409:
            # 空仓库
            print(f"    -> 空仓库（没有commits）")
            return None
        else:
            print(f"    -> 获取commits失败: {response.status_code}")
            return None
            
    except Exception as e:
        print(f"    -> 获取commits时出错: {str(e)[:100]}...")
        return None

def get_repo_real_creation_date(owner, repo, session, max_retries=3):
    """获取仓库的真实创建时间（优先使用最早commit时间）"""
    url = f'https://api.github.com/repos/{owner}/{repo}'
    
    for attempt in range(max_retries):
        try:
            # 获取基本仓库信息
            response = session.get(url, headers=headers, timeout=30)
            
            if response.status_code == 200:
                repo_info = response.json()
                
                # 获取API创建时间
                api_created_at = repo_info.get('created_at', '')
                api_created_date = api_created_at.split('T')[0] if api_created_at else None
                
                # 检查是否是fork
                is_fork = repo_info.get('fork', False)
                
                # 如果是fork，先尝试获取原始仓库信息
                if is_fork:
                    original_repo = repo_info.get('source') or repo_info.get('parent')
                    if original_repo:
                        original_owner = original_repo['owner']['login']
                        original_name = original_repo['name']
                        print(f"  -> Fork detected, checking original repo: {original_owner}/{original_name}")
                        
                        # 递归获取原始仓库的真实创建时间
                        return get_repo_real_creation_date(original_owner, original_name, session, max_retries)
                
                # 获取最早commit时间
                earliest_commit_date = get_earliest_commit_date(owner, repo, session)
                
                if earliest_commit_date:
                    # 比较API时间和最早commit时间
                    if api_created_date and earliest_commit_date < api_created_date:
                        print(f"  -> 使用最早commit时间: {earliest_commit_date} (API时间: {api_created_date})")
                        return earliest_commit_date, "commit_based"
                    else:
                        print(f"  -> 使用API时间: {api_created_date}")
                        return api_created_date, "api_based"
                else:
                    # 无法获取commit历史，使用API时间
                    print(f"  -> 无法获取commit历史，使用API时间: {api_created_date}")
                    return api_created_date, "api_fallback"
                
            elif response.status_code == 404:
                print(f'Repository {owner}/{repo} not found (404)')
                return 'NOT_FOUND', 'NOT_FOUND'
            elif response.status_code == 403:
                print(f'API rate limit exceeded or access forbidden (403)')
                # 如果是rate limit，等待更长时间
                if 'rate limit' in response.text.lower():
                    reset_time = response.headers.get('X-RateLimit-Reset')
                    if reset_time:
                        wait_time = int(reset_time) - int(time.time()) + 10
                        print(f'Rate limit exceeded. Waiting {wait_time} seconds...')
                        time.sleep(max(wait_time, 60))
                        continue
                return 'RATE_LIMITED', 'RATE_LIMITED'
            else:
                print(f'HTTP Error {response.status_code} for {owner}/{repo}')
                if attempt < max_retries - 1:
                    wait_time = (attempt + 1) * 2
                    print(f'Retrying in {wait_time} seconds... (attempt {attempt + 1}/{max_retries})')
                    time.sleep(wait_time)
                    continue
                return 'ERROR', 'ERROR'
                
        except requests.exceptions.ConnectionError as e:
            print(f'Connection error for {owner}/{repo}: {str(e)[:100]}...')
            if attempt < max_retries - 1:
                wait_time = (attempt + 1) * 5
                print(f'Retrying in {wait_time} seconds... (attempt {attempt + 1}/{max_retries})')
                time.sleep(wait_time)
                continue
            return 'CONNECTION_ERROR', 'CONNECTION_ERROR'
            
        except requests.exceptions.Timeout as e:
            print(f'Timeout error for {owner}/{repo}: {str(e)}')
            if attempt < max_retries - 1:
                wait_time = (attempt + 1) * 3
                print(f'Retrying in {wait_time} seconds... (attempt {attempt + 1}/{max_retries})')
                time.sleep(wait_time)
                continue
            return 'TIMEOUT', 'TIMEOUT'
            
        except Exception as e:
            print(f'Unexpected error for {owner}/{repo}: {str(e)[:100]}...')
            if attempt < max_retries - 1:
                wait_time = (attempt + 1) * 2
                print(f'Retrying in {wait_time} seconds... (attempt {attempt + 1}/{max_retries})')
                time.sleep(wait_time)
                continue
            return 'UNKNOWN_ERROR', 'UNKNOWN_ERROR'
    
    return 'MAX_RETRIES_EXCEEDED', 'MAX_RETRIES_EXCEEDED'

# 读取输入CSV文件并处理每个仓库
results = []  # 存储所有结果用于生成Excel

# 检查输出目录是否存在
os.makedirs(os.path.dirname(output_csv_file_path), exist_ok=True)

try:
    # 创建session
    session = create_session()
    
    with open(csv_file_path, newline='', encoding='utf-8') as infile:
        csvreader = csv.reader(infile)
        next(csvreader)  # 跳过标题行

        # 打开输出CSV文件进行写入（使用UTF-8 BOM以确保Excel正确识别）
        with open(output_csv_file_path, 'w', newline='', encoding='utf-8-sig') as outfile:
            csvwriter = csv.writer(outfile)
            # 写入标题行
            csvwriter.writerow(['owner', 'repo', 'real_created_date', 'date_source'])

            # 处理输入CSV中的每一行
            for i, row in enumerate(csvreader, 1):
                if len(row) < 2:
                    continue
                    
                owner, repo = row[0].strip(), row[1].strip()
                print(f'\nProcessing {i}: {owner}/{repo}')
                print("-" * 40)
                
                created_date, date_source = get_repo_real_creation_date(owner, repo, session)
                
                if created_date and created_date not in ['ERROR', 'NOT_FOUND', 'RATE_LIMITED', 'CONNECTION_ERROR', 'TIMEOUT', 'UNKNOWN_ERROR', 'MAX_RETRIES_EXCEEDED']:
                    print(f'✓ Success: Real Created Date: {created_date} ({date_source})')
                else:
                    print(f'✗ Failed: {created_date}')
                
                # 将结果写入输出CSV
                csvwriter.writerow([owner, repo, created_date, date_source])
                # 同时保存到列表用于Excel生成
                results.append([owner, repo, created_date, date_source])
                
                # 在仓库之间添加延迟，避免触发rate limit
                time.sleep(0.5)

    print(f"\nCSV文件已生成: {output_csv_file_path}")
    
except PermissionError as e:
    print(f"权限错误：{e}")
    print("请确保：")
    print("1. 关闭所有打开该文件的程序（如Excel）")
    print("2. 检查文件夹的写入权限")
    print("3. 以管理员身份运行命令提示符")
    exit(1)
except FileNotFoundError as e:
    print(f"文件未找到：{e}")
    print(f"请确保输入文件存在：{csv_file_path}")
    exit(1)

# 生成Excel文件
try:
    df = pd.DataFrame(results, columns=['owner', 'repo', 'real_created_date', 'date_source'])
    df.to_excel(output_excel_file_path, index=False, engine='openpyxl')
    print(f"Excel文件已生成: {output_excel_file_path}")
except ImportError:
    print("未安装pandas或openpyxl，跳过Excel文件生成")
    print("如需生成Excel文件，请运行: pip install pandas openpyxl")

print("\n" + "="*60)
print("处理完成！获取的是基于commits历史的真实项目创建时间。")
print("说明：")
print("- commit_based: 基于最早commit的时间（推荐）")
print("- api_based: 基于GitHub API的时间")
print("- api_fallback: 无法获取commit历史，使用API时间")
print("="*60)