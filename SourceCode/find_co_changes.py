import pandas as pd
from datetime import datetime, timedelta

def process_commits(file_path):
    # Load the Excel file
    df = pd.read_excel(file_path, engine='openpyxl')

    # Ensure the commit_time column is converted to datetime (with UTC timezone)
    df['commit_time'] = pd.to_datetime(df['commit_time'], utc=True)

    # Create an empty column for the result
    df['is_related'] = 'no'

    # Group by repository login and repo_name
    grouped = df.groupby(['login', 'repo_name'])

    # Iterate through each group
    for (login, repo_name), group in grouped:
        commits = group.sort_values(by='commit_time')
        
        # Iterate through each commit in the group
        for index, row in commits.iterrows():
            current_time = row['commit_time']
            current_file_types = {
                'is_Xtext': row['is_Xtext'],
                'is_Ecore': row['is_Ecore'],
                'is_Instance': row['is_Instance']
            }

            # Check for related commits within a 5-day window
            has_related_commit = False
            for other_index, other_row in commits.iterrows():
                if index == other_index:
                    continue

                other_time = other_row['commit_time']
                time_diff = abs((current_time - other_time).days)

                if time_diff <= 5:
                    other_file_types = {
                        'is_Xtext': other_row['is_Xtext'],
                        'is_Ecore': other_row['is_Ecore'],
                        'is_Instance': other_row['is_Instance']
                    }

                    # Check if file types are different
                    if current_file_types != other_file_types:
                        has_related_commit = True
                        break

            # Update the result column
            if has_related_commit:
                df.at[index, 'is_related'] = 'yes'

    # Remove timezone info before saving to Excel
    df['commit_time'] = df['commit_time'].dt.tz_localize(None)

    # Save the updated DataFrame back to the Excel file
    df.to_excel(file_path, index=False, engine='openpyxl')

# File path to the Excel file
file_path = 'SourceCode/temp_input.xlsx'
process_commits(file_path)
