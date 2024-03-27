import os
import re
import zipfile

def find_mwe2_files(repo_name):
    repo_path = os.path.join("E:\\xtext_repositories", repo_name + ".zip")
    if not os.path.exists(repo_path):
        print("Repository not found.")
        return

    with zipfile.ZipFile(repo_path, 'r') as zip_ref:
        file_list = zip_ref.namelist()

        # Check if mwe2 file exists
        mwe2_files = [file for file in file_list if file.endswith('.mwe2')]
        if not mwe2_files:
            print("No mwe2 files found in the repository.")
            return

        # Check if mwe2 file contains new file extensions
        for mwe2_file in mwe2_files:
            with zip_ref.open(mwe2_file) as f:
                mwe2_content = f.read().decode('utf-8')
                match = re.search(r'var file\.extensions\s*=\s*"([^"]+)"', mwe2_content)
                if match:
                    print("mwe2 file:", mwe2_file)
                    print("New file extensions:", match.group(1))
                    continue

                match = re.search(r'fileExtensions\s*=\s*"([^"]+)"', mwe2_content)
                if match:
                    print("mwe2 file:", mwe2_file)
                    print("New file extensions:", match.group(1))

# Example usage
repo_name = 'xtext-demo'
contains_mwe2 = 'YES'
if contains_mwe2 == "YES":
    find_mwe2_files(repo_name)
else:
    print("No need to search for mwe2 files.")
