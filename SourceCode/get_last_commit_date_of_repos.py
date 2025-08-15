import requests
import csv
import time

# GitHub API configuration
TOKEN = "XXX"
HEADERS = {"Authorization": f"token {TOKEN}"}

# Input and output file paths
input_file = "SourceCode/Benchmarks_Order_Repos.csv"
output_file = "SourceCode/last_commit_date_repo.csv"

def get_last_commit_date(owner, repo):
    url = f"https://api.github.com/repos/{owner}/{repo}/commits"
    try:
        # Request the most recent commits
        response = requests.get(url, headers=HEADERS)
        response.raise_for_status()
        commits = response.json()
        
        if commits:
            # Extract the date of the latest commit
            last_commit_date = commits[0]['commit']['committer']['date']
            return last_commit_date[:10]  # Keep only YYYY-MM-DD format
        else:
            print(f"No commits found for repository: {owner}/{repo}")
            return "0000-00-00"
    except requests.exceptions.RequestException as e:
        print(f"Error fetching data for {owner}/{repo}: {e}")
        return "0000-00-00"

# Open the output file
with open(output_file, mode="w", newline="") as outfile:
    writer = csv.writer(outfile)
    writer.writerow(["login", "repo", "last_commit_date"])

    # Read the input file
    with open(input_file, mode="r") as infile:
        reader = csv.reader(infile)
        next(reader)  # Skip header row

        for row in reader:
            owner, repo = row[0], row[1]
            last_commit_date = get_last_commit_date(owner, repo)
            
            # Write the result to the file and print it
            writer.writerow([owner, repo, last_commit_date])
            print(f"{owner}/{repo} - Last Commit Date: {last_commit_date}")
            
            # Avoid API rate limit
            time.sleep(1)  # Wait 1 second between requests
