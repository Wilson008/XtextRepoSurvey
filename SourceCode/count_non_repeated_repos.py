import pandas as pd

def count_unique_repos(file_path):
    # 读取 Excel 文件
    data = pd.read_excel(file_path, engine='openpyxl')

    # 去掉重复的存储库，仅基于 login 和 repo_name 列
    unique_repos = data[['login', 'repo_name']].drop_duplicates()

    # 计算唯一的存储库数量
    total_repos = len(unique_repos)

    # 打印结果和部分示例
    print(f"总共有 {total_repos} 个唯一的 repo。")
    print("示例存储库：")
    print(unique_repos.head())  # 打印前几行示例

# 文件路径
file_path = "SourceCode/temp_input_1.xlsx"
count_unique_repos(file_path)
