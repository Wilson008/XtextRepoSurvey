import csv

# Define input and output file paths
input_file = 'SourceCode/file_commit_message_rh.csv'
output_file = 'SourceCode/file_commit_msg_temp.csv'

# Opens the input file for reading, processes and writes to the output file
with open(input_file, 'r', encoding='ISO-8859-1') as infile, open(output_file, 'w', newline='', encoding='ISO-8859-1') as outfile:
    reader = csv.reader(infile)
    writer = csv.writer(outfile)
    
    # Read the header and write it to the output file
    header = next(reader)
    writer.writerow(header)
    
    # Temporarily store rows with the same file_path
    temp_rows = []
    prev_file_path = None
    
    for row in reader:
        current_file_path = row[2]  # The file_path of the current line is in the third column
        
        # If file_path is the same, continue to store the current line
        if current_file_path == prev_file_path:
            temp_rows.append(row)
        else:
            # If file_path is different, then invert the previous temp_rows and write
            if temp_rows:
                writer.writerows(reversed(temp_rows))  # Writing inverted lines
            # Reset temp_rows and start storing rows for the new file_path
            temp_rows = [row]
        
        # Update prev_file_path
        prev_file_path = current_file_path
    
    # Write the last set of inverted rows
    if temp_rows:
        writer.writerows(reversed(temp_rows))

print("文件处理完成，输出文件保存为:", output_file)
