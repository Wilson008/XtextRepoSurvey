# GitHubDataConverter

# Step 1: get the infomation of all the repositories that contain xtext files
Code: 
    api_repos_contain_xtext_1.py
    api_repos_contain_xtext_2.py
Results:
    auto searched results: search_results/Python_search_results_1-11.txt
    manual sorted results: search_results/Python_search_results.txt

# Step 2: convert the searched results into spreadsheet and remove duplicate ones
Code:
    convert_api_results_into_csv.py
Results:
    auto_analysis_results/search_results_files_without_duplicate.csv

# Step 3: git clone all the searched repos
Code:
    git_clone_repos.py
Results:
    local repos in hard disk (you should run this step by yourself)

# Step 4: analysis
## part 1: get information of xtext files in the repos
Code:
    get_xtext_and_commits_from_clones.py
Results:
    auto_analysis_results/xtext_commits_count_by_clones.csv

## part 2: get information of ecore files in the repos
Code:
    get_ecore_and_commits_from_clones.py
Results:
    auto_analysis_results/ecore_commits_count_by_clones.csv

## part 3: judge the development scenarios of the repos
Code:
    check_scenario_in_clone.py
Results:
    manual_analysis_results/scenario_of_repos.xlsx

## part 4: get information of mwe2 files in the repos
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

## part 5: get count of textual instances with the found extensions and number of their average commits
Code:
    get_instances_and_commits_from_clones.py
Results:
    found_instances_and_commits.csv

# Other information:
    We have also some old code and data in the folder "old_programs".