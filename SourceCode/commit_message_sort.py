# import csv

# # 原始文件路径
# input_file = "SourceCode/file_commit_message.csv"
# # 新文件路径
# output_file = "SourceCode/file_commit_message_sorted.csv"

# def refine_commit_messages(input_file, output_file):
#     """读取并重新格式化commit message至新的文件中"""
#     with open(input_file, mode="r", encoding="utf-8") as infile, open(output_file, mode="w", newline='', encoding="utf-8") as outfile:
#         reader = csv.reader(infile)
#         writer = csv.writer(outfile)
        
#         # 读取表头
#         header = next(reader)
#         # 写入新表头
#         writer.writerow(header[:3] + ["commit_message"])  # 保留前三列，并加上"commit_message"标题
        
#         # 逐行读取
#         for row in reader:
#             # 前三列（login, repo_name, file_path）
#             base_columns = row[:3]
#             # 从第四列开始的所有commit message
#             commit_messages = row[3:]
            
#             # 将每条commit message逐行写入新的csv文件
#             for message in commit_messages:
#                 writer.writerow(base_columns + [message])

# # 调用函数
# refine_commit_messages(input_file, output_file)

import csv
import os

# 原始文件路径
input_file = "SourceCode/file_commit_message.csv"
# 新文件路径
output_file = "SourceCode/file_commit_message_sorted.csv"

def refine_commit_messages(input_file, output_file):
    """读取并重新格式化commit message至新的文件中"""
    with open(input_file, mode="r", encoding="utf-8") as infile, open(output_file, mode="w", newline='', encoding="utf-8") as outfile:
        reader = csv.reader(infile)
        writer = csv.writer(outfile)
        
        # 读取表头并在新表头中添加三列
        header = next(reader)
        writer.writerow(header[:3] + ["is_Xtext", "is_Ecore", "is_Instance", "commit_message"])
        
        # 逐行读取
        for row in reader:
            # 前三列（login, repo_name, file_path）
            base_columns = row[:3]
            file_path = base_columns[2]
            
            # 判断文件类型
            extension = os.path.splitext(file_path)[1].lower()  # 获取文件扩展名并转换为小写
            if extension == ".xtext":
                is_Xtext, is_Ecore, is_Instance = "Yes", "", ""
            elif extension == ".ecore":
                is_Xtext, is_Ecore, is_Instance = "", "Yes", ""
            elif extension == ".xml":
                is_Xtext, is_Ecore, is_Instance = "", "", ""
            else:
                is_Xtext, is_Ecore, is_Instance = "", "", "Yes"

            # 从第四列开始的所有commit message
            commit_messages = row[3:]
            
            # 将每条commit message逐行写入新的csv文件
            for message in commit_messages:
                writer.writerow(base_columns + [is_Xtext, is_Ecore, is_Instance, message])

# 调用函数
refine_commit_messages(input_file, output_file)
