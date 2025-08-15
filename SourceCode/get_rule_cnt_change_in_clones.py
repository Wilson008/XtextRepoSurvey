import csv
import re
import os
import git

def get_commit_count(file_path):
    try:
        repo = git.Repo(file_path, search_parent_directories=True)
        return len(list(repo.iter_commits(paths=file_path)))
    except Exception as e:
        print(f"Error getting commit count for {file_path}: {e}")
        return 0

def get_xtext_file_content(repo, file_path, commit_sha):
    try:
        # Get relative path
        git_root = repo.working_dir.replace('\\', '/') + '/'
        rel_file_path = file_path.replace('\\', '/').replace(git_root, '')
        file_content = repo.git.show(f"{commit_sha}:{rel_file_path}")
        return file_content
    except Exception as e:
        print(f"Error getting file content for {file_path} ({commit_sha}): {e}")
        return ""

def find_xtext_files(root_dir):
    xtext_files = []
    for root, dirs, files in os.walk(root_dir):
        for file in files:
            if file.endswith(".xtext"):
                file_path = os.path.join(root, file)
                commit_count = get_commit_count(file_path)
                xtext_files.append((file_path, commit_count))
    return xtext_files

def does_string_exist(str_input, str_regex):
    pattern = re.compile(str_regex)
    return bool(pattern.search(str_input))

def is_first_line_of_grammar_rule(s):
    return does_string_exist(s, r"\w+\s*\:") and not does_string_exist(s, r"\w+\s*\+*=")

def count_grammar_rule(str_raw):
    # Split the contents of the Xtext file (i.e., string) into lines
    lines = str_raw.split("\n")

    count = 0
    for line in lines:
        if is_first_line_of_grammar_rule(line) and not does_string_exist(line, r"import.*http"):
            count += 1

    return count

# Read the CSV file to get owner and repo information
csv_file_path = r'D:\\02.Git Repository\\XtextRepoSurvey\\SourceCode\\manual_analysis_results\\mwe2_and_extensions.csv'
output_csv_file = 'SourceCode/count_changed_rule.csv'

with open(csv_file_path, mode='r', newline='', encoding='utf-8') as csv_file, \
        open(output_csv_file, mode='w', newline='', encoding='utf-8') as output_csv:
    reader = csv.reader(csv_file)
    writer = csv.writer(output_csv)

    # Write the header of the CSV file
    writer.writerow(['owner', 'repo', 'average_count_diff'])

    next(reader)  # Skip the header row
    for row in reader:
        owner = row[0]
        repo_name = row[1]
        root_folder = f'E:\\xtext_repos_clone_new\\{owner}_{repo_name}'

        print(f"Analyzing {owner} | {repo_name}")

        # Find all files with the .xtext extension and get their commit counts
        xtext_files_list = find_xtext_files(root_folder)
        total_count_diff = 0
        file_count = len(xtext_files_list)

        # Process each file’s commit history and text to calculate differences
        for file_path, commit_count in xtext_files_list:
            print(f"File: {file_path} | Commit Count: {commit_count}")

            try:
                # Get the contents of the most recent two commits for the file and pass them to count_grammar_rule
                repo = git.Repo(file_path, search_parent_directories=True)
                commits = list(repo.iter_commits(paths=file_path))
                commit_texts = [get_xtext_file_content(repo, file_path, commit.hexsha) for commit in commits]
                
                if len(commit_texts) > 1:
                    result_before = count_grammar_rule(commit_texts[-1])
                    print(f"Count of rules in first commit: {result_before}")
                    result_after = count_grammar_rule(commit_texts[0])
                    print(f"Count of rules in last commit: {result_after}")
                    count_diff = result_after - result_before
                    print(f"Grammar rules added/removed: {count_diff}")
                    total_count_diff += count_diff
                else:
                    print("Grammar rules added/removed: 0")
            except Exception as e:
                print(f"Error occurred while reading file {file_path}: {e}")
                result_before = 0
                result_after = 0
                count_diff = 0
            
        
        average_count_diff = total_count_diff / file_count if file_count > 0 else 0
        print(f"Average Grammar rules added/removed: {average_count_diff:.2f}")

        # Write partial results to the CSV file
        writer = csv.writer(output_csv)
        writer.writerow([owner, repo_name, f"{average_count_diff:.2f}"])

        print(f"Results written to {csv_file}")
