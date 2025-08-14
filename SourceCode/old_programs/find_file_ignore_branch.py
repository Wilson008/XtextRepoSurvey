from github import Github

# 设置参数
owner = "RomainLefeuvre"
repo_name = "xtextHW"
access_token = "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"

def list_all_files(repo):
    files = []
    contents = repo.get_contents("")
    while contents:
        file_content = contents.pop(0)
        if file_content.type == "dir":
            contents.extend(repo.get_contents(file_content.path))
        else:
            files.append(file_content.path)
    return files

def main():
    # 使用访问令牌进行身份验证
    g = Github(access_token)

    # 获取仓库
    repo = g.get_repo(f"{owner}/{repo_name}")

    # 获取仓库中的所有文件列表
    all_files = list_all_files(repo)

    # 打印文件名（包括路径）
    for file in all_files:
        print(file)

if __name__ == "__main__":
    main()
