import requests

# 设置 GitHub Access Token
access_token = "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"

# 指定 repo 的 owner 和 name
owner = "altran-mde"
repo_name = "xtext-sirius-integration"

# 要查询的文件扩展名
extension = "reflang"

# 构建 API 请求 URL
url = f'https://api.github.com/repos/{owner}/{repo_name}/git/trees/master?recursive=1'

# 设置请求头，包含 GitHub Access Token
headers = {"Authorization": f"token {access_token}"}

# 发送 GET 请求
response = requests.get(url, headers=headers)

# 检查响应状态码
if response.status_code == 200:
    # 解析 JSON 响应
    data = response.json()
    # 初始化文件个数
    file_count = 0
    # 遍历文件列表
    for item in data['tree']:
        # 如果是文件且扩展名符合条件
        if item['type'] == 'blob' and item['path'].endswith(f".{extension}"):
            # 打印文件路径
            print(item['path'])
            # 文件个数加一
            file_count += 1
    # 打印找到的文件个数
    print(f"Found {file_count} files with extension '.{extension}'.")
else:
    print("Failed to fetch data from GitHub API.")
