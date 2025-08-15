import os
import subprocess
import csv

# Define the root directory of the local repositories
repos_root = r'E:\xtext_repos_clone_new'

# Open the file to read owner, repo, and file extensions
with open(r'SourceCode\\manual_analysis_results\\mwe2_and_extensions.csv', 'r') as file:
    reader = csv.reader(file)
    next(reader)  # Skip the header row
    for row in reader:
        owner = row[0]
        repo = row[1]
        extensions_str = row[3].strip()
        extensions = extensions_str.split(',') if extensions_str else []

        print(f"Extensions: {extensions}")  # Print the retrieved extensions

        # Construct the path to the local repository
        local_repo_name = f'{owner}_{repo}'
        repo_path = os.path.join(repos_root, local_repo_name)

        # Initialize total file count and total commit count
        total_files = 0
        total_commits = 0

        # Traverse all files and directories under repo_path
        for root, dirs, files in os.walk(repo_path):
            # Exclude the .git folder
            dirs[:] = [d for d in dirs if d != '.git']

            # Iterate through all files in the current directory
            for file in files:
                # Get the file extension
                file_extension = file.split('.')[-1]
                # If the file extension is in the target extension list, print file path and commit count
                if file_extension in extensions:
                    file_path = os.path.join(root, file)
                    # Get the commit count of the file
                    commit_count = subprocess.check_output(['git', 'log', '--oneline', '--', file_path], cwd=repo_path, encoding='utf-8')
                    commit_count = len(commit_count.splitlines()) if commit_count else 0
                    print(f"File: {file_path}, Commit Count: {commit_count}")
                    # Update total file count and total commit count
                    total_files += 1
                    total_commits += commit_count

        # Calculate the average commit count
        average_commits = round(total_commits / total_files, 2) if total_files != 0 else 0

        # Print total files, total commits, and average commits
        print(f"\nTotal Files: {total_files}")
        print(f"Total Commits: {total_commits}")
        print(f"Average Commits per File: {average_commits}")

        # Write the results to a CSV file
        with open('SourceCode/found_instances_and_commits.csv', 'a', newline='') as csvfile:
            csv_writer = csv.writer(csvfile)
            csv_writer.writerow([owner, repo, total_files, total_commits, average_commits])
