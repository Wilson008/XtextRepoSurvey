import os

def find_ecore_files(root_dir):
    ecore_files = []
    containing_folders = set()  # 用集合来存储包含ecore文件的文件夹名称
    for root, dirs, files in os.walk(root_dir):
        for file in files:
            if file.endswith('.ecore'):
                containing_folder = os.path.basename(os.path.dirname(os.path.join(root, file)))
                ecore_files.append((os.path.join(root, file), containing_folder))
                containing_folders.add(containing_folder)  # 将文件夹名称添加到集合中
    return ecore_files, containing_folders

def main():
    owner = "ceefour"
    repo = "emf-sandbox"
    root_dir = f"E:\\xtext_repos_clone_new\\{owner}_{repo}"
    
    ecore_files, containing_folders = find_ecore_files(root_dir)
    
    if ecore_files:
        print("Found ecore files:")
        for ecore_file, containing_folder in ecore_files:
            print(f"Ecore file: {ecore_file}")
            print(f"Containing folder: {containing_folder}")
            print()
        
        # 检查所有包含ecore文件的文件夹名称
        if all(folder == "generated" for folder in containing_folders):
            print("grammar-driven")
        elif any(folder == "generated" for folder in containing_folders):
            print("Both")
        else:
            print("metamodel-driven")
    else:
        print("No ecore files found.")

if __name__ == "__main__":
    main()
