import os
import csv
import glob
import zipfile

def check_extension_files(repository_csv, repository_folder, output_csv):
    # 读取原始存储库信息文件
    with open(repository_csv, 'r', newline='', encoding='utf-8') as csvfile:
        reader = csv.reader(csvfile)
        next(reader)  # 跳过标题行
        data = list(reader)

    # 创建新的CSV文件并写入标题行
    with open(output_csv, 'w', newline='', encoding='utf-8') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(['Owner', 'Repository', 'Contains New Extensions'])

        # 逐行处理原始数据
        for row in data:
            owner_login = row[0]
            repository_name = row[1]
            extensions = row[3].split(',') if ',' in row[3] else [row[3]]

            print(f"Analyzing repository: {owner_login}/{repository_name}")

            # 检查存储库对应的zip文件中是否包含给定扩展名的文件
            zip_files = glob.glob(os.path.join(repository_folder, f"{repository_name}.zip"))

            if zip_files:
                if len(zip_files) > 1:
                    # 多个同名的zip文件，返回问号
                    contains_extensions = '?'
                else:
                    zip_file = zip_files[0]
                    contains_extensions = check_zip_file_for_extensions(zip_file, extensions)
            else:
                # 没有对应的zip文件
                contains_extensions = 'NO'

            # 写入结果到新的CSV文件
            writer.writerow([owner_login, repository_name, contains_extensions])

def check_zip_file_for_extensions(zip_file, extensions):
    with zipfile.ZipFile(zip_file, 'r') as zf:
        for extension in extensions:
            for file_info in zf.infolist():
                if file_info.filename.endswith(f".{extension.strip()}"):
                    return 'YES'
        return 'NO'

# 指定原始存储库信息文件路径
repository_csv = 'mwe2_extension_results.csv'

# 指定存储库所在文件夹路径
repository_folder = 'E:/xtext_repositories'

# 指定输出文件路径
output_csv = 'mydsl_existance.csv'

# 执行检查扩展名文件是否存在的逻辑
check_extension_files(repository_csv, repository_folder, output_csv)
