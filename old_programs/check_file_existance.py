import os
import glob
import zipfile
import pandas as pd
import csv

def check_zip_for_extensions(zip_file, extensions):
    try:
        with zipfile.ZipFile(zip_file, 'r') as zf:
            files_found = {ext: False for ext in extensions}
            for file_info in zf.infolist():
                for ext in extensions:
                    if file_info.filename.endswith(ext):
                        files_found[ext] = True
            return any(files_found.values())
    except zipfile.BadZipFile:
        return False

def process_repositories(repository_file, repository_folder, output_file):
    df = pd.read_excel(repository_file)
    with open(output_file, 'w', newline='', encoding='utf-8') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(['Repository', 'ecore', 'xtext', 'mwe2'])

        for index, row in df.iterrows():
            repository_name = row[1]
            zip_files = glob.glob(os.path.join(repository_folder, f"{repository_name}.zip"))

            if len(zip_files) == 0:
                writer.writerow([repository_name, '?', '?', '?'])
            elif len(zip_files) > 1:
                writer.writerow([repository_name, '?', '?', '?'])
            else:
                zip_file = zip_files[0]
                ecore_result = check_zip_for_extensions(zip_file, ['.ecore'])
                xtext_result = check_zip_for_extensions(zip_file, ['.xtext'])
                mwe2_result = check_zip_for_extensions(zip_file, ['.mwe2'])
                writer.writerow([repository_name, 'YES' if ecore_result else 'NO', 'YES' if xtext_result else 'NO', 'YES' if mwe2_result else 'NO'])

# 指定存储库信息文件路径
repository_file_path = 'analysis_results/analyze_ecore_xtext_files.xlsx'

# 指定存储库所在文件夹路径
repository_folder_path = 'E:/xtext_repositories'

# 指定输出文件路径
output_file_path = 'results.csv'

# 处理存储库信息并写入结果到CSV文件
process_repositories(repository_file_path, repository_folder_path, output_file_path)
