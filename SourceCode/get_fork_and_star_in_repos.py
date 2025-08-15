import requests
import csv

def get_repo_info(owner, repo, access_token):
    # Construct the API request URL
    api_url = f"https://api.github.com/repos/{owner}/{repo}"

    # Add the access token to the request headers
    headers = {
        "Authorization": f"token {access_token}"
    }

    try:
        # Send a GET request to fetch repository information
        response = requests.get(api_url, headers=headers)
        if response.status_code == 200:
            repo_info = response.json()
            forks_count = repo_info['forks_count']
            stargazers_count = repo_info['stargazers_count']
            return forks_count, stargazers_count
        else:
            print(f"Failed to fetch repo info for {owner}/{repo}: {response.status_code}")
            return 0, 0
    except Exception as e:
        print(f"An error occurred while fetching repo info for {owner}/{repo}: {e}")
        return 0, 0

def write_to_csv(owner, repo, forks_count, stars_count):
    with open('count_fork_and_star.csv', mode='a', newline='') as file:
        writer = csv.writer(file)
        if file.tell() == 0:
            writer.writerow(['Owner', 'Repo', 'Forks Count', 'Stars Count'])
        writer.writerow([owner, repo, forks_count, stars_count])

if __name__ == "__main__":
    access_token = "ACCESS_TOKEN"  # Replace with your access token

    with open('D:/02.Git Repository/XtextRepoSurvey/SourceCode/manual_analysis_results/mwe2_and_extensions.csv', mode='r') as csv_file:
        csv_reader = csv.reader(csv_file)
        next(csv_reader)  # Skip the first row since it is the header
        for row in csv_reader:
            owner = row[0]
            repo = row[1]
            
            forks_count, stargazers_count = get_repo_info(owner, repo, access_token)
            if forks_count is not None and stargazers_count is not None:
                print(f"The count of forks in repo {owner}/{repo} is: {forks_count}")
                print(f"The count of stars in repo {owner}/{repo} is: {stargazers_count}")

                write_to_csv(owner, repo, forks_count, stargazers_count)
                print("Results have been written into count_fork_and_star.csv.")
            else:
                print(f"Failed to get the information of Repo: {owner}/{repo}, so failed to write into CSV file.")
