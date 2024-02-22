import csv
import requests
import time

# 设置 GitHub Token
token = "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"

# 定义输入和输出文件名
input_csv = "search_results_files_without_duplicate.csv"
output_csv = "query_ecore.csv"

# 打开输出文件并设置 CSV 写入器
with open(output_csv, 'w', newline='', encoding='utf-8') as output_file:
    fieldnames = ['repo_owner_login', 'repo_name', 'repo_url', 'ecore_file_name', 'ecore_folder_name']
    writer = csv.DictWriter(output_file, fieldnames=fieldnames)
    writer.writeheader()

    # 打开输入文件并设置 CSV 读取器
    with open(input_csv, newline='', encoding='utf-8') as input_file:
        reader = csv.DictReader(input_file)
        for row in reader:
            print("Waiting for 2 seconds.")
            # 暂停 2 秒
            time.sleep(2)

            # 提取存储库的所有者的登录名和存储库的名称
            owner_login = row['Owner Login']
            repo_name = row['Repository Name']
            repo_url = row['Repository URL']
            
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
                # 解析响应 JSON 数据
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

                    # 写入 CSV 文件
                    writer.writerow({
                        'repo_owner_login': owner_login,
                        'repo_name': repo_name,
                        'repo_url': repo_url,
                        'ecore_file_name': ecore_file_name,
                        'ecore_folder_name': ecore_folder_name
                    })
            else:
                # 写入 CSV 文件
                writer.writerow({
                    'repo_owner_login': owner_login,
                    'repo_name': repo_name,
                    'repo_url': repo_url,
                    'ecore_file_name': "null",
                    'ecore_folder_name': "null"
                })
                # 输出错误信息
                print(f"Error fetching repository {owner_login}/{repo_name}: {response.status_code}")
