import requests
import json
from datetime import datetime
import time

# GitHub Access Token
access_token = 'xxx'  # 请替换为您的token

# 要测试的仓库
owner = 'eclipse'
repo = 'epsilon'

# Headers for authentication
headers = {
    'Authorization': f'token {access_token}',
    'Accept': 'application/vnd.github.v3+json',
    'User-Agent': 'Python-Script'
}

def get_earliest_commit_date(owner, repo):
    """获取仓库最早的commit时间"""
    print(f"正在查找 {owner}/{repo} 的最早commit...")
    
    # 首先获取仓库的默认分支
    repo_url = f'https://api.github.com/repos/{owner}/{repo}'
    repo_response = requests.get(repo_url, headers=headers, timeout=30)
    
    if repo_response.status_code != 200:
        print(f"无法获取仓库信息: {repo_response.status_code}")
        return None
    
    repo_info = repo_response.json()
    default_branch = repo_info.get('default_branch', 'main')
    print(f"默认分支: {default_branch}")
    
    # 获取最早的commits（使用分页，按时间正序）
    commits_url = f'https://api.github.com/repos/{owner}/{repo}/commits'
    
    # 我们需要找到最早的commit，所以从最后一页开始
    earliest_commit_date = None
    earliest_commit_sha = None
    earliest_commit_message = None
    
    # 先获取第一页看看总体情况
    params = {
        'sha': default_branch,
        'per_page': 100,  # 每页最多100个
        'page': 1
    }
    
    try:
        response = requests.get(commits_url, headers=headers, params=params, timeout=30)
        
        if response.status_code == 200:
            commits = response.json()
            print(f"找到 commits，开始查找最早的...")
            
            # 检查是否有更多页面
            link_header = response.headers.get('Link', '')
            total_pages = 1
            
            # 解析Link header来找到最后一页
            if 'rel="last"' in link_header:
                import re
                last_page_match = re.search(r'page=(\d+)>; rel="last"', link_header)
                if last_page_match:
                    total_pages = int(last_page_match.group(1))
            
            print(f"总页数: {total_pages}")
            
            # 从最后几页开始查找（最早的commits在最后）
            for page in range(max(1, total_pages-2), total_pages + 1):
                print(f"正在检查第 {page} 页...")
                
                params['page'] = page
                page_response = requests.get(commits_url, headers=headers, params=params, timeout=30)
                
                if page_response.status_code == 200:
                    page_commits = page_response.json()
                    
                    for commit in page_commits:
                        commit_date = commit['commit']['author']['date']
                        commit_sha = commit['sha']
                        commit_message = commit['commit']['message'].split('\n')[0]  # 第一行
                        
                        if earliest_commit_date is None or commit_date < earliest_commit_date:
                            earliest_commit_date = commit_date
                            earliest_commit_sha = commit_sha
                            earliest_commit_message = commit_message
                    
                    # 添加延迟避免rate limit
                    time.sleep(0.2)
                else:
                    print(f"获取第 {page} 页失败: {page_response.status_code}")
            
            if earliest_commit_date:
                earliest_date = earliest_commit_date.split('T')[0]
                print(f"\n✓ 找到最早的commit:")
                print(f"  日期: {earliest_date}")
                print(f"  SHA: {earliest_commit_sha[:8]}")
                print(f"  消息: {earliest_commit_message[:80]}...")
                return earliest_date
            else:
                print("未找到任何commits")
                return None
                
        elif response.status_code == 409:
            # 空仓库
            print("这是一个空仓库（没有commits）")
            return None
        else:
            print(f"获取commits失败: {response.status_code}")
            print(f"响应: {response.text[:200]}")
            return None
            
    except Exception as e:
        print(f"获取commits时出错: {e}")
        return None

def get_repo_creation_info(owner, repo):
    """获取仓库的多种创建时间信息"""
    print(f"=== 分析仓库: {owner}/{repo} ===")
    
    # 1. 获取API创建时间
    repo_url = f'https://api.github.com/repos/{owner}/{repo}'
    try:
        response = requests.get(repo_url, headers=headers, timeout=30)
        
        if response.status_code == 200:
            repo_info = response.json()
            
            api_created_date = repo_info.get('created_at', '').split('T')[0]
            is_fork = repo_info.get('fork', False)
            
            print(f"\n1. GitHub API信息:")
            print(f"   API创建时间: {api_created_date}")
            print(f"   是否为Fork: {is_fork}")
            
            if is_fork:
                original_repo = repo_info.get('source') or repo_info.get('parent')
                if original_repo:
                    original_created_date = original_repo.get('created_at', '').split('T')[0]
                    print(f"   原始仓库创建时间: {original_created_date}")
            
            # 2. 获取最早commit时间
            print(f"\n2. Commits历史分析:")
            earliest_commit_date = get_earliest_commit_date(owner, repo)
            
            # 3. 总结
            print(f"\n3. 结论:")
            print(f"   API显示创建时间: {api_created_date}")
            if earliest_commit_date:
                print(f"   最早commit时间: {earliest_commit_date}")
                print(f"   真实项目开始时间: {earliest_commit_date} (推荐使用)")
                
                # 比较两个时间
                if earliest_commit_date < api_created_date:
                    print(f"   ⚠️ 项目实际开始时间比API创建时间早!")
                    print(f"   ⚠️ 这可能是仓库迁移或转移造成的")
                else:
                    print(f"   ✓ API创建时间与最早commit时间一致")
            else:
                print(f"   无法获取commit历史，使用API时间: {api_created_date}")
            
            return {
                'api_created_date': api_created_date,
                'earliest_commit_date': earliest_commit_date,
                'recommended_date': earliest_commit_date or api_created_date,
                'is_fork': is_fork
            }
            
        else:
            print(f"获取仓库信息失败: {response.status_code}")
            return None
            
    except Exception as e:
        print(f"分析仓库时出错: {e}")
        return None

# 运行分析
if __name__ == "__main__":
    result = get_repo_creation_info(owner, repo)
    
    if result:
        print(f"\n" + "="*60)
        print(f"最终建议:")
        print(f"使用时间: {result['recommended_date']}")
        print(f"说明: {'基于最早commit时间' if result['earliest_commit_date'] else '基于API创建时间'}")
        print(f"="*60)
    else:
        print("分析失败")