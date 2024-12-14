import matplotlib.pyplot as plt

# 数据定义
categories = {
    "Modeling, Simulation, and Design": 37,
    "Programming Languages": 36,
    "Data Management and Databases": 27,
    "IoT, Embedded Systems, and Hardware": 19,
    "Software Development and Engineering": 17,
    "Games": 12,
    "Content, Information and Document Management": 12,
    "Mathematics, Logic, and Scientific Computing": 11,
    "Web and Mobile Development": 10,
    "Cloud, APIs, and Web Services": 8,
    "Security and Networking": 6,
    "Graphical User Interfaces (GUI)": 6,
    "Testing and Verification": 6,
    "Miscellaneous": 6,
    "Artificial Intelligence and Machine Learning": 4,
    "Business and Enterprise Applications": 4,
    "Healthcare and Life Sciences": 3,
    "Questionnaire": 2
}

# 总数
total_count = 226

# 计算每个类别的百分比
category_percentages = {category: (count / total_count) * 100 for category, count in categories.items()}

# 数据准备
labels = list(category_percentages.keys())
sizes = list(category_percentages.values())

# 绘制饼状图
fig, ax = plt.subplots(figsize=(10, 8))
ax.pie(sizes, labels=labels, autopct='%1.1f%%', startangle=140, textprops={'fontsize': 9}, wedgeprops={'edgecolor': 'black'})
ax.set_title("Category Distribution")

# 保存图像为 PDF 文件
plt.savefig("SourceCode\proportion_of_repos_in_categories.pdf", format="pdf", bbox_inches='tight')

# 显示图表
plt.show()
