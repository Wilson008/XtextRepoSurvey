import pandas as pd
import os
import re

def find_file_extensions(mwe2_file):
    file_extensions = set()

    # 尝试不同的编码格式
    encodings = ["utf-8", "latin1"]
    for encoding in encodings:
        try:
            with open(mwe2_file, "r", encoding=encoding) as file:
                lines = file.readlines()
                break
        except UnicodeDecodeError:
            continue
        except FileNotFoundError:
            print(f"File not found: {mwe2_file}")
            return ""

    for line in lines:
        line = line.strip()
        if not line.startswith("//") and not line.startswith("/*") and not line.endswith("*/"):
            matches = re.findall(r'(?:fileExtensions|file\.extensions)\s*=\s*\"([^\"]+)\"', line)
            for match in matches:
                file_extensions.update(match.split(","))

    return ",".join(sorted(file_extensions))

def find_mwe2_files_with_extensions(repo_path):
    mwe2_files_count = 0
    found_extensions = set()

    for root, _, files in os.walk(repo_path):
        for file in files:
            if file.endswith(".mwe2"):
                mwe2_file = os.path.join(root, file)
                extensions = find_file_extensions(mwe2_file)
                if extensions:
                    mwe2_files_count += 1
                    found_extensions.update(extensions.split(","))

    return mwe2_files_count, ",".join(sorted(found_extensions))

def main():
    # 读取Excel文件
    excel_file = r"manual_analysis_results\analyze_ecore_xtext_files.xlsx"
    df = pd.read_excel(excel_file)

    with open("mwe2_files_with_extensions.csv", "w") as csv_file:
        csv_file.write("Repository Name,MWE2 File Count,Found Extensions\n")

        for index, row in df.iterrows():
            owner = row["Owner Login"]
            repo = row["Repository Name"]
            repo_path = f"E:/xtext_repos_clone_new/{owner}_{repo}"
            print(f"Analyzing repository: {owner}/{repo}")
            try:
                mwe2_file_count, extensions = find_mwe2_files_with_extensions(repo_path)
                csv_file.write(f"{owner}/{repo},{mwe2_file_count},\"{extensions}\"\n")
            except Exception as e:
                print(f"An error occurred while analyzing repository {owner}/{repo}: {e}")

if __name__ == "__main__":
    main()
