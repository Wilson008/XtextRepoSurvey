import requests
import csv

def get_ecore_files(owner, repo, access_token):
    headers = {
        'Authorization': f'token {access_token}'
    }
    url = f'https://api.github.com/repos/{owner}/{repo}/git/trees/master?recursive=1'
    response = requests.get(url, headers=headers)
    if response.status_code == 200:
        response_json = response.json()
        ecore_files = [file.get('path') for file in response_json.get('tree', []) if file.get('type') == 'blob' and file.get('path', '').endswith('.ecore')]
        return ecore_files
    else:
        print(f"Failed to retrieve Ecore files for {owner}/{repo}. Status code: {response.status_code}")
        return None

def extract_folder_path(file_path):
    # Remove leading directories and split by "/"
    parts = file_path.split('/')
    for i, part in enumerate(parts):
        if part.endswith('.ecore'):
            return '/'.join(parts[i-1].split('/')[-1:])
    return None

def get_scenario(ecore_folders):
    if not ecore_folders:
        return "not applicable"
    
    is_generated = any(folder == 'generated' for folder in ecore_folders)
    is_not_generated = any(folder != 'generated' for folder in ecore_folders)

    if is_generated and not is_not_generated:
        return "grammar-driven"
    elif not is_generated and is_not_generated:
        return "metamodel-driven"
    else:
        return "TBD"

def write_to_ecore_csv(owner, repo, ecore_files, ecore_folders):
    with open('find_ecore_and_folder.csv', 'a', newline='', encoding='utf-8') as csvfile:
        fieldnames = ['Owner', 'Repo', 'Ecore File', 'Containing Folder']
        writer = csv.DictWriter(csvfile, fieldnames=fieldnames)

        if csvfile.tell() == 0:
            writer.writeheader()

        if ecore_files:
            for file_path, folder_path in zip(ecore_files, ecore_folders):
                writer.writerow({'Owner': owner, 'Repo': repo, 'Ecore File': file_path, 'Containing Folder': folder_path})
        else:
            writer.writerow({'Owner': owner, 'Repo': repo, 'Ecore File': 'not applicable', 'Containing Folder': 'not applicable'})

def write_to_scenario_csv(owner, repo, scenario):
    with open('check_repo_scenario.csv', 'a', newline='', encoding='utf-8') as csvfile:
        fieldnames = ['Owner', 'Repo', 'Scenario']
        writer = csv.DictWriter(csvfile, fieldnames=fieldnames)

        if csvfile.tell() == 0:
            writer.writeheader()

        writer.writerow({'Owner': owner, 'Repo': repo, 'Scenario': scenario})

def main():
    access_token = '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'
    owner = 'graph-quilt'
    repo = 'graphql-xtext'

    ecore_files = get_ecore_files(owner, repo, access_token)
    ecore_folders = [extract_folder_path(file_path) for file_path in ecore_files]
    scenario = get_scenario(ecore_folders)

    write_to_ecore_csv(owner, repo, ecore_files, ecore_folders)
    write_to_scenario_csv(owner, repo, scenario)

if __name__ == "__main__":
    main()
