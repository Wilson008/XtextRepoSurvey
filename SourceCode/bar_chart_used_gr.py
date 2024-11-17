import matplotlib.pyplot as plt

# 数据
categories = ['0', '<=20', '<=40', '<=60', '<=80', '<100', '100']
values = [5, 5, 5, 10, 17, 12, 18]

# 绘图
plt.figure(figsize=(8, 5))  # 设置图表尺寸
bars = plt.bar(categories, values, color='blue', alpha=0.8)

# 添加数值标签
for bar in bars:
    height = bar.get_height()
    plt.text(bar.get_x() + bar.get_width() / 2, height, str(height),
             ha='center', va='bottom', fontsize=10)

# 添加标题和轴标签
plt.title('Number of Repositories by Grammar Rules Usage', fontsize=14)
plt.xlabel('Percentage used/total grammar rules', fontsize=12)
plt.ylabel('Number of repositories', fontsize=12)

# 设置刻度字体
plt.xticks(fontsize=10)
plt.yticks(fontsize=10)

# 显示图表
plt.tight_layout()
plt.savefig('SourceCode/bar_chart_used_gr.pdf')
plt.show()
