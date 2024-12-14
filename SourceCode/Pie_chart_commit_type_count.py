import matplotlib.pyplot as plt

# 数据
labels = ['Perfective', 'Adaptive', 'Corrective', 'Unclear', 'Preventive']
# sizes = [304, 68, 50, 11, 5]
sizes = [151, 22, 10, 3, 2]
colors = ['#ff9999', '#66b3ff', '#99ff99', '#c2c2f0', '#ffb3e6']
explode = (0.1, 0, 0, 0, 0)  # 突出最大的一部分

# 按从大到小排序
sorted_data = sorted(zip(sizes, labels, colors), reverse=True)
sizes, labels, colors = zip(*sorted_data)

# 绘制饼状图
plt.figure(figsize=(8, 6))
plt.pie(sizes, labels=labels, autopct='%1.1f%%', startangle=140, colors=colors, explode=explode)
plt.title("Statistics of Commit Types")
plt.axis('equal')  # 保证饼状图为圆形
plt.savefig("SourceCode/commit_distri_co_evolve.pdf", bbox_inches='tight') 
plt.show()
