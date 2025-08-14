import os
import subprocess
import csv

# 定义本地存储库的根目录
repos_root = r'E:\xtext_repos_clone_new'

# 打开文件以读取owner、repo和文件扩展名
with open(r'SourceCode\\manual_analysis_results\\mwe2_and_extensions.csv', 'r') as file:
    reader = csv.reader(file)
    next(reader)  # 跳过标题行
    for row in reader:
        owner = row[0]
        repo = row[1]
        extensions_str = row[3].strip()
        extensions = extensions_str.split(',') if extensions_str else []

        print(f"Extensions: {extensions}")  # 打印获取到的扩展名

        # 构建本地存储库的路径
        local_repo_name = f'{owner}_{repo}'
        repo_path = os.path.join(repos_root, local_repo_name)

        # 初始化总文件数和总提交次数
        total_files = 0
        total_commits = 0

        # 遍历repo_path下的所有文件和文件夹
        for root, dirs, files in os.walk(repo_path):
            # 排除.git文件夹
            dirs[:] = [d for d in dirs if d != '.git']

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
        average_commits = round(total_commits / total_files, 2) if total_files != 0 else 0

        # 打印总文件数、总提交次数和平均提交次数
        print(f"\nTotal Files: {total_files}")
        print(f"Total Commits: {total_commits}")
        print(f"Average Commits per File: {average_commits}")

        # 写入到CSV文件中
        with open('SourceCode/found_instances_and_commits.csv', 'a', newline='') as csvfile:
            csv_writer = csv.writer(csvfile)
            csv_writer.writerow([owner, repo, total_files, total_commits, average_commits])
