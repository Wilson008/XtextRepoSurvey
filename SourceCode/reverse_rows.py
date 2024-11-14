import csv

# 定义输入和输出文件路径
input_file = 'SourceCode/file_commit_message_rh.csv'
output_file = 'SourceCode/file_commit_msg_temp.csv'

# 打开输入文件并读取，处理并写入到输出文件
with open(input_file, 'r', encoding='ISO-8859-1') as infile, open(output_file, 'w', newline='', encoding='ISO-8859-1') as outfile:
    reader = csv.reader(infile)
    writer = csv.writer(outfile)
    
    # 读取表头并写入输出文件
    header = next(reader)
    writer.writerow(header)
    
    # 临时存储相同file_path的行
    temp_rows = []
    prev_file_path = None
    
    for row in reader:
        current_file_path = row[2]  # 当前行的file_path在第三列
        
        # 如果file_path相同，继续存储当前行
        if current_file_path == prev_file_path:
            temp_rows.append(row)
        else:
            # 如果file_path不同，则将之前的temp_rows倒置并写入
            if temp_rows:
                writer.writerows(reversed(temp_rows))  # 写入倒置的行
            # 重置temp_rows并开始存储新的file_path的行
            temp_rows = [row]
        
        # 更新prev_file_path
        prev_file_path = current_file_path
    
    # 写入最后一组倒置的行
    if temp_rows:
        writer.writerows(reversed(temp_rows))

print("文件处理完成，输出文件保存为:", output_file)
