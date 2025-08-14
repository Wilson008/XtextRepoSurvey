import matplotlib.pyplot as plt

# Data
labels = ['Perfective', 'Adaptive', 'Corrective', 'Unclear', 'Preventive']
# sizes = [304, 68, 50, 11, 5]
sizes = [151, 22, 10, 3, 2]
colors = ['#ff9999', '#66b3ff', '#99ff99', '#c2c2f0', '#ffb3e6']
explode = (0.1, 0, 0, 0, 0)  # Highlight the biggest part

# Sort by largest to smallest
sorted_data = sorted(zip(sizes, labels, colors), reverse=True)
sizes, labels, colors = zip(*sorted_data)

# Draw a pie chart
plt.figure(figsize=(8, 6))
plt.pie(sizes, labels=labels, autopct='%1.1f%%', startangle=140, colors=colors, explode=explode)
plt.title("Statistics of Commit Types")
plt.axis('equal')  # Ensure that the pie chart is circular
plt.savefig("SourceCode/commit_distri_co_evolve.pdf", bbox_inches='tight') 
plt.show()
