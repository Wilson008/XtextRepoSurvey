import pandas as pd
from datetime import datetime
import numpy as np

def calculate_commit_days_after_repo_creation():
    """
    Calculate how many days after its repository's creation each commit occurred.
    """
    # File paths
    commits_file = "SourceCode/commits (evolutionary steps).xlsx"
    repos_file = "SourceCode/226 repos with lifespans.xlsx"
    output_file = "SourceCode/commits_with_days_after_creation.xlsx"
    
    try:
        # Read Table A (commits information)
        print("Reading commits data...")
        df_commits = pd.read_excel(commits_file)
        print(f"Successfully read commits data, total {len(df_commits)} rows")
        
        # Read Table B (repositories information)
        print("Reading repositories data...")
        df_repos = pd.read_excel(repos_file)
        print(f"Successfully read repositories data, total {len(df_repos)} rows")
        
        # Show table structures
        print("\nColumns in Table A:", list(df_commits.columns))
        print("Columns in Table B:", list(df_repos.columns))
        
        # Create a dictionary for quick lookup of repository creation dates
        # Use (login, repo_name) as the key
        repo_creation_dict = {}
        
        print("\nBuilding repository creation date lookup dictionary...")
        for _, row in df_repos.iterrows():
            login = row['Owner Login']
            repo_name = row['Repository Name']
            created_date = row['Created date']
            
            # Handle date format, assuming "MM/DD/YYYY" format
            if pd.notna(created_date):
                if isinstance(created_date, str):
                    try:
                        # Try parsing as MM/DD/YYYY format
                        created_datetime = datetime.strptime(created_date, "%m/%d/%Y")
                    except ValueError:
                        try:
                            # Try other possible formats
                            created_datetime = pd.to_datetime(created_date)
                        except:
                            print(f"Warning: Unable to parse date {created_date} for {login}/{repo_name}")
                            continue
                else:
                    # If already a datetime object
                    created_datetime = pd.to_datetime(created_date)
                
                # Ensure correct date format
                repo_creation_dict[(login, repo_name)] = created_datetime
        
        print(f"Successfully built creation date dictionary for {len(repo_creation_dict)} repositories")
        
        # Prepare to add the 8th column: "Days After Repo Creation"
        days_after_creation = []
        
        print("\nProcessing each commit...")
        processed_count = 0
        not_found_count = 0
        
        for index, row in df_commits.iterrows():
            login = row['login']
            repo_name = row['repo_name']
            commit_time_str = row['commit_time']
            
            # Look up repository creation date
            repo_key = (login, repo_name)
            
            if repo_key in repo_creation_dict:
                repo_creation_date = repo_creation_dict[repo_key]
                
                # Parse commit time and take only the date part
                try:
                    # commit_time format example: "2021-07-14T07:18:34+02:00"
                    commit_datetime = pd.to_datetime(commit_time_str)
                    
                    # Take only the date part, ignoring time and timezone
                    commit_date = commit_datetime.date()
                    repo_creation_date_only = repo_creation_date.date()
                    
                    # Calculate day difference
                    time_diff = commit_date - repo_creation_date_only
                    days_diff = time_diff.days
                    
                    days_after_creation.append(days_diff)
                    processed_count += 1
                    
                except Exception as e:
                    print(f"Warning: Unable to parse commit time {commit_time_str} for {login}/{repo_name}: {e}")
                    days_after_creation.append(None)
            else:
                print(f"Warning: Repository creation date not found for {login}/{repo_name}")
                days_after_creation.append(None)
                not_found_count += 1
            
            # Show progress
            if (index + 1) % 50 == 0:
                print(f"Processed {index + 1}/{len(df_commits)} records...")
        
        # Add calculation results to the 8th column of DataFrame
        df_commits['Days After Repo Creation'] = days_after_creation
        
        # Save results to a new Excel file
        print(f"\nSaving results to {output_file}...")
        df_commits.to_excel(output_file, index=False)
        
        # Show statistics
        print(f"\nProcessing complete!")
        print(f"Total commits processed: {len(df_commits)}")
        print(f"Successfully calculated: {processed_count}")
        print(f"Repositories not found: {not_found_count}")
        
        # Show additional statistics
        valid_days = [d for d in days_after_creation if d is not None]
        if valid_days:
            print(f"\nStatistics:")
            print(f"Average days: {np.mean(valid_days):.2f}")
            print(f"Median days: {np.median(valid_days):.2f}")
            print(f"Minimum days: {min(valid_days)}")
            print(f"Maximum days: {max(valid_days)}")
        
        # Show first few rows as example
        print(f"\nFirst 5 rows preview:")
        print(df_commits[['login', 'repo_name', 'commit_time', 'Days After Repo Creation']].head())
        
        return df_commits
        
    except FileNotFoundError as e:
        print(f"Error: File not found {e}")
        return None
    except Exception as e:
        print(f"An error occurred during processing: {e}")
        return None

if __name__ == "__main__":
    # Run the script
    result = calculate_commit_days_after_repo_creation()
    
    if result is not None:
        print("\nScript executed successfully! Results saved to 'SourceCode/commits_with_days_after_creation.xlsx'")
    else:
        print("\nScript execution failed, please check the error messages")
