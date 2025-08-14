import os
import csv
import subprocess
import sys
from datetime import datetime

# 设置目录路径
repo_base_path = "E:/xtext_repos_clone_new"  # 替换为本地存储库的根路径
analysis_results_path = "SourceCode/manual_analysis_results/mwe2_and_extensions.csv"
output_csv_path = "SourceCode/file_commit_message.csv"

def load_extension_data(file_path):
    """从mwe2_and_extensions.csv中加载扩展名信息。"""
    extension_data = {}
    with open(file_path, mode="r", encoding="utf-8") as file:
        reader = csv.reader(file)
        next(reader)  # 跳过标题行
        for row in reader:
            login, repo_name = row[0], row[1]
            extensions = row[3].split() if len(row) > 3 and row[3] else []
            extension_data[f"{login}_{repo_name}"] = extensions
    return extension_data

def find_files_with_commit_messages(repo_path, extensions):
    """找到符合条件的文件，并获取其提交信息。"""
    results = []
    for root, _, files in os.walk(repo_path):
        # 检查路径中是否包含“bin”或“src-bin”
        if "bin" in root or "src-bin" in root:
            continue
        for file_name in files:
            # 获取文件扩展名
            ext = os.path.splitext(file_name)[1][1:]
            # 第一步：查找 .ecore 和 .xtext 文件
            if ext in {"ecore", "xtext"}:
                file_path = os.path.join(root, file_name)
                print(f"Found file: {file_path}")  # 打印找到的文件
                results.append((file_path, get_commit_messages(repo_path, file_path)))
            # 第三步：查找其他扩展名文件
            elif ext in extensions:
                file_path = os.path.join(root, file_name)
                print(f"Found file: {file_path}")  # 打印找到的文件
                results.append((file_path, get_commit_messages(repo_path, file_path)))
    return results

def get_commit_hashes(repo_path, file_path):
    """获取文件的所有 commit 哈希值。"""
    relative_path = os.path.relpath(file_path, repo_path)
    try:
        commit_hashes = subprocess.check_output(
            ["git", "-C", repo_path, "log", "--pretty=format:%H", "--", relative_path],
            stderr=subprocess.STDOUT,
            universal_newlines=True
        )
        return commit_hashes.splitlines()
    except subprocess.CalledProcessError as e:
        print(f"Error retrieving commit hashes for {file_path}: {e.output}")
        return []


def get_commit_message(repo_path, commit_hash):
    """使用git命令获取指定commit hash的提交信息和时间。"""
    try:
        # 获取commit时间和message
        commit_info = subprocess.check_output(
            ["git", "-C", repo_path, "log", "-1", "--pretty=format:%cI %s", commit_hash],
            stderr=subprocess.STDOUT,
            encoding="utf-8"  # 确保编码正确处理
        )
        # commit_info前面的时间格式化为 "[时间] message" 形式
        commit_time, commit_message = commit_info.split(" ", 1)
        formatted_message = f"[{commit_time}] {commit_message}"
        return formatted_message
    except subprocess.CalledProcessError as e:
        print(f"Error retrieving commit message for {commit_hash}: {e.output}")
        return ""

def get_commit_messages(repo_path, file_path):
    """获取文件的所有 commit message，按时间顺序（从最早到最新）返回一个列表。"""
    commit_messages = []
    commit_hashes = get_commit_hashes(repo_path, file_path)
    print(f"Starting commit message retrieval for {file_path} with {len(commit_hashes)} commits.")
    
    # 将 commit_hashes 列表反转，使其按时间从最早到最新排序
    commit_hashes.reverse()
    
    for commit_hash in commit_hashes:
        commit_message = get_commit_message(repo_path, commit_hash)
        commit_messages.append(commit_message)
    
    print(f"Finished commit message retrieval for {file_path}")
    return commit_messages

def main(login, repo_name):
    # 加载扩展名数据
    extension_data = load_extension_data(analysis_results_path)
    
    # 组合成文件夹名称，查找路径
    repo_folder = f"{login}_{repo_name}"
    repo_path = os.path.join(repo_base_path, repo_folder)
    
    if not os.path.isdir(repo_path):
        print(f"Repository folder {repo_folder} does not exist.")
        return

    # 获取repo的扩展名
    extensions = extension_data.get(f"{login}_{repo_name}", [])
    
    # 准备写入CSV文件
    with open(output_csv_path, mode="a", encoding="utf-8", newline="") as csvfile:
        writer = csv.writer(csvfile)
        # 如果文件是新创建的，才写入标题行
        if os.stat(output_csv_path).st_size == 0:
            writer.writerow(["login", "repo_name", "file_path", "commit_message"])  # 写入标题行

        # 查找并记录文件路径及其提交消息
        for file_path, commit_messages in find_files_with_commit_messages(repo_path, extensions):
            # 将login、repo_name、file_path和每次commit message按列顺序写入
            row = [login, repo_name, file_path] + commit_messages
            writer.writerow(row)

    print(f"Results have been written to {output_csv_path}")

if __name__ == "__main__":

    # login = "fedorov-vk"
    # repo_name = "apds_dsl"
    # main(login, repo_name)

    #CSV文件路径
    repos_csv_file = "SourceCode/Benchmarks_Order_Repos_Language.csv"
    
    # 循环读取CSV文件中的login和repo_name，逐行调用main
    with open(repos_csv_file, mode="r", encoding="utf-8") as file:
        reader = csv.reader(file)
        next(reader)  # 跳过表头
        for row in reader:
            login, repo_name = row[0], row[1]
            print(f"Start searching in {login}/{repo_name}...")
            main(login, repo_name)