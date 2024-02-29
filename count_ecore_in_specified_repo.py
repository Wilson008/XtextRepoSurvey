import requests

def get_ecore_files(owner, repo, access_token):
    headers = {
        'Authorization': f'token {access_token}'
    }
    url = f'https://api.github.com/repos/{owner}/{repo}/git/trees/master?recursive=1'
    response = requests.get(url, headers=headers)
    if response.status_code == 200:
        response_json = response.json()
        ecore_files = [file.get('path') for file in response_json.get('tree', []) if file.get('type') == 'blob' and file.get('path', '').endswith('.ecore')]
        if ecore_files:
            print(f"Ecore files found in the repository {owner}/{repo}:")
            for file_path in ecore_files:
                print(file_path)
        else:
            print(f"No Ecore files found in the repository {owner}/{repo}.")
    else:
        print(f"Failed to retrieve Ecore files for {owner}/{repo}. Status code: {response.status_code}")

def main():
    access_token = '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'
    owner = 'graph-quilt'
    repo = 'graphql-xtext'
    get_ecore_files(owner, repo, access_token)

if __name__ == "__main__":
    main()
