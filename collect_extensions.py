import os
import pandas as pd
import glob
import zipfile
import csv

def find_extensions_from_mwe2(zip_file):
    extensions = set()
    with zipfile.ZipFile(zip_file, 'r') as zf:
        for file_info in zf.infolist():
            if file_info.filename.endswith('.mwe2'):
                with zf.open(file_info) as f:
                    content = f.read().decode('utf-8', errors='ignore')
                    mwe2_filename = os.path.basename(file_info.filename)
                    print(f"Found MWE2 file: {mwe2_filename}")
                    extension = extract_extension_from_mwe2(content)
                    if extension:
                        extensions.add(extension)
    return extensions

def extract_extension_from_mwe2(content):
    lines = content.split('\n')
    for line in lines:
        if line.strip().startswith('fileExtensions'):
            parts = line.split('=')
            if len(parts) > 1:
                extension = parts[1].strip().strip('"')
                return extension
    return None

def process_repositories(repository_file, repository_folder, output_file):
    df = pd.read_excel(repository_file)
    with open(output_file, 'w', newline='', encoding='utf-8') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(['Owner', 'Repository', 'Mwe2 Existence', 'Extensions'])

        for index, row in df.iterrows():
            owner = row.iloc[0]
            repository_name = row.iloc[1]

            zip_files = glob.glob(os.path.join(repository_folder, f"{repository_name}.zip"))

            mwe2_existence = 'NO'
            extensions = ''

            if zip_files:
                if len(zip_files) > 1:
                    # 如果有多个同名的zip文件，则返回问号
                    mwe2_existence = '?'
                    print(f"Multiple zip files found for repository {repository_name}.")
                else:
                    zip_file = zip_files[0]
                    print(f"Checking zip file for repository {repository_name}: {zip_file}")
                    with zipfile.ZipFile(zip_file, 'r') as zf:
                        for file_info in zf.infolist():
                            if file_info.filename.endswith('.mwe2'):
                                mwe2_existence = 'YES'
                                content = zf.read(file_info.filename).decode('utf-8', errors='ignore')
                                extension = extract_extension_from_mwe2(content)
                                if extension:
                                    extensions = ','.join(find_extensions_from_mwe2(zip_file))
                                break

            writer.writerow([owner, repository_name, mwe2_existence, extensions])

# 指定存储库信息文件路径
repository_file_path = 'analysis_results/analyze_ecore_xtext_files.xlsx'

# 指定存储库所在文件夹路径
repository_folder_path = 'E:/xtext_repositories'

# 指定输出文件路径
output_file_path = 'mwe2_extension_results.csv'

# 处理存储库信息并将结果写入CSV文件
process_repositories(repository_file_path, repository_folder_path, output_file_path)
