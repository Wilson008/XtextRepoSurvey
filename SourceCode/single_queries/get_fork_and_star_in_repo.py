import requests

def get_repo_info(owner, repo, access_token):
    # 构建API请求URL
    api_url = f"https://api.github.com/repos/{owner}/{repo}"

    # 添加访问令牌到请求头
    headers = {
        "Authorization": f"token {access_token}"
    }

    try:
        # 发送GET请求获取存储库信息
        response = requests.get(api_url, headers=headers)
        if response.status_code == 200:
            repo_info = response.json()
            forks_count = repo_info['forks_count']
            stargazers_count = repo_info['stargazers_count']
            return forks_count, stargazers_count
        else:
            print(f"Failed to fetch repo info: {response.status_code}")
            return None, None
    except Exception as e:
        print(f"An error occurred: {e}")
        return None, None

if __name__ == "__main__":
    owner = "ngreve"
    repo = "xtext_web"
    access_token = "ACCESS_TOKEN"  # 替换为您的访问令牌

    forks_count, stargazers_count = get_repo_info(owner, repo, access_token)
    if forks_count is not None and stargazers_count is not None:
        print(f"存储库 {owner}/{repo} 的fork数量为：{forks_count}")
        print(f"存储库 {owner}/{repo} 的star数量为：{stargazers_count}")
