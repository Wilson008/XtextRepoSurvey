from github import Github
import time
import requests
import csv
import logging

# Configure logging
logging.basicConfig(filename="output.log", level=logging.DEBUG, format="%(asctime)s - %(levelname)s - %(message)s")

def get_commit_count(owner, repo, file_path, access_token):
    headers = {
        "Authorization": f"token {access_token}",
        "Accept": "application/vnd.github.v3+json"
    }

    commits_url = f"https://api.github.com/repos/{owner}/{repo}/commits?path={file_path}"
    response = requests.get(commits_url, headers=headers)
    response.raise_for_status()
    commit_count = len(response.json())
    print(f"The number of commits for file '{file_path}' is: {commit_count}")
    logging.info("The number of commits for file %s is: %s", file_path, commit_count)
    return commit_count

def get_default_branch(repo):
    g = Github(access_token)
    repo = g.get_repo(f"{owner}/{repo}")
    return repo.default_branch

def get_files_with_extensions(owner, repo, file_extensions, access_token):
    # Get the default branch name of the repository
    default_branch = get_default_branch(repo)

    headers = {
        "Authorization": f"token {access_token}",
        "Accept": "application/vnd.github.v3+json"
    }

    # Recursively retrieve all file and folder information
    def get_tree_recursive(tree_url):
        response = requests.get(tree_url, headers=headers)
        response.raise_for_status()
        tree_info = response.json()["tree"]
        for item in tree_info:
            if item["type"] == "blob" and any(item["path"].endswith(ext) for ext in file_extensions):
                yield item["path"]

    # Get the root directory tree information of the repository
    tree_url = f"https://api.github.com/repos/{owner}/{repo}/git/trees/{default_branch}?recursive=1"
    printed_files = set()  # Record the printed file paths
    for file_path in get_tree_recursive(tree_url):
        if file_path not in printed_files:
            printed_files.add(file_path)
            yield file_path

with open('manual_analysis_results/mwe2_and_extensions.csv', newline='') as csvfile:
    reader = csv.reader(csvfile)
    next(reader)  # Skip the header row
    for row in reader:
        owner = row[0]
        repo = row[1]
        if not row[3]:
            print(f"The repository '{owner}/{repo}' has no textual instances.")
            with open("found_instances_average.csv", "a", newline="") as csvfile:
                writer = csv.writer(csvfile)
                writer.writerow([owner, repo, "0"])
            continue
        file_extensions_list = row[3].split(',')
        access_token = "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"

        total_commit_count = 0
        total_files = 0

        print(f"The specified extension files in the repository '{owner}/{repo}':")
        logging.info("The specified extension files in the repository '%s/%s':", owner, repo)

        for file_path in get_files_with_extensions(owner, repo, file_extensions_list, access_token):
            commit_count = get_commit_count(owner, repo, file_path, access_token)
            total_commit_count += commit_count
            total_files += 1
        
        # Print the total number of files
        print("Total number of files:", total_files)
        logging.info("Total number of files: %d", total_files)

        # Print the total number of commits
        print("Total number of commits:", total_commit_count)
        logging.info("Total number of commits: %d", total_commit_count)

        # Calculate and print the average number of commits
        average_commit_count = total_commit_count / total_files if total_files > 0 else 0
        print("Average number of commits: {:.2f}".format(average_commit_count))
        logging.info('Average number of commits: %.2f', average_commit_count)

        print("---------------------------------------------------------")
        logging.info("---------------------------------------------------------")
