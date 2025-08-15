import csv
from datetime import datetime

# Input and output file paths
input_file = "SourceCode/auto_analysis_results/file_commit_msg_with_time.csv"
output_file = "SourceCode/calculate_time_diff.csv"

# Open input file for reading, output file for writing
with open(input_file, mode='r', encoding='utf-8') as infile, open(output_file, mode='w', encoding='utf-8', newline='') as outfile:
    reader = csv.reader(infile)
    writer = csv.writer(outfile)

    # Read the header and add a new Column P
    header = next(reader)
    header.append("P")  # Add new column
    writer.writerow(header)

    # Initialize variables
    previous_filename = None  # Filename of the previous row
    previous_date = None      # Date of the previous row

    # Initialize with the first row
    first_row = next(reader)
    previous_filename = first_row[2]  # Initialize with the filename from the first row (Column C)
    previous_date = datetime.strptime(first_row[6], "%Y-%m-%dT%H:%M:%S%z")  # Initialize with the datetime from the first row (Column G)
    first_row.append(0)  # First row gets "0" days because it has no previous commit
    writer.writerow(first_row)

    # Start from the second row and process line by line
    for row in reader:
        current_filename = row[2]  # Column C: filename of the current row
        current_date = datetime.strptime(row[6], "%Y-%m-%dT%H:%M:%S%z")  # Column G: timestamp of the current row

        if current_filename == previous_filename:
            # Same filename: calculate time difference (in days)
            days_diff = (current_date - previous_date).days
        else:
            # Different filename: treat as the first commit for this file
            days_diff = 0

        # Append the days difference to Column P
        row.append(days_diff)

        # Write to the new file
        writer.writerow(row)

        # Update previous filename and date
        previous_filename = current_filename
        previous_date = current_date
