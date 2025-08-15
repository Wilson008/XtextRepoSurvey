import os
from git import Repo
import csv
import pandas as pd

def list_xtext_files_with_commit_count(repo_path):
    xtext_files = []
    total_commit_count = 0
    total_files = 0

    for root, dirs, files in os.walk(repo_path):
        for file in files:
            if file.endswith(".xtext"):
                file_path = os.path.join(root, file)
                xtext_files.append(file_path)
                commit_count = get_commit_count(file_path)
                total_commit_count += commit_count
                total_files += 1
    
    average_commit_count = total_commit_count / total_files if total_files > 0 else 0
    
    return total_files, total_commit_count, average_commit_count

def get_commit_count(file_path):
    try:
        repo = Repo(file_path, search_parent_directories=True)
        commits = list(repo.iter_commits(paths=file_path))
    except Exception as e:
        print(f"An error occurred while getting commit count for {file_path}: {e}")
        return 0
    return len(commits)

if __name__ == "__main__":
    # Read the Excel file
    excel_file = r"SourceCode/manual_analysis_results/analyze_ecore_xtext_files.xlsx"
    df = pd.read_excel(excel_file)
    
    # Open CSV file for writing
    with open("SourceCode/xtext_commits_count_by_clones.csv", "w", newline="") as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(["owner", "repo", "total_files", "total_commit_count", "average_commit_count"])

        # Iterate through each row in the Excel data
        for index, row in df.iterrows():
            owner = row["Owner Login"]
            repo = row["Repository Name"]
            repo_name = f"{owner}_{repo}"
            print(f"Querying {owner}'s local repo: {repo}...")
            repo_path = os.path.join(r"E:\xtext_repos_clone_new", repo_name)
            
            # Get xtext file information and commit counts in the local repository
            total_files, total_commit_count, average_commit_count = list_xtext_files_with_commit_count(repo_path)
            
            # Write the results to the CSV file
            writer.writerow([owner, repo, total_files, total_commit_count, average_commit_count])
