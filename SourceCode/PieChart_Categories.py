import matplotlib.pyplot as plt

# Data Definition
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

total_count = 226

# Calculate the percentage for each category
category_percentages = {category: (count / total_count) * 100 for category, count in categories.items()}

# Data preparation
# labels = list(category_percentages.keys())
sizes = list(category_percentages.values())

# Draw a pie chart
fig, ax = plt.subplots(figsize=(10, 8))
colors = [
    'brown', 'blue', 'magenta', 'purple', 'teal', 'cyan', 'yellow', 'green', 
    'gold', 'maroon', 'olive', 'pink', 'orange', 'navy', 'lightblue', 'red',
    'gray', 'lime'
]
ax.pie(sizes, autopct='%1.1f%%', startangle=140, 
       textprops={'fontsize': 9}, wedgeprops={'edgecolor': 'black'}, 
       colors=colors)

ax.set_title("Category Distribution")

# Save image as PDF file
plt.savefig("SourceCode\proportion_of_repos_in_categories.pdf", format="pdf", bbox_inches='tight')
print('Successfully saved proportion_of_repos_in_categories.pdf')

# Show Chart
plt.show()
