import csv

# 读取原始数据并排序
data = []
with open('SourceCode/auto_analysis_results/count_changed_rules.csv', mode='r', newline='', encoding='utf-8') as csv_file:
    reader = csv.reader(csv_file)
    next(reader)  # 跳过header行
    for row in reader:
        data.append(float(row[2]))  # 读取第三列数据并转换为浮点数

# 保留两位小数
data_rounded = [round(value, 2) for value in data]

sorted_data = sorted(data_rounded)

# 将排序后的数据写入新的CSV文件
with open('SourceCode/auto_analysis_results/xtext_rule_change_ranked.csv', mode='w', newline='', encoding='utf-8') as output_csv:
    writer = csv.writer(output_csv)
    for value in sorted_data:
        writer.writerow([value])
