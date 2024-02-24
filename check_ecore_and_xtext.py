import requests
import time

def search_files_in_repo(owner, repo):
    headers = {
        'Authorization': 'token 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'
    }

    # 查询 ecore 文件
    ecore_files = {}
    ecore_folders = set()

    # 构造查询 ecore 文件的 API 请求
    ecore_url = f'https://api.github.com/search/code?q=extension:ecore+repo:{owner}/{repo}'

    try:
        # 发送 GET 请求
        response = requests.get(ecore_url, headers=headers)
        response.raise_for_status()  # 检查是否有错误发生

        data = response.json()

        for item in data['items']:
            file_name = item['name']
            file_path = item['path']
            ecore_files[file_name] = file_path
            ecore_folders.add(file_path.split('/')[-2])  # 提取文件夹名称

        # 间隔2秒
        time.sleep(2)

    except requests.exceptions.RequestException as e:
        print('Error:', e)

    # 查询 xtext 文件
    xtext_files = {}
    xtext_folders = set()

    # 构造查询 xtext 文件的 API 请求
    xtext_url = f'https://api.github.com/search/code?q=extension:xtext+repo:{owner}/{repo}'

    try:
        # 发送 GET 请求
        response = requests.get(xtext_url, headers=headers)
        response.raise_for_status()  # 检查是否有错误发生

        data = response.json()

        for item in data['items']:
            file_name = item['name']
            file_path = item['path']
            xtext_files[file_name] = file_path
            xtext_folders.add(file_path.split('/')[-2])  # 提取文件夹名称

        # 间隔2秒
        time.sleep(2)

    except requests.exceptions.RequestException as e:
        print('Error:', e)

    return ecore_files, ecore_folders, xtext_files, xtext_folders

def main():
    owner = 'TypeFox'  # 替换为指定的 owner 名称
    repo = 'theia-xtext-sprotty-example'    # 替换为指定的存储库名称

    ecore_files, ecore_folders, xtext_files, xtext_folders = search_files_in_repo(owner, repo)

    print("Ecore Files:")
    for file_name, file_path in ecore_files.items():
        print(f"{file_name} - {file_path}")

    print("\nEcore Folders:")
    for folder in ecore_folders:
        print(folder)

    print("\nXtext Files:")
    for file_name, file_path in xtext_files.items():
        print(f"{file_name} - {file_path}")

    print("\nXtext Folders:")
    for folder in xtext_folders:
        print(folder)

if __name__ == "__main__":
    main()
