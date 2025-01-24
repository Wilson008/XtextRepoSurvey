import csv

# Read the raw data and sort it
data = []
with open('SourceCode/auto_analysis_results/count_changed_rules.csv', mode='r', newline='', encoding='utf-8') as csv_file:
    reader = csv.reader(csv_file)
    next(reader)  # Skip header line
    for row in reader:
        data.append(float(row[2]))  # Read the third column of data and convert it to floating point numbers

# Keep two decimal places
data_rounded = [round(value, 2) for value in data]

sorted_data = sorted(data_rounded)

# Write the sorted data to a new CSV file
with open('SourceCode/auto_analysis_results/xtext_rule_change_ranked.csv', mode='w', newline='', encoding='utf-8') as output_csv:
    writer = csv.writer(output_csv)
    for value in sorted_data:
        writer.writerow([value])
