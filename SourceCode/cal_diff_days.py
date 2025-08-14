import csv
from datetime import datetime

# 输入和输出文件路径
input_file = "SourceCode/auto_analysis_results/file_commit_msg_with_time.csv"
output_file = "SourceCode/calculate_time_diff.csv"

# 打开输入文件读取，输出文件写入
with open(input_file, mode='r', encoding='utf-8') as infile, open(output_file, mode='w', encoding='utf-8', newline='') as outfile:
    reader = csv.reader(infile)
    writer = csv.writer(outfile)

    # 读取表头并添加新的 Column P
    header = next(reader)
    header.append("P")  # 新增列
    writer.writerow(header)

    # 初始化变量
    previous_filename = None  # 前一行的文件名
    previous_date = None      # 前一行的时间

    # 第一行初始化
    first_row = next(reader)
    previous_filename = first_row[2]  # 初始化为第一行的文件名 (Column C)
    previous_date = datetime.strptime(first_row[6], "%Y-%m-%dT%H:%M:%S%z")  # 初始化为第一行的时间 (Column G)
    first_row.append(0)  # 第一行填入 "0" 天，因为它没有前一个 commit
    writer.writerow(first_row)

    # 从第二行开始逐行读取和处理
    for row in reader:
        current_filename = row[2]  # Column C: 当前行的文件名
        current_date = datetime.strptime(row[6], "%Y-%m-%dT%H:%M:%S%z")  # Column G: 当前行的时间戳

        if current_filename == previous_filename:
            # 文件名相同，计算时间差（天数）
            days_diff = (current_date - previous_date).days
        else:
            # 文件名不同，表示第一次 commit
            days_diff = 0

        # 将天数差填入 Column P
        row.append(days_diff)

        # 写入新文件
        writer.writerow(row)

        # 更新上一行的文件名和时间
        previous_filename = current_filename
        previous_date = current_date
