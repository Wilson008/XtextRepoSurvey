import pandas as pd
import matplotlib.pyplot as plt
import matplotlib.cm as cm

# 读取数据
data = pd.read_csv("SourceCode\last_commit_date_of_categories.csv")

# 将创建日期解析为日期格式
data['last_commit_date'] = pd.to_datetime(data['last_commit_date'])

# 提取年份
data['year'] = data['last_commit_date'].dt.year

# 设置时间范围
years = list(range(2010, 2025))  # 从2010年到2024年
categories = data['category'].unique()  # 获取所有的类别

# 创建一个字典来存储每个类别在每年创建的repo数量
category_year_count = {category: [0] * len(years) for category in categories}

# 统计每个类别在每年的repo创建数量
for category in categories:
    for year in years:
        count = data[(data['category'] == category) & (data['year'] == year)].shape[0]
        category_year_count[category][year - years[0]] = count

# 开始绘制
plt.figure(figsize=(15, 8))
colors = cm.get_cmap('tab20', len(categories))  # 使用一个颜色映射来获取18种不同颜色

for idx, category in enumerate(categories):
    plt.plot(years, category_year_count[category], marker='o', color=colors(idx), label=category)

# 图表设置
plt.xlabel("Year")
plt.ylabel("Count of Repositories with commits")
plt.title("Count of Repositories with commits per Category per Year (2010-2024)")
plt.legend(loc='upper right', bbox_to_anchor=(1.15, 1))  # 图例放置在右上角
plt.grid(True)
plt.tight_layout()

# 保存图像为 PDF 文件
plt.savefig("SourceCode\Repositories_with_commits_per_category.pdf", format="pdf", bbox_inches="tight")

# 显示图表
plt.show()
