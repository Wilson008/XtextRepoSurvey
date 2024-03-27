import git
import os
import csv

# Target directory to clone into
target_dir = "E:/xtext_repos_clone_new"

# Function to clone the specified repository
def clone_repo(owner, repo_name, target_dir):
    # Ensure target directory exists
    os.makedirs(target_dir, exist_ok=True)

    # Construct the URL of the repository
    repo_url = f"https://github.com/{owner}/{repo_name}.git"

    # Check if the target directory already exists
    repo_dir = os.path.join(target_dir, f"{owner}_{repo_name}")
    if os.path.exists(repo_dir):
        print(f"Repository '{owner}/{repo_name}' already exists in target directory.")
        return

    # Set global Git configuration for username and email
    os.system('git config --global user.name "wzhangasj"')
    os.system('git config --global user.email "weixing.zhang@gu.se"')

     # Clone the repository
    print(f"Cloning repository '{owner}/{repo_name}'...")
    try:
        git.Repo.clone_from(repo_url, repo_dir)
        print(f"Repository '{owner}/{repo_name}' cloned successfully.")
    except git.exc.GitCommandError as e:
        print(f"Failed to clone repository '{owner}/{repo_name}': {str(e)}")

# Read repositories from count_ecore_in_repos.csv and clone them
with open('auto_analysis_results/count_ecore_in_repos.csv', newline='', encoding='utf-8') as csvfile:
    reader = csv.reader(csvfile)
    next(reader)  # Skip header
    for row in reader:
        owner = row[0]
        repo_name = row[1]
        clone_repo(owner, repo_name, target_dir)
