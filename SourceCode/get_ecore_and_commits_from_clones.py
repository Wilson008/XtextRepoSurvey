import os
from git import Repo
import csv
import pandas as pd

def list_ecore_files_with_commit_count(repo_path):
    ecore_files = []
    total_commit_count = 0
    total_files = 0

    for root, dirs, files in os.walk(repo_path):
        for file in files:
            if file.endswith(".ecore"):
                file_path = os.path.join(root, file)
                ecore_files.append(file_path)
                commit_count = get_commit_count(file_path)
                total_commit_count += commit_count
                total_files += 1
    
    average_commit_count = total_commit_count / total_files if total_files > 0 else 0
    
    return total_files, total_commit_count, average_commit_count

def get_commit_count(file_path):
    try:
        repo = Repo(file_path, search_parent_directories=True)
        commits = list(repo.iter_commits(paths=file_path))
    except Exception as e:
        print(f"An error occurred while getting commit count for {file_path}: {e}")
        return 0
    return len(commits)

if __name__ == "__main__":
    # 读取Excel文件
    excel_file = r"manual_analysis_results\analyze_ecore_xtext_files.xlsx"
    df = pd.read_excel(excel_file)
    
    # 打开CSV文件准备写入
    with open("ecore_commits_count_by_clones.csv", "w", newline="") as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(["owner", "repo", "total_files", "total_commit_count", "average_commit_count"])

        # 遍历每行数据
        for index, row in df.iterrows():
            owner = row["Owner Login"]
            repo = row["Repository Name"]
            repo_name = f"{owner}_{repo}"
            print(f"Querying {owner}'s local repo: {repo}...")
            repo_path = os.path.join(r"E:\xtext_repos_clone_new", repo_name)
            
            # 查询本地仓库中的ecore文件及其提交次数信息
            total_files, total_commit_count, average_commit_count = list_ecore_files_with_commit_count(repo_path)
            
            # 将结果写入CSV文件
            writer.writerow([owner, repo, total_files, total_commit_count, average_commit_count])
