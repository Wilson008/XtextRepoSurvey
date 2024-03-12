import csv
import os
from git import Repo

def list_xtext_files_with_commit_count(repo_path):
    xtext_files = []
    total_commit_count = 0
    total_files = 0

    for root, dirs, files in os.walk(repo_path):
        for file in files:
            if file.endswith(".xtext"):
                file_path = os.path.join(root, file)
                xtext_files.append(file_path)
                commit_count = get_commit_count(file_path)
                print(f"文件 '{file_path}' 的提交次数为: {commit_count}")
                total_commit_count += commit_count
                total_files += 1
    
    print("总文件数:", total_files)
    print("总提交次数:", total_commit_count)
    average_commit_count = total_commit_count / total_files if total_files > 0 else 0
    print("平均提交次数: {:.2f}".format(average_commit_count))
    
    return xtext_files, total_commit_count, total_files, average_commit_count

def get_commit_count(file_path):
    repo = Repo(file_path, search_parent_directories=True)
    commits = list(repo.iter_commits(paths=file_path))
    return len(commits)

# if __name__ == "__main__":
#     repo_path = r"E:\xtext_repos_clone_new\0xMYsteRy_Xtext"
if __name__ == "__main__":
    owner = "zrrk"
    repo = "xtext-utils.uml"
    repo_name = f"{owner}_{repo}"
    repo_path = os.path.join(r"E:\xtext_repos_clone_new", repo_name)
    xtext_files, total_commit_count, total_files, average_commit_count = list_xtext_files_with_commit_count(repo_path)
    if not xtext_files:
        print("该本地仓库中没有找到任何扩展名为 .xtext 的文件。")

    # 将结果写入CSV文件
    with open("xtext_commit_count_by_clone.csv", "w", newline="") as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(["repo_name", "total_files", "total_commit_count", "average_commit_count"])
        writer.writerow(["0xMYsteRy_Xtext", total_files, total_commit_count, average_commit_count])