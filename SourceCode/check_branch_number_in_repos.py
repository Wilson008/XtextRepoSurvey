import csv
import os
import sys
import time

try:
    import requests
except ImportError:
    print("The 'requests' library is required but not installed.")
    print("Install it with: python -m pip install requests")
    sys.exit(1)


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


def main():
    infile = "SourceCode/Benchmarks_Order_Repos.csv"
    outfile = "SourceCode/Benchmarks_Order_Repos_with_branch_counts.csv"

    # <-- Put your token here (you provided it earlier). Keep it secret on your machine.
    token = "XXX"

    if not os.path.isfile(infile):
        print(f"Input file not found: {infile}")
        sys.exit(1)

    rows_out = []

    with open(infile, newline='', encoding='utf-8') as f:
        reader = csv.reader(f)
        header = next(reader, None)
        if header is None:
            print("Input CSV is empty.")
            sys.exit(1)

        # prepare header: ensure third column header is 'branch_count'
        header_out = list(header)
        if len(header_out) >= 3:
            header_out[2] = "branch_count"
        else:
            header_out.append("branch_count")
        rows_out.append(header_out)

        for line_no, row in enumerate(reader, start=2):  # start=2 because header is line 1
            # normalize row to at least 2 columns
            if len(row) < 2:
                print(f"[Line {line_no}] skipping: not enough columns -> {row}")
                rows_out.append(row + [""])
                continue

            owner = row[0].strip()
            repo = row[1].strip()

            if not owner or not repo:
                print(f"[Line {line_no}] skipping: empty owner or repo -> {row}")
                rows_out.append(row + [""])
                continue

            try:
                count = get_branch_count(owner, repo, token)
                print(f"[Line {line_no}] {owner}/{repo}: {count}")
                rows_out.append(row + [str(count)])
            except Exception as e:
                # on any error, skip the row (write empty third column) and continue
                print(f"[Line {line_no}] {owner}/{repo}: ERROR: {e}  -- skipping")
                rows_out.append(row + [""])

            # small delay to be polite with the API (optional)
            time.sleep(0.1)

    # write output CSV
    with open(outfile, "w", newline='', encoding='utf-8') as f:
        writer = csv.writer(f)
        writer.writerows(rows_out)

    print(f"Done. Output written to: {outfile}")


if __name__ == "__main__":
    main()
