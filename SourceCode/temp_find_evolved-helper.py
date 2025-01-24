import csv

# Input and output file paths
input_file = "SourceCode/auto_analysis_results/file_commit_msg_with_time.csv"
output_file = "SourceCode/find_evolved_helper.csv"

# Open the input file and read it line by line
with open(input_file, mode='r', encoding='utf-8') as infile, open(output_file, mode='w', encoding='utf-8', newline='') as outfile:
    reader = csv.reader(infile)
    writer = csv.writer(outfile)
    
    # Read header
    header = next(reader)
    # Add a new column "O" after the table header
    header.append("O")
    writer.writerow(header)
    
    # Initializing variables
    previous_filename = None  # The file name used to temporarily save the previous line
    
    # Read line by line
    for row in reader:
        current_filename = row[2]  # Column C file name
        
        # Determine whether the file name is the same as the previous line
        if current_filename == previous_filename:
            row.append("yes")
        else:
            row.append("no")
        
        # Writing to a new file
        writer.writerow(row)
        
        # Update the file name of the previous line
        previous_filename = current_filename
