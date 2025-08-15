import pandas as pd
import os

def process_repository_data():
    """
    Process repository data: subtract the lifespan value of the corresponding repository from the 8th column in Table B, 
    and store the result in the 9th column.
    """
    
    # File paths
    table_a_path = "SourceCode/226 repos with lifespans.xlsx"
    table_b_path = "SourceCode/commits_with_days_after_creation.xlsx"
    
    # Check if files exist
    if not os.path.exists(table_a_path):
        print(f"Error: File not found {table_a_path}")
        return
    
    if not os.path.exists(table_b_path):
        print(f"Error: File not found {table_b_path}")
        return
    
    try:
        # Read Table A (repository information)
        print("Reading Table A...")
        df_repos = pd.read_excel(table_a_path)
        
        # Ensure column names are correct (assume col1=login, col2=name, col5=lifespan)
        # If the Excel file has a header row, pandas will automatically use it as column names
        # Use positional indexing here to ensure accuracy
        repos_columns = df_repos.columns.tolist()
        login_col_a = repos_columns[0]  # Column 1
        name_col_a = repos_columns[1]   # Column 2
        lifespan_col = repos_columns[4] # Column 5
        
        print(f"Table A columns: {repos_columns}")
        print(f"Table A has {len(df_repos)} rows")
        
        # Create a mapping (login, name) -> lifespan
        repo_lifespan_map = {}
        for _, row in df_repos.iterrows():
            login = row[login_col_a]
            name = row[name_col_a]
            lifespan = row[lifespan_col]
            
            # Skip repositories with lifespan = 0
            if lifespan != 0:
                repo_lifespan_map[(login, name)] = lifespan
        
        print(f"Created mapping for {len(repo_lifespan_map)} valid repositories (skipped those with lifespan=0)")
        
        # Read Table B (commit information)
        print("Reading Table B...")
        df_commits = pd.read_excel(table_b_path)
        
        commits_columns = df_commits.columns.tolist()
        login_col_b = commits_columns[0]    # Column 1
        name_col_b = commits_columns[1]     # Column 2
        days_col = commits_columns[7]       # Column 8
        
        print(f"Table B columns: {commits_columns}")
        print(f"Table B has {len(df_commits)} rows")
        
        # Add the 9th column to store results
        result_col_name = "commit_time_percentage"  # Percentage of commit time in repository lifespan
        df_commits[result_col_name] = None
        
        # Statistics counters
        processed_count = 0
        skipped_count = 0
        not_found_count = 0
        
        # Process Table B row by row
        print("Processing data...")
        for index, row in df_commits.iterrows():
            login = row[login_col_b]
            name = row[name_col_b]
            days_after_creation = row[days_col]
            
            # Find corresponding lifespan
            repo_key = (login, name)
            if repo_key in repo_lifespan_map:
                lifespan = repo_lifespan_map[repo_key]
                # Calculation: col8 ÷ lifespan, then convert to percentage and round to 2 decimals
                ratio = days_after_creation / lifespan
                percentage = round(ratio * 100, 2)  # Convert to percentage and keep two decimal places
                df_commits.at[index, result_col_name] = percentage
                processed_count += 1
            else:
                # No matching repository found (lifespan might be 0 or missing)
                not_found_count += 1
                # Can choose to skip or set a special value
                df_commits.at[index, result_col_name] = None  # Or could set NaN
        
        print(f"\nProcessing complete!")
        print(f"Successfully processed: {processed_count} rows")
        print(f"No matching repository found: {not_found_count} rows")
        
        # Percentage distribution statistics
        valid_percentages = df_commits[result_col_name].dropna()  # Remove None values
        
        early_commits = len(valid_percentages[valid_percentages <= 25])  # ≤ 25%
        late_commits = len(valid_percentages[valid_percentages > 75])    # > 75%
        middle_commits = len(valid_percentages[(valid_percentages > 25) & (valid_percentages <= 75)])  # 25%-75%
        
        print(f"\nPercentage distribution:")
        print(f"Early commits (≤25%): {early_commits}")
        print(f"Middle commits (25%-75%): {middle_commits}")
        print(f"Late commits (>75%): {late_commits}")
        
        # Save results to original file
        output_path = table_b_path  # Overwrite original file
        # To save to a new file, change to:
        # output_path = "commits_with_days_after_creation_updated.xlsx"
        
        print(f"Saving results to {output_path}...")
        df_commits.to_excel(output_path, index=False)
        print("Save complete!")
        
        # Show preview of first 5 rows
        print("\nPreview of first 5 rows:")
        preview_cols = [login_col_b, name_col_b, days_col, result_col_name]
        print(df_commits[preview_cols].head())
        
    except Exception as e:
        print(f"Error occurred during processing: {str(e)}")
        import traceback
        traceback.print_exc()

if __name__ == "__main__":
    process_repository_data()
