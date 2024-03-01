import requests
import csv
import openpyxl

def get_xtext_files(owner, repo, access_token):
    headers = {
        'Authorization': f'token {access_token}'
    }
    url = f'https://api.github.com/repos/{owner}/{repo}/git/trees/master?recursive=1'
    response = requests.get(url, headers=headers)
    
    xtext_files = []
    
    if response.status_code == 200:
        response_json = response.json()
        xtext_files = [file.get('path') for file in response_json.get('tree', []) if file.get('type') == 'blob' and file.get('path', '').endswith('.xtext')]
    else:
        print(f"Failed to retrieve XText files for {owner}/{repo}. Status code: {response.status_code}")
        xtext_files = 'failed'
    
    return xtext_files

def write_to_csv(file_path, data, header):
    with open(file_path, 'w', newline='', encoding='utf-8') as csvfile:  # 使用 utf-8 编码
        writer = csv.writer(csvfile)
        writer.writerow(header)
        for row in data:
            writer.writerow(row)

def main():
    access_token = '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'
    excel_file_path = 'analysis_results/analyze_ecore_xtext_files.xlsx'
    
    find_xtext_header = ['Repo Owner', 'Repo Name', 'XText File Path']
    count_xtext_header = ['Repo Owner', 'Repo Name', 'XText File Count']
    
    wb = openpyxl.load_workbook(excel_file_path)
    sheet = wb.active
    
    find_xtext_data = []
    count_xtext_data = []
    
    for row in sheet.iter_rows(min_row=2, values_only=True):
        owner = row[0]
        repo = row[1]
        print(f"Querying repository: {owner}/{repo}")
        xtext_files = get_xtext_files(owner, repo, access_token)
        
        # 添加到 find_xtext_data
        if xtext_files != 'failed':
            for file_path in xtext_files:
                find_xtext_data.append([owner, repo, file_path])
        
        # 添加到 count_xtext_data
        if xtext_files == 'failed':
            count_xtext_data.append([owner, repo, 'failed'])
        else:
            count_xtext_data.append([owner, repo, len(xtext_files)])
    
    # 写入 find_xtext_in_repo.csv
    write_to_csv('find_xtext_in_repo.csv', find_xtext_data, find_xtext_header)
    
    # 写入 count_xtext_in_repo.csv
    write_to_csv('count_xtext_in_repo.csv', count_xtext_data, count_xtext_header)

    print("All repositories queried and results saved.")

if __name__ == "__main__":
    main()
