import csv

# 输入和输出文件路径
input_file = "SourceCode/auto_analysis_results/file_commit_msg_with_time.csv"
output_file = "SourceCode/find_evolved_helper.csv"

# 打开输入文件，逐行读取
with open(input_file, mode='r', encoding='utf-8') as infile, open(output_file, mode='w', encoding='utf-8', newline='') as outfile:
    reader = csv.reader(infile)
    writer = csv.writer(outfile)
    
    # 读取表头
    header = next(reader)
    # 在表头后添加新列 "O"
    header.append("O")
    writer.writerow(header)
    
    # 初始化变量
    previous_filename = None  # 用于暂存上一行的文件名
    
    # 逐行读取
    for row in reader:
        current_filename = row[2]  # Column C 的文件名
        
        # 判断是否与上一行文件名相同
        if current_filename == previous_filename:
            row.append("yes")
        else:
            row.append("no")
        
        # 写入新文件
        writer.writerow(row)
        
        # 更新上一行的文件名
        previous_filename = current_filename
