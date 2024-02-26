import os
import zipfile
import openpyxl

log_file = 'output.log'

def extract_zip(zip_path, extract_folder):
    try:
        with zipfile.ZipFile(zip_path, 'r') as zip_ref:
            zip_ref.extractall(extract_folder)
        return True
    except Exception as e:
        print(f"Failed to extract zip file: {e}")
        return False

def find_files(folder, extensions):
    found_files = []
    for root, dirs, files in os.walk(folder):
        for file in files:
            if file.endswith(extensions):
                file_path = os.path.join(root, file)
                found_files.append(file_path)
    return found_files

def update_excel_with_files_info(excel_file, unzip_folder):
    wb = openpyxl.load_workbook(excel_file)
    ws = wb.active

    for row in ws.iter_rows(min_row=2, values_only=True):
        repo_name = row[1]
        zip_file = os.path.join('E:/xtext_repositories', f'{repo_name}.zip')
        if os.path.exists(zip_file):
            extract_folder = os.path.join(unzip_folder, repo_name)
            print(f"Found zip file for repository {repo_name}.")
            write_to_log(f"Found zip file for repository {repo_name}.")
            if extract_zip(zip_file, extract_folder):
                ecore_files = find_files(extract_folder, '.ecore')
                xtext_files = find_files(extract_folder, '.xtext')
                if ecore_files:
                    row_list = list(row)
                    row_list[3] = os.path.basename(ecore_files[0])
                    row_list[4] = ecore_files[0]
                    ws.append(row_list)
                    for ecore_file in ecore_files[1:]:
                        ws.append([None, repo_name, None, os.path.basename(ecore_file), ecore_file, None, None, None, None, None])
                if xtext_files:
                    row_list = list(row)
                    row_list[5] = os.path.basename(xtext_files[0])
                    row_list[6] = xtext_files[0]
                    ws.append(row_list)
                    for xtext_file in xtext_files[1:]:
                        ws.append([None, repo_name, None, None, None, os.path.basename(xtext_file), xtext_file, None, None, None])
                if not ecore_files:
                    print(f"No ecore files found in repository {repo_name}.")
                    write_to_log(f"No ecore files found in repository {repo_name}.")
                if not xtext_files:
                    print(f"No xtext files found in repository {repo_name}.")
                    write_to_log(f"No xtext files found in repository {repo_name}.")
            else:
                print(f"Failed to extract zip file for repository {repo_name}.")
                write_to_log(f"Failed to extract zip file for repository {repo_name}.")
        else:
            print(f"No zip file found for repository {repo_name}.")
            write_to_log(f"No zip file found for repository {repo_name}.")

    wb.save(excel_file)
    print("Files information updated in the Excel file.")
    write_to_log("Files information updated in the Excel file.")

def write_to_log(message):
    with open(log_file, 'a') as f:
        f.write(message + '\n')

def main():
    excel_file = 'analysis_results/analyze_ecore_xtext_files.xlsx'
    unzip_folder = 'E:/xtext_repositories_unzip_new'
    update_excel_with_files_info(excel_file, unzip_folder)

if __name__ == "__main__":
    main()
