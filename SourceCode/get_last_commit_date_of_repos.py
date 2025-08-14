import requests
import csv
import time

# GitHub API 配置
TOKEN = "XXX"
HEADERS = {"Authorization": f"token {TOKEN}"}

# 输入和输出文件路径
input_file = "SourceCode/Benchmarks_Order_Repos.csv"
output_file = "SourceCode/last_commit_date_repo.csv"

def get_last_commit_date(owner, repo):
    url = f"https://api.github.com/repos/{owner}/{repo}/commits"
    try:
        # 请求最近的 commits
        response = requests.get(url, headers=HEADERS)
        response.raise_for_status()
        commits = response.json()
        
        if commits:
            # 提取最新commit的日期
            last_commit_date = commits[0]['commit']['committer']['date']
            return last_commit_date[:10]  # 仅保留 YYYY-MM-DD 格式
        else:
            print(f"No commits found for repository: {owner}/{repo}")
            return "0000-00-00"
    except requests.exceptions.RequestException as e:
        print(f"Error fetching data for {owner}/{repo}: {e}")
        return "0000-00-00"

# 打开输出文件
with open(output_file, mode="w", newline="") as outfile:
    writer = csv.writer(outfile)
    writer.writerow(["login", "repo", "last_commit_date"])

    # 读取输入文件
    with open(input_file, mode="r") as infile:
        reader = csv.reader(infile)
        next(reader)  # 跳过表头

        for row in reader:
            owner, repo = row[0], row[1]
            last_commit_date = get_last_commit_date(owner, repo)
            
            # 将结果写入文件和打印
            writer.writerow([owner, repo, last_commit_date])
            print(f"{owner}/{repo} - Last Commit Date: {last_commit_date}")
            
            # 避免 API 速率限制
            time.sleep(1)  # 每次请求后等待1秒钟
