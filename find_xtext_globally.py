import requests

def search_global_xtext_files(min_size_kb=15, token='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'):
    headers = {
        'Authorization': f'token {token}',
        'Accept': 'application/vnd.github.v3+json'
    }

    files = []

    # 构造全局搜索 xtext 文件的 API 请求
    url = f'https://api.github.com/search/code?q=extension:xtext+size:>{min_size_kb}kb'

    try:
        # 发送 GET 请求
        response = requests.get(url, headers=headers)
        response.raise_for_status()  # 检查是否有错误发生

        data = response.json()

        # 遍历每个搜索结果
        for item in data['items']:
            file_info = {
                'repository': item['repository']['full_name'],
                'file_name': item['name'],
                'size_kb': item['size'] / 1024  # 将文件大小从字节转换为KB
            }
            files.append(file_info)

    except requests.exceptions.RequestException as e:
        print('Error:', e)

    return files

def main():
    min_size_kb = 15  # 最小文件大小（KB）
    token = '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'  # 你的 GitHub 访问令牌

    xtext_files = search_global_xtext_files(min_size_kb, token)

    print(f"Xtext files with size > {min_size_kb}KB found in GitHub:")
    for file_info in xtext_files:
        print(f"Repository: {file_info['repository']}, File: {file_info['file_name']}, Size: {file_info['size_kb']} KB")

if __name__ == "__main__":
    main()
