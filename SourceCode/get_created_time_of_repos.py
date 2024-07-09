import requests
import csv

# GitHub Access Token
access_token = 'XXX'

# CSV file path
csv_file_path = 'SourceCode/auto_analysis_results/average_commit_change_xtext.csv'
# Output CSV file path
output_csv_file_path = 'SourceCode/repos_created_time.csv'

# GitHub API URL template
url_template = 'https://api.github.com/repos/{owner}/{repo}'

# Headers for authentication
headers = {
    'Authorization': f'token {access_token}'
}

# Function to get repository creation date
def get_repo_creation_date(owner, repo):
    url = url_template.format(owner=owner, repo=repo)
    response = requests.get(url, headers=headers)
    if response.status_code == 200:
        repo_info = response.json()
        created_at = repo_info['created_at']
        created_date = created_at.split('T')[0]
        return created_date
    else:
        print(f'Failed to fetch repository information for {owner}/{repo}. Status code: {response.status_code}')
        return '0000-00-00'

# # Read the CSV file and process each repository
# with open(csv_file_path, newline='') as csvfile:
#     csvreader = csv.reader(csvfile)
#     next(csvreader)  # Skip the header row
#     for row in csvreader:
#         owner, repo = row[0], row[1]
#         created_date = get_repo_creation_date(owner, repo)
#         if created_date:
#             print(f'Owner: {owner}, Repo: {repo}, Created Date: {created_date}')

# Read the input CSV file and process each repository
with open(csv_file_path, newline='') as infile:
    csvreader = csv.reader(infile)
    next(csvreader)  # Skip the header row

    # Open the output CSV file for writing
    with open(output_csv_file_path, 'w', newline='') as outfile:
        csvwriter = csv.writer(outfile)
        # Write the header row
        csvwriter.writerow(['owner', 'repo', 'created_date'])

        # Process each row in the input CSV
        for row in csvreader:
            owner, repo = row[0], row[1]
            created_date = get_repo_creation_date(owner, repo)
            if created_date:
                print(f'Owner: {owner}, Repo: {repo}, Created Date: {created_date}')
                # Write the result to the output CSV
                csvwriter.writerow([owner, repo, created_date])