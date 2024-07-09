import requests
import json

# GitHub Access Token
access_token = 'XXX'

# Repository owner and name
owner = 'goldschmiede'
repo = '2011-02-18_xtext_apache_wicket'

# GitHub API URL for the repository
url = f'https://api.github.com/repos/{owner}/{repo}'

# Headers for authentication
headers = {
    'Authorization': f'token {access_token}'
}

# Send a GET request to the GitHub API
response = requests.get(url, headers=headers)

# Check if the request was successful
if response.status_code == 200:
    # Parse the JSON response
    repo_info = response.json()
    # Get the creation date and extract only the date part
    created_at = repo_info['created_at']
    created_date = created_at.split('T')[0]
    print(f'Repository {owner}/{repo} was created on: {created_date}')
else:
    print(f'Failed to fetch repository information. Status code: {response.status_code}')
    print(response.json())
