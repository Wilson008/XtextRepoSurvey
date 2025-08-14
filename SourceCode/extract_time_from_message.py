import csv
import re

# 定义输入和输出文件路径
input_file = 'SourceCode/file_commit_message_sorted.csv'
output_file = 'SourceCode/file_commit_msg_with_time.csv'

# 正则表达式，用于匹配时间格式 [YYYY-MM-DDTHH:MM:SS±HH:MM]
time_pattern = re.compile(r'^\[(\d{4}-\d{2}-\d{2}T\d{2}:\d{2}:\d{2}[+-]\d{2}:\d{2})\]\s*')

# 打开输入文件并读取，处理并写入到输出文件
with open(input_file, 'r', encoding='utf-8') as infile, open(output_file, 'w', newline='', encoding='utf-8') as outfile:
    reader = csv.reader(infile)
    writer = csv.writer(outfile)
    
    # 读取并写入表头
    header = next(reader)
    writer.writerow(header)  # 写入原始表头
    
    # 处理每一行
    for row in reader:
        commit_message = row[7]  # 第8列是commit_message
        match = time_pattern.search(commit_message)
        
        if match:
            # 从commit_message中提取时间
            extracted_time = match.group(1)
            row[6] = extracted_time  # 将提取的时间放入第7列commit_time
            
            # 删除commit_message中的时间信息
            row[7] = time_pattern.sub('', commit_message).strip()
        
        # 写入处理后的行
        writer.writerow(row)

print("文件处理完成，输出文件保存为:", output_file)
