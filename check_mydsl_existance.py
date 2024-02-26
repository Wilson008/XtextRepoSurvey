import os
import pandas as pd
import glob
import zipfile
import re
import csv

def find_new_file_extension(zip_file):
    extensions = set()
    with zipfile.ZipFile(zip_file, 'r') as zf:
        for file_info in zf.infolist():
            if file_info.filename.endswith('.mwe2'):
                with zf.open(file_info) as f:
                    content = f.read().decode('utf-8')
                    match = re.search(r'fileExtensions\s*=\s*"(.+?)"', content)
                    if match:
                        extensions.update(match.group(1).split(','))
    return extensions

def check_file_existence(zip_file, filename):
    try:
        with zipfile.ZipFile(zip_file, 'r') as zf:
            for file_info in zf.infolist():
                if file_info.filename == filename:
                    return True
    except zipfile.BadZipFile:
        pass
    return False

def process_repositories(repository_file, repository_folder, output_file):
    df = pd.read_excel(repository_file)
    with open(output_file, 'w', newline='', encoding='utf-8') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(['Owner', 'Repository', 'Xtext Existence', 'Mwe2 Existence', 'New File Existence'])

        for index, row in df.iterrows():
            owner = row.iloc[0]
            repository_name = row.iloc[1]

            zip_files = glob.glob(os.path.join(repository_folder, f"{repository_name}.zip"))

            xtext_existence = 'NO'
            mwe2_existence = 'NO'
            new_file_existence = 'NO'

            if zip_files:
                zip_file = zip_files[0]
                print(f"Checking {zip_file}")

                with zipfile.ZipFile(zip_file, 'r') as zf:
                    if any(file.endswith('.xtext') for file in zf.namelist()):
                        xtext_existence = 'YES'

                    if any(file.endswith('.mwe2') for file in zf.namelist()):
                        mwe2_existence = 'YES'
                        mwe2_extensions = find_new_file_extension(zip_file)
                        if mwe2_extensions:
                            new_files = [os.path.splitext(file)[0] + extension for extension in mwe2_extensions for file in zf.namelist()]
                            new_file_existence = 'YES' if any(check_file_existence(zip_file, filename) for filename in new_files) else 'NO'

            writer.writerow([owner, repository_name, xtext_existence, mwe2_existence, new_file_existence])

# 指定存储库信息文件路径
repository_file_path = 'analysis_results/analyze_ecore_xtext_files.xlsx'

# 指定存储库所在文件夹路径
repository_folder_path = 'E:/xtext_repositories'

# 指定输出文件路径
output_file_path = 'file_existence_results.csv'

# 处理存储库信息并将结果写入CSV文件
process_repositories(repository_file_path, repository_folder_path, output_file_path)
