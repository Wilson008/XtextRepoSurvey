import requests

def get_repo_files(access_token, owner, repo, path='', file_list=[]):
    headers = {
        'Authorization': f'token {access_token}'
    }
    url = f'https://api.github.com/repos/{owner}/{repo}/contents/{path}'
    response = requests.get(url, headers=headers)
    if response.status_code == 200:
        files = response.json()
        for file in files:
            if file['type'] == 'file' and file['name'].endswith('.mwe2'):
                file_list.append(path + '/' + file['name'] if path else file['name'])
            elif file['type'] == 'dir':
                get_repo_files(access_token, owner, repo, file['path'], file_list)
        return file_list
    else:
        print(f"Failed to retrieve files from {owner}/{repo}. Status code: {response.status_code}")
        return []

def main():
    access_token = "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"
    owner = "0xMYsteRy"
    repo = "Xtext"

    file_names = get_repo_files(access_token, owner, repo)
    for file_name in file_names:
        print(file_name)

if __name__ == "__main__":
    main()
