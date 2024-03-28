import matplotlib.pyplot as plt

# 定义数据
categories = ['Language', 'Training/Examples', 'Infrastructure', 'Experimental/Personal', 'Unrelated']
counts = [228, 215, 110, 343, 106]

# 调整子图间距
plt.subplots_adjust(left=0.1, right=0.9, top=0.9, bottom=0.3)

# 绘制条形图并移除边框
bars = plt.bar(categories, counts, color='grey', linewidth=0, width=0.5, align='center')  # 设置条形宽度为0.6，并居中对齐

# 添加数字标签
for bar, count in zip(bars, counts):
    yval = bar.get_height()
    plt.text(bar.get_x() + bar.get_width()/2, yval, count, ha='center', va='bottom', color='black', fontsize=10)

# 添加坐标轴标签和标题，并设置斜体
# plt.xlabel('Repository Types', color='black')
plt.ylabel('Number of Repositories', color='black')
plt.tick_params(colors='black')

# 设置横坐标标签倾斜角度
plt.xticks(rotation=45, ha='right')

# 保存为PDF文件
plt.savefig('bar_chart_repo_types.pdf', format='pdf', bbox_inches='tight')

# 显示图形
plt.show()
