import os
import pandas as pd
import glob
import zipfile
import csv

def process_repositories(repository_file, repository_folder, output_file):
    df = pd.read_excel(repository_file)
    with open(output_file, 'w', newline='', encoding='utf-8') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(['Owner', 'Repository', 'Mwe2 Existence'])

        for index, row in df.iterrows():
            owner = row.iloc[0]
            repository_name = row.iloc[1]

            zip_files = glob.glob(os.path.join(repository_folder, f"{repository_name}.zip"))

            mwe2_existence = 'NO'

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

            writer.writerow([owner, repository_name, mwe2_existence])

# 指定存储库信息文件路径
repository_file_path = 'analysis_results/analyze_ecore_xtext_files.xlsx'

# 指定存储库所在文件夹路径
repository_folder_path = 'E:/xtext_repositories'

# 指定输出文件路径
output_file_path = 'mwe2_extension_results.csv'

# 处理存储库信息并将结果写入CSV文件
process_repositories(repository_file_path, repository_folder_path, output_file_path)
