# GitHubDataConverter

# Step 1: Data Collection
## Task 1: get the infomation of all the repositories that contain xtext files
Files:
    api_repos_contain_xtext_1.py
    api_repos_contain_xtext_2.py
    auto searched results: search_results/Python_search_results_1-11.txt
    manual sorted results: search_results/Python_search_results.txt
## Task 2: convert the searched results into spreadsheet and remove duplicate ones
Files:
    convert_api_results_into_csv.py
    auto_analysis_results/search_results_files_without_duplicate.csv

# Step 2: git clone all the searched repos
Files:
    git_clone_repos.py
    local repos in hard disk (you should run this step by yourself)

# Step 3: Classification
## Task 1: Classify the repositories into 5 types.
Files:
	Column I in the Excel file "manual_analysis_results\Repository_overview.xlsx".
		
## Task 2: For the repositories that are classified as "Lanauge", categorize them according to their domains.
Files:
	Column M in the Excel file "manual_analysis_results\Repository_overview.xlsx".
	manual_analysis_results\Generated_categories.docx.
	linechart_cate_repo_created.py
	PieChart_Categories.py

# Step 4: Search files and count commits
## Task 1: Search Xtext files
Files:
    get_xtext_and_commits_from_clones.py
    auto_analysis_results/xtext_commits_count_by_clones.csv

## Task 2: Search Ecore files
Files:
    get_ecore_and_commits_from_clones.py
    auto_analysis_results/ecore_commits_count_by_clones.csv

## Task 3: Search MWE2 files
1) get count of mwe2 files of each repo and number of their average commits
Files:
    get_mwe2_and_commits_from_clones.py
    auto_analysis_results/mwe2_commits_count_by_clones.csv
2) find the extension name of each mwe2 files
Files:
    get_extensions_from_clones.py
    auto_analysis_results/mwe2_files_with_extensions.csv

Task 4: Search Instances
Files:
	get_instances_and_commits_from_clones.py
	found_instances_and_commits.csv
	
# Step 5: Analyze the Usage of Grammar Rules
Files:
	Column AM of Excel file "manual_analysis_results\Repository_overview.xlsx".
	bar_chart_used_gr.py
Folders:
	"Re-creation_of_Language_Repos"

# Step 6: Judge Scenario and Search Instances
Files:
    check_scenario_in_clone.py
    manual_analysis_results/scenario_of_repos.xlsx

# Step 7: Analyze Evolution
Files:
	Columns L, M, and N in the Excel file "manual_analysis_results\file_commit_msg_with_time.xlsx"
	get_file_commit_message.py
	commit_message_sort.py
	extract_time_from_message.py
	reverse_rows.py
	cal_diff_days.py
	Count_interval_within_repo_mix.py
	find_co_changes.py
	Pie_chart_commit_type_count.py
	count_non_repeated_repos.py

# Other information:
    We have also some old code and data in the folder "old_programs".