import os
import pandas as pd
import glob
import zipfile
import csv

def find_ecore_info(zip_file):
    ecore_files = []
    try:
        with zipfile.ZipFile(zip_file, 'r') as zf:
            for file_info in zf.infolist():
                if file_info.filename.endswith('.ecore'):
                    ecore_file_path = file_info.filename
                    parent_folder = os.path.dirname(ecore_file_path)
                    parent_folder_name = os.path.basename(parent_folder)
                    ecore_files.append((ecore_file_path, parent_folder_name))
    except zipfile.BadZipFile:
        pass
    
    return ecore_files

def determine_ecore_result(ecore_files):
    ecore_folders = set(folder_name for _, folder_name in ecore_files)
    if not ecore_files:
        return 'null'
    if all(folder_name == 'generated' for _, folder_name in ecore_files):
        return 'Grammar-Driven'
    if all(folder_name != 'generated' for _, folder_name in ecore_files):
        return 'Metamodel-Driven'
    return 'TBD'

def process_repositories(repository_file, repository_folder, output_file):
    df = pd.read_excel(repository_file)
    with open(output_file, 'w', newline='', encoding='utf-8') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(['Repository', 'ecore_count', 'result'])

        for index, row in df.iterrows():
            repository_name = row[1]
            zip_files = glob.glob(os.path.join(repository_folder, f"{repository_name}.zip"))

            if not zip_files:
                writer.writerow([repository_name, 0, 'null'])
            else:
                zip_file = zip_files[0]
                ecore_files = find_ecore_info(zip_file)
                ecore_count = len(ecore_files)
                result = determine_ecore_result(ecore_files)
                writer.writerow([repository_name, ecore_count, result])

# 指定存储库信息文件路径
repository_file_path = 'analysis_results/analyze_ecore_xtext_files.xlsx'

# 指定存储库所在文件夹路径
repository_folder_path = 'E:/xtext_repositories'

# 指定输出文件路径
output_file_path = 'ecore_analysis_results.csv'

# 处理存储库信息并将结果写入CSV文件
process_repositories(repository_file_path, repository_folder_path, output_file_path)
