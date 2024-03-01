import requests
import csv

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
        
        if xtext_files:
            print(f"XText files found in the repository {owner}/{repo}:")
            for file_path in xtext_files:
                print(file_path)
        else:
            print(f"No XText files found in the repository {owner}/{repo}.")
    else:
        print(f"Failed to retrieve XText files for {owner}/{repo}. Status code: {response.status_code}")
    
    return xtext_files

def write_to_csv(file_path, data, header):
    with open(file_path, 'w', newline='') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(header)
        for row in data:
            writer.writerow(row)

def main():
    access_token = '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'

    owner = 'eclipse'
    repo = 'xtext-website'
    
    xtext_files = get_xtext_files(owner, repo, access_token)
    
    # 写入 find_xtext_in_repo.csv
    find_xtext_data = [[owner, repo, file_path] for file_path in xtext_files]
    find_xtext_header = ['Repo Owner', 'Repo Name', 'XText File Path']
    write_to_csv('find_xtext_in_repo.csv', find_xtext_data, find_xtext_header)
    
    # 写入 count_xtext_in_repo.csv
    count_xtext_data = [[owner, repo, len(xtext_files)]]
    count_xtext_header = ['Repo Owner', 'Repo Name', 'XText File Count']
    write_to_csv('count_xtext_in_repo.csv', count_xtext_data, count_xtext_header)

if __name__ == "__main__":
    main()

