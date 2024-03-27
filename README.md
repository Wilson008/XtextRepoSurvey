# GitHubDataConverter

# Step 1: Data Collection
## Step 1.1: get the infomation of all the repositories that contain xtext files
Code: 
    api_repos_contain_xtext_1.py
    api_repos_contain_xtext_2.py
Results:
    auto searched results: search_results/Python_search_results_1-11.txt
    manual sorted results: search_results/Python_search_results.txt
## Step 1.2: convert the searched results into spreadsheet and remove duplicate ones
Code:
    convert_api_results_into_csv.py
Results:
    auto_analysis_results/search_results_files_without_duplicate.csv

# Step 2: git clone all the searched repos
Code:
    git_clone_repos.py
Results:
    local repos in hard disk (you should run this step by yourself)

# Step 3: Search files and count commits
## Step 3.1: Search Xtext files
Code:
    get_xtext_and_commits_from_clones.py
Results:
    auto_analysis_results/xtext_commits_count_by_clones.csv

## Step 3.2: Search Ecore files
Code:
    get_ecore_and_commits_from_clones.py
Results:
    auto_analysis_results/ecore_commits_count_by_clones.csv

## Step 3.3: Search MWE2 files
### part 4.1: get count of mwe2 files of each repo and number of their average commits
Code:
    get_mwe2_and_commits_from_clones.py
Results:
    auto_analysis_results/mwe2_commits_count_by_clones.csv
### part 4.2: find the extension name of each mwe2 files
Code:
    get_extensions_from_clones.py
Results:
    auto_analysis_results/mwe2_files_with_extensions.csv

# Step 4: Judge Scenario and Search Instances
## Step 4.1: judge the development scenarios of the repos
Code:
    check_scenario_in_clone.py
Results:
    manual_analysis_results/scenario_of_repos.xlsx

## Step 4.2: Search instances
Code:
    get_instances_and_commits_from_clones.py
Results:
    found_instances_and_commits.csv

# Other information:
    We have also some old code and data in the folder "old_programs".