import os
import zipfile
import csv

def find_xtext_files_from_zip(repo_name):
    repo_zip_path = f"E:\\xtext_repositories\\{repo_name}.zip"
    xtext_files = []

    if os.path.exists(repo_zip_path):
        with zipfile.ZipFile(repo_zip_path, 'r') as zip_ref:
            for file_name in zip_ref.namelist():
                if file_name.endswith('.xtext'):
                    xtext_files.append(file_name)
        
        if xtext_files:
            return xtext_files
        else:
            return []
    else:
        print(f"Zip file for repository {repo_name} not found.")
        return []

def write_to_csv(file_path, data, header):
    with open(file_path, 'w', newline='', encoding='utf-8') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(header)
        for row in data:
            writer.writerow(row)

def main():
    # 读取 count_xtext_in_repos.csv 文件
    count_xtext_data = []
    with open('analysis_results/count_xtext_in_repos.csv', 'r', newline='', encoding='utf-8') as csvfile:
        reader = csv.reader(csvfile)
        header = next(reader)  # 读取第一行作为 header
        for row in reader:
            count_xtext_data.append(row)
    
    # 处理每一行数据
    find_xtext_addition_data = []
    count_xtext_repair_data = []
    for row in count_xtext_data:
        owner_login = row[0]
        repo_name = row[1]
        xtext_count = row[2]

        if xtext_count == 'failed':
            # 在 E:\xtext_repositories 中查找同名的 zip 文件并搜索 xtext 文件
            xtext_files = find_xtext_files_from_zip(repo_name)
            if xtext_files:
                # 将找到的 xtext 文件添加到 find_xtext_in_repo_addition.csv
                for file_name in xtext_files:
                    find_xtext_addition_data.append([owner_login, repo_name, file_name])
                # 将找到的 xtext 文件个数添加到 count_xtext_in_repo_repair.csv
                count_xtext_repair_data.append([owner_login, repo_name, len(xtext_files)])
            else:
                print(f"No XText files found in {repo_name}.zip.")
                # 对于找不到 xtext 文件的情况，填写为 0
                count_xtext_repair_data.append([owner_login, repo_name, 0])
        else:
            # 将已有的 xtext 文件个数添加到 count_xtext_in_repo_repair.csv
            count_xtext_repair_data.append([owner_login, repo_name, xtext_count])
    
    # 写入 find_xtext_in_repo_addition.csv
    find_xtext_addition_header = ['Owner Login', 'Repo Name', 'XText File Path']
    write_to_csv('find_xtext_in_repo_addition.csv', find_xtext_addition_data, find_xtext_addition_header)
    
    # 写入 count_xtext_in_repo_repair.csv
    count_xtext_repair_header = ['Owner Login', 'Repo Name', 'XText File Count']
    write_to_csv('count_xtext_in_repo_repair.csv', count_xtext_repair_data, count_xtext_repair_header)

if __name__ == "__main__":
    main()
