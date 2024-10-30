import pandas as pd
import matplotlib.pyplot as plt
import matplotlib.cm as cm

# 读取数据
data = pd.read_csv("SourceCode\created_date_of_categories.csv")

# 将创建日期解析为日期格式
data['created_date'] = pd.to_datetime(data['created_date'])

# 提取年份
data['year'] = data['created_date'].dt.year

# 设置时间范围
years = list(range(2010, 2024))  # 从2010年到2023年
categories = data['category'].unique()  # 获取所有的类别

# 创建一个字典来存储每个类别在每年累积的repo数量
category_cumulative_count = {category: [0] * len(years) for category in categories}

# 计算累积数量
for category in categories:
    cumulative_sum = 0
    for i, year in enumerate(years):
        # 计算当前年份的数量并累加
        current_year_count = data[(data['category'] == category) & (data['year'] == year)].shape[0]
        cumulative_sum += current_year_count
        category_cumulative_count[category][i] = cumulative_sum

# 开始绘制
plt.figure(figsize=(14, 8))
colors = cm.get_cmap('tab20', len(categories))  # 使用一个颜色映射来获取18种不同颜色

for idx, category in enumerate(categories):
    plt.plot(years, category_cumulative_count[category], marker='o', color=colors(idx), label=category)

# 图表设置
plt.xlabel("Year")
plt.ylabel("Cumulative Number of Repositories Created")
plt.title("Cumulative Repositories Created per Category (2010-2023)")
plt.legend(loc='upper left', bbox_to_anchor=(1.15, 1))  # 图例放置在右上角
plt.grid(True)
plt.tight_layout()

# 保存图像为 PDF 文件
plt.savefig("SourceCode\cumulative_repositories_per_category.pdf", format="pdf")

# 显示图表
plt.show()
