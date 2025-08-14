import os
import zipfile

def find_xtext_files(repo_owner, repo_name):
    repo_zip_path = f"E:\\xtext_repositories\\{repo_name}.zip"
    xtext_files = []

    if os.path.exists(repo_zip_path):
        with zipfile.ZipFile(repo_zip_path, 'r') as zip_ref:
            for file_name in zip_ref.namelist():
                if file_name.endswith('.xtext'):
                    xtext_files.append(file_name)
        
        if xtext_files:
            print(f"XText files found in {repo_name}.zip:")
            for file_name in xtext_files:
                print(file_name)
            print(f"Total XText files found: {len(xtext_files)}")
        else:
            print(f"No XText files found in {repo_name}.zip.")
    else:
        print(f"Zip file for repository {repo_name} not found.")

def main():
    repo_owner = "TypeFox"  # 替换为repo的owner的login值
    repo_name = "xtext2langium"  # 替换为repo的name

    find_xtext_files(repo_owner, repo_name)

if __name__ == "__main__":
    main()
