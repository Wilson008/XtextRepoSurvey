import os
import re
import csv
import zipfile

def find_mwe2_files(repo_name):
    repo_path = os.path.join("E:\\xtext_repositories", repo_name + ".zip")
    if not os.path.exists(repo_path):
        return None

    mwe2_extensions = set()  # Use a set to store unique extensions
    print("Searching for mwe2 files in", repo_name + ".zip...")

    with zipfile.ZipFile(repo_path, 'r') as zip_ref:
        file_list = zip_ref.namelist()

        # Check if mwe2 file exists
        mwe2_files = [file for file in file_list if file.endswith('.mwe2')]
        if not mwe2_files:
            return None

        # Check if mwe2 file contains new file extensions
        for mwe2_file in mwe2_files:
            with zip_ref.open(mwe2_file) as f:
                try:
                    mwe2_content = f.read().decode('utf-8')
                except UnicodeDecodeError:
                    # Try decoding with different encoding
                    mwe2_content = f.read().decode('gbk')  # or other encoding
                match = re.search(r'var file\.extensions\s*=\s*"([^"]+)"', mwe2_content)
                if match:
                    mwe2_extensions.update(match.group(1).split(','))  # Update set with extensions
                    continue

                match = re.search(r'fileExtensions\s*=\s*"([^"]+)"', mwe2_content)
                if match:
                    mwe2_extensions.update(match.group(1).split(','))  # Update set with extensions

    return mwe2_extensions


def main():
    with open('analysis_results/mwe2_extension_results.csv', newline='') as csvfile:
        reader = csv.reader(csvfile)
        next(reader)  # Skip header
        found_extensions = []

        for row in reader:
            owner_login, repo_name, contains_mwe2 = row
            contains_mwe2 = contains_mwe2.upper()

            mwe2_extensions = None
            if contains_mwe2 == "YES":
                mwe2_extensions = find_mwe2_files(repo_name)

            if mwe2_extensions:
                found_extensions.append([owner_login, repo_name, ",".join(mwe2_extensions)])
            else:
                found_extensions.append([owner_login, repo_name, ""])

    # Write results to found_extensions.csv
    with open('found_extensions.csv', 'w', newline='') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(['Owner Login', 'Repo Name', 'Found Extensions'])
        # Remove duplicates before writing to file
        for row in found_extensions:
            writer.writerow([row[0], row[1], ",".join(sorted(set(row[2].split(','))))])


if __name__ == "__main__":
    main()
