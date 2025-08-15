import pandas as pd
from datetime import datetime
import os

def calculate_repo_lifespan(input_file, output_file):
    """
    Calculate the repository lifespan (in days) and save it to a new file.
    
    Parameters:
    input_file: Path to the input Excel file
    output_file: Path to the output Excel file
    """
    
    try:
        # Read the Excel file
        print(f"Reading file: {input_file}")
        df = pd.read_excel(input_file)
        
        print(f"File read successfully, total {len(df)} rows")
        print(f"Column names: {list(df.columns)}")
        
        # Show the first few rows to confirm structure
        print("\nFirst 5 rows of data:")
        print(df.head())
        
        # Get the 3rd column (creation date) and 4th column (last commit date)
        # Note: Python uses zero-based indexing, so 3rd column index = 2, 4th column index = 3
        created_date_col = df.iloc[:, 2]  # 3rd column: creation date
        last_commit_col = df.iloc[:, 3]   # 4th column: last commit date
        
        print(f"\nData type of creation date column: {created_date_col.dtype}")
        print(f"Data type of last commit date column: {last_commit_col.dtype}")
        
        # Initialize lifespan list
        lifespan_days = []
        
        # Process each row to calculate lifespan
        for i in range(len(df)):
            try:
                # Get creation date and last commit date
                created_date = created_date_col.iloc[i]
                last_commit_date = last_commit_col.iloc[i]
                
                # Handle missing creation date
                if pd.isna(created_date):
                    lifespan_days.append(None)
                    print(f"Row {i+1}: Creation date is empty")
                    continue
                
                # If it's a string, parse it
                if isinstance(created_date, str):
                    created_dt = datetime.strptime(created_date, "%Y-%m-%d")
                else:
                    # Already a datetime object
                    created_dt = pd.to_datetime(created_date)
                
                # Handle missing last commit date
                if pd.isna(last_commit_date):
                    lifespan_days.append(None)
                    print(f"Row {i+1}: Last commit date is empty")
                    continue
                
                # If it's a string, parse it
                if isinstance(last_commit_date, str):
                    # Try multiple date formats
                    try:
                        # First try M/D/YYYY format
                        last_commit_dt = datetime.strptime(last_commit_date, "%m/%d/%Y")
                    except ValueError:
                        try:
                            # Try MM/DD/YYYY format
                            last_commit_dt = datetime.strptime(last_commit_date, "%m/%d/%Y")
                        except ValueError:
                            try:
                                # Try YYYY-MM-DD format
                                last_commit_dt = datetime.strptime(last_commit_date, "%Y-%m-%d")
                            except ValueError:
                                print(f"Row {i+1}: Unable to parse last commit date format: {last_commit_date}")
                                lifespan_days.append(None)
                                continue
                else:
                    # Already a datetime object
                    last_commit_dt = pd.to_datetime(last_commit_date)
                
                # Calculate lifespan in days
                lifespan = (last_commit_dt - created_dt).days
                lifespan_days.append(lifespan)
                
                # Print progress every 100 rows
                if (i + 1) % 100 == 0:
                    print(f"Processed {i + 1} rows")
                
            except Exception as e:
                print(f"Error processing row {i+1}: {str(e)}")
                lifespan_days.append(None)
        
        # Add lifespan to the 6th column in DataFrame
        df['Lifespan_Days'] = lifespan_days
        
        # Show statistics
        valid_lifespans = [x for x in lifespan_days if x is not None]
        if valid_lifespans:
            print(f"\nSuccessfully calculated lifespan for {len(valid_lifespans)} repositories")
            print(f"Average lifespan: {sum(valid_lifespans) / len(valid_lifespans):.2f} days")
            print(f"Shortest lifespan: {min(valid_lifespans)} days")
            print(f"Longest lifespan: {max(valid_lifespans)} days")
        
        # Save to output file
        print(f"\nSaving to: {output_file}")
        df.to_excel(output_file, index=False)
        print("File saved successfully!")
        
        # Show preview of results
        print("\nPreview of results (first 5 rows):")
        print(df[['Lifespan_Days']].head())
        
        return df
        
    except Exception as e:
        print(f"Error occurred while processing file: {str(e)}")
        return None

def main():
    # File paths
    input_file = "SourceCode/repos_created_time_new.xlsx"
    output_file = "SourceCode/repos_lifespan_days_new.xlsx"
    
    # Check if input file exists
    if not os.path.exists(input_file):
        print(f"Error: Input file {input_file} does not exist")
        print("Please make sure the file path is correct")
        return
    
    # Run lifespan calculation
    result = calculate_repo_lifespan(input_file, output_file)
    
    if result is not None:
        print(f"\nTask completed! Results saved to {output_file}")
    else:
        print("\nTask failed, please check error messages")

if __name__ == "__main__":
    main()
