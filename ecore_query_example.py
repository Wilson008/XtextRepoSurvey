import requests

# 设置 GitHub Token
token = "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"

# 设置存储库的所有者的登录名和存储库的名称
owner_login = "rquinio"
repo_name = "ck2xtext"

# 设置请求头
headers = {
    "Accept": "application/vnd.github.v3+json",
    "Authorization": f"Bearer {token}",
    "X-GitHub-Api-Version": "2022-11-28"
}

# 设置查询参数
params = {
    "q": f"extension:ecore repo:{owner_login}/{repo_name}",
    "per_page": 100  # 设置每页返回的结果数量
}

# 发送 GET 请求
response = requests.get("https://api.github.com/search/code", headers=headers, params=params)

# 检查响应状态码
if response.status_code == 200:
    # 解析响应JSON数据
    data = response.json()
    # 遍历每个搜索结果
    for item in data.get('items', []):
        # 提取文件名和文件路径
        ecore_file_name = item.get('name')
        if item.get('path'):
            ecore_folder_name = item.get('path').split('/')[-2]  # 获取文件夹的倒数第二个元素，即包含文件的文件夹名
        else:
            ecore_folder_name = "Unknown"  # 如果路径为空，则将文件夹名设置为Unknown或其他适当的值
        print(f"Ecore File Name: {ecore_file_name}, Ecore Folder Name: {ecore_folder_name}")
else:
    # 输出错误信息
    print(f"Error fetching repository {owner_login}/{repo_name}: {response.status_code}")
