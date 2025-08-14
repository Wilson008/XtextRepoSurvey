import os
import subprocess

# 定义远程repo的owner和repo的name
remote_owner = 'atanaka'
remote_repo = 'experimental-rmodp-dsl'

# 根据远程repo的owner和repo的name拼接成本地repo的名称
local_repo_name = f'{remote_owner}_{remote_repo}'
repo_path = rf'E:\xtext_repos_clone_new\{local_repo_name}'

# 定义要查找的文件扩展名列表
extensions = ['ecore']

# 初始化总文件数和总提交次数
total_files = 0
total_commits = 0

# 遍历repo_path下的所有文件和文件夹
for root, dirs, files in os.walk(repo_path):
    # 遍历当前文件夹下的所有文件
    for file in files:
        # 获取文件的扩展名
        file_extension = file.split('.')[-1]
        # 如果文件扩展名在目标扩展名列表中，则打印文件路径和提交次数
        if file_extension in extensions:
            file_path = os.path.join(root, file)
            # 获取文件的提交次数
            commit_count = subprocess.check_output(['git', 'log', '--oneline', '--', file_path], cwd=repo_path, encoding='utf-8')
            commit_count = len(commit_count.splitlines()) if commit_count else 0
            print(f"File: {file_path}, Commit Count: {commit_count}")
            # 更新总文件数和总提交次数
            total_files += 1
            total_commits += commit_count

# 计算平均提交次数
average_commits = total_commits / total_files if total_files != 0 else 0

# 打印总文件数、总提交次数和平均提交次数
print(f"\nTotal Files: {total_files}")
print(f"Total Commits: {total_commits}")
print(f"Average Commits per File: {average_commits}")
