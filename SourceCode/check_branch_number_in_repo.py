import requests

def get_branch_count(owner, repo, token):
    url = f"https://api.github.com/repos/{owner}/{repo}/branches"
    headers = {"Authorization": f"token {token}"}
    params = {"per_page": 100, "page": 1}
    total_branches = 0

    while True:
        response = requests.get(url, headers=headers, params=params)
        if response.status_code != 200:
            raise Exception(f"GitHub API error: {response.status_code}, {response.text}")
        
        branches = response.json()
        total_branches += len(branches)

        # stop if there is no next page
        if 'next' not in response.links:
            break
        params["page"] += 1

    return total_branches


if __name__ == "__main__":
    owner = "waynepiekarski"
    repo = "XTextureExtractor"
    token = "XXX"

    try:
        count = get_branch_count(owner, repo, token)
        print(f"Repository {owner}/{repo} branch count: {count}")
    except Exception as e:
        print("Error:", e)
