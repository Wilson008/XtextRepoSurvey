import os
import pandas as pd
import glob
import zipfile
import re
import csv

def find_extensions_from_mwe2(mwe2_file):
    extensions = []
    with zipfile.ZipFile(mwe2_file, 'r') as zf:
        for file_info in zf.infolist():
            if file_info.filename.endswith('.mwe2'):
                with zf.open(file_info) as f:
                    content = f.read().decode('ISO-8859-1')
                    match = re.search(r'fileExtensions\s*=\s*"(.+?)"', content)
                    if match:
                        extensions.extend(match.group(1).split(','))
    return extensions

def find_files_with_extensions(zip_file, extensions):
    found_files = []
    try:
        with zipfile.ZipFile(zip_file, 'r') as zf:
            for extension in extensions:
                for file_info in zf.infolist():
                    if file_info.filename.endswith('.' + extension):
                        found_files.append(file_info.filename)
    except zipfile.BadZipFile:
        pass
    return found_files

def process_repositories(repository_file, repository_folder, output_file):
    df = pd.read_excel(repository_file)
    with open(output_file, 'w', newline='', encoding='utf-8') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(['Owner', 'Repository', 'Xtext File', 'Mwe2 File', 'New File'])

        for index, row in df.iterrows():
            owner = row.iloc[0]
            repository_name = row.iloc[1]

            zip_files = glob.glob(os.path.join(repository_folder, f"{repository_name}.zip"))

            if not zip_files:
                writer.writerow([owner, repository_name, 'null', 'null', 'null'])
            else:
                zip_file = zip_files[0]
                xtext_files = find_files_with_extensions(zip_file, ['xtext'])
                mwe2_files = find_files_with_extensions(zip_file, ['mwe2'])

                if not xtext_files:
                    xtext_file_name = 'null'
                else:
                    xtext_file_name = ','.join(xtext_files)

                if not mwe2_files:
                    mwe2_file_name = 'null'
                    new_file_name = 'null'
                else:
                    mwe2_file_name = ','.join(mwe2_files)
                    mwe2_extensions = find_extensions_from_mwe2(zip_file)
                    new_files = find_files_with_extensions(zip_file, mwe2_extensions)
                    new_file_name = ','.join(new_files) if new_files else 'null'

                writer.writerow([owner, repository_name, xtext_file_name, mwe2_file_name, new_file_name])

# 指定存储库信息文件路径
repository_file_path = 'analysis_results/analyze_ecore_xtext_files.xlsx'

# 指定存储库所在文件夹路径
repository_folder_path = 'E:/xtext_repositories'

# 指定输出文件路径
output_file_path = 'file_analysis_results.csv'

# 处理存储库信息并将结果写入CSV文件
process_repositories(repository_file_path, repository_folder_path, output_file_path)
