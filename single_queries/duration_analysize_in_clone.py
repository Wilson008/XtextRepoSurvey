import os
from git import Repo
from datetime import datetime
import csv

def get_commit_dates(repo_path, file_path):
    repo = Repo(repo_path)
    first_commit = None
    last_commit = None

    # 遍历文件的提交历史
    for commit in repo.iter_commits(paths=file_path):
        commit_time = commit.committed_datetime
        if not first_commit or commit_time < first_commit:
            first_commit = commit_time
        if not last_commit or commit_time > last_commit:
            last_commit = commit_time
    
    return first_commit, last_commit

def find_xtext_files_with_commit_dates(directory):
    xtext_files = []
    for root, dirs, files in os.walk(directory):
        for file in files:
            if file.endswith('.xtext'):
                xtext_files.append(os.path.join(root, file))
    return xtext_files

# 设置参数
owner = "altran-mde"
repo_name = "xtext-sirius-integration"
local_repo_folder = r"E:\xtext_repos_clone_new"

# 构造本地存储库的名字字符串
local_repo_name = f"{owner}_{repo_name}"
# 构建本地存储库的完整路径
local_repo_path = os.path.join(local_repo_folder, local_repo_name)

# 检查本地存储库是否存在
if not os.path.exists(local_repo_path):
    print(f"本地存储库 '{local_repo_name}' 不存在于路径 '{local_repo_folder}' 中。")
else:
    # 查找并打印扩展名为".xtext"的文件名以及提交时间
    xtext_files = find_xtext_files_with_commit_dates(local_repo_path)
    if xtext_files:
        print(f"找到以下扩展名为'.xtext'的文件：")
        xtext_first_commits = []
        xtext_last_commits = []
        for file in xtext_files:
            first_commit, last_commit = get_commit_dates(local_repo_path, file)
            xtext_first_commits.append(first_commit)
            xtext_last_commits.append(last_commit)
            print(f"文件: {file}, 第一次提交时间: {first_commit.strftime('%Y-%m-%d %H:%M:%S')}, 最后一次提交时间: {last_commit.strftime('%Y-%m-%d %H:%M:%S')}")

        # 找到存储库的第一个commit时间和最后一个commit时间
        repo = Repo(local_repo_path)
        first_commit_repo = list(repo.iter_commits())[-1].committed_datetime
        last_commit_repo = repo.head.commit.committed_datetime

        # 计算时间差
        repo_duration_days = (last_commit_repo - first_commit_repo).days
        xtext_duration_days = (max(xtext_last_commits) - min(xtext_first_commits)).days

        # 计算比例
        repo_to_xtext_ratio = round((xtext_duration_days / repo_duration_days) * 100, 2)

        # 写入CSV文件
        csv_file_path = "xtext_duration_analysis.csv"
        with open(csv_file_path, mode='w', newline='') as csv_file:
            writer = csv.writer(csv_file)
            writer.writerow(['owner', 'repo', 'repo_first_commit', 'repo_last_commit', 'xtext_first_commit', 'xtext_last_commit', 'repo_commit_duration', 'xtext_commit_duration', 'proportion'])
            writer.writerow([owner, repo_name, first_commit_repo.strftime('%Y-%m-%d %H:%M:%S'), last_commit_repo.strftime('%Y-%m-%d %H:%M:%S'), min(xtext_first_commits).strftime('%Y-%m-%d %H:%M:%S'), max(xtext_last_commits).strftime('%Y-%m-%d %H:%M:%S'), repo_duration_days, xtext_duration_days, repo_to_xtext_ratio])
        
        print(f"\n结果已写入文件 '{csv_file_path}'")
        print(f"存储库 '{repo_name}' 的第一个commit时间为: {first_commit_repo.strftime('%Y-%m-%d %H:%M:%S')}")
        print(f"存储库 '{repo_name}' 的最后一个commit时间为: {last_commit_repo.strftime('%Y-%m-%d %H:%M:%S')}")
        print(f"存储库 '{repo_name}' 的第一个commit和最后一个commit相差 {repo_duration_days} 天")
        print(f"xtext文件的第一个commit时间中最早的为: {min(xtext_first_commits).strftime('%Y-%m-%d %H:%M:%S')}")
        print(f"xtext文件的最后一个commit时间中最晚的为: {max(xtext_last_commits).strftime('%Y-%m-%d %H:%M:%S')}")
        print(f"xtext文件的第一个commit时间中最早的和最后一个commit时间中最晚的相差 {xtext_duration_days} 天")
        print(f"在存储库 '{repo_name}' 中，xtext文件的第一个commit时间中最早的和最后一个commit时间中最晚的相差时间占存储库的第一个commit和最后一个commit相差时间的比例为: {repo_to_xtext_ratio}%")
    else:
        print("未找到扩展名为'.xtext'的文件。")
