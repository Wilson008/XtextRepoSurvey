import os
import subprocess

# GitHub 仓库信息
owner_name = 'altran-mde'
repo_name = 'xtext-sirius-integration'

# 本地存储库路径
local_repo_path = f'E:\\xtext_repos_clone_new\\{owner_name}_{repo_name}'

# 存储行数差值的列表
lines_differences = []

# 遍历本地存储库文件
for root, dirs, files in os.walk(local_repo_path):
    for file_name in files:
        if file_name.endswith('.xtext'):
            file_path = os.path.join(root, file_name)
            print(f"Found .xtext file: {file_path}")

            # 获取第一次 commit 时的文本行数
            first_commit_cmd = f'git log --reverse --format=format: --numstat -- {file_path}'
            first_commit_output = subprocess.check_output(first_commit_cmd, cwd=local_repo_path, shell=True).decode()
            first_commit_lines = sum(int(line.split('\t')[0]) for line in first_commit_output.splitlines() if line)

            # 获取最后一次 commit 时的文本行数
            try:
                with open(file_path, 'r', encoding='utf-8') as file:
                    last_commit_lines = len(file.readlines())
            except Exception as e:
                print(f"Error occurred while reading file {file_path}: {e}")
                last_commit_lines = 0

            print(f"First commit lines: {first_commit_lines}")
            print(f"Last commit lines: {last_commit_lines}")

            # 计算行数差值
            lines_difference = last_commit_lines - first_commit_lines
            print(f"Lines difference: {lines_difference}")

            # 将行数差值添加到列表中
            lines_differences.append(lines_difference)

            print()  # 打印空行分隔每个文件的信息

# 计算平均值
average_difference = sum(lines_differences) / len(lines_differences) if lines_differences else 0
print(f"Average lines difference: {average_difference}")
