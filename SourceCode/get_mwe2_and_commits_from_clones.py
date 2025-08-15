from openpyxl import load_workbook
from git import Repo
import os
import pandas as pd
import csv

def get_commit_count(file_path):
    try:
        repo = Repo(file_path, search_parent_directories=True)
        commits = list(repo.iter_commits(paths=file_path))
    except Exception as e:
        print(f"An error occurred while getting commit count for {file_path}: {e}")
        return 0
    return len(commits)

def list_mwe2_files_with_commit_count(repo_path):
    total_files = 0
    total_commit_count = 0
    
    for root, _, files in os.walk(repo_path):
        for file in files:
            if file.endswith(".mwe2"):
                file_path = os.path.join(root, file)
                commit_count = get_commit_count(file_path)
                total_files += 1
                total_commit_count += commit_count
                print(f"File: {file_path}, Commit count: {commit_count}")

    return total_files, total_commit_count, total_commit_count / total_files if total_files > 0 else 0

def main():
    # Read Excel file
    excel_file = r"SourceCode\\manual_analysis_results\\analyze_ecore_xtext_files.xlsx"
    df = pd.read_excel(excel_file)
    
    # Open CSV file for writing
    with open("SourceCode/mwe2_commits_count_by_clones.csv", "w", newline="") as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(["owner", "repo", "total_files", "total_commit_count", "average_commit_count"])

        for index, row in df.iterrows():
            owner = row[0]
            repo = row[1]
            repo_path = f"E:/xtext_repos_clone_new/{owner}_{repo}"
            print(f"Analyzing repository: {owner}/{repo}")
            total_files, total_commit_count, average_commit_count = list_mwe2_files_with_commit_count(repo_path)
            # Write results to CSV file
            writer.writerow([owner, repo, total_files, total_commit_count, average_commit_count])

if __name__ == "__main__":
    main()
