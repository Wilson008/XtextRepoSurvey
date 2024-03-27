import git
import os

# Owner of the repository
owner = "TypeFox"
# Repository name
repo_name = "theia-xtext-sprotty-example"
# Target directory to clone into
target_dir = "E:/xtext_repos_clone"

# Function to clone the specified repository
def clone_repo(owner, repo_name, target_dir):
    # Ensure target directory exists
    os.makedirs(target_dir, exist_ok=True)

    # Construct the URL of the repository
    repo_url = f"https://github.com/{owner}/{repo_name}.git"

    # Check if the target directory already exists
    repo_dir = os.path.join(target_dir, repo_name)
    if os.path.exists(repo_dir):
        print(f"Repository '{repo_name}' already exists in target directory.")
        return

    # Set global Git configuration for username and email
    os.system('git config --global user.name "wzhangasj"')
    os.system('git config --global user.email "git config --global user.email"')

    # Clone the repository
    print(f"Cloning repository '{owner}/{repo_name}'...")
    git.Repo.clone_from(repo_url, repo_dir)

# Call the function to clone the specified repository
clone_repo(owner, repo_name, target_dir)
