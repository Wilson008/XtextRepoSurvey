from github import Github
import requests

def get_commit_count(owner, repo, file_path, access_token):
    headers = {
        "Authorization": f"token {access_token}",
        "Accept": "application/vnd.github.v3+json"
    }

    commits_url = f"https://api.github.com/repos/{owner}/{repo}/commits?path={file_path}"
    response = requests.get(commits_url, headers=headers)
    response.raise_for_status()
    commit_count = len(response.json())
    print(f"文件 '{file_path}' 的提交次数为: {commit_count}")
    return commit_count

def get_default_branch(repo):
    g = Github(access_token)
    repo = g.get_repo(f"{owner}/{repo}")
    return repo.default_branch

def get_files_with_extensions(owner, repo, file_extensions, access_token):
    # 获取仓库的默认分支名
    default_branch = get_default_branch(repo)

    headers = {
        "Authorization": f"token {access_token}",
        "Accept": "application/vnd.github.v3+json"
    }

    # 递归地获取所有文件和文件夹信息
    def get_tree_recursive(tree_url):
        response = requests.get(tree_url, headers=headers)
        response.raise_for_status()
        tree_info = response.json()["tree"]
        for item in tree_info:
            if item["type"] == "blob" and any(item["path"].endswith(ext) for ext in file_extensions):
                yield item["path"]

    # 获取仓库的根目录树信息
    tree_url = f"https://api.github.com/repos/{owner}/{repo}/git/trees/{default_branch}?recursive=1"
    printed_files = set()  # 记录已打印的文件路径
    for file_path in get_tree_recursive(tree_url):
        if file_path not in printed_files:
            printed_files.add(file_path)
            yield file_path

# 设置参数
owner = "RomainLefeuvre"
repo = "xtextHW"
file_extensions = "xtext"  # 不同的扩展名以逗号分隔
access_token = "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"

total_commit_count = 0
total_files = 0

# 将字符串转换为列表
file_extensions_list = file_extensions.split(',')

# 获取并打印符合条件的文件列表及其提交次数
print(f"仓库 '{owner}/{repo}' 中的指定扩展名的文件:")
for file_path in get_files_with_extensions(owner, repo, file_extensions_list, access_token):
    commit_count = get_commit_count(owner, repo, file_path, access_token)
    total_commit_count += commit_count
    total_files += 1

# 打印总文件数
print("总文件数:", total_files)

# 打印总提交次数
print("总提交次数:", total_commit_count)

# 计算并打印平均提交次数
average_commit_count = total_commit_count / total_files if total_files > 0 else 0
print("平均提交次数: {:.2f}".format(average_commit_count))
