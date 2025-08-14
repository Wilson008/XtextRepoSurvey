import pandas as pd
import matplotlib.pyplot as plt
import matplotlib.cm as cm

# Reading Data
data = pd.read_csv("SourceCode\\auto_analysis_results\\created_date_of_categories.csv")

# Parse the creation date into a date format
data['created_date'] = pd.to_datetime(data['created_date'])

# Extraction year
data['year'] = data['created_date'].dt.year

# Set time range
years = list(range(2010, 2024))  # From 2010 to 2023
categories = data['category'].unique()  # Get all categories

# Create a dictionary to store the number of repos accumulated per category per year
category_cumulative_count = {category: [0] * len(years) for category in categories}

# Calculate cumulative quantity
for category in categories:
    cumulative_sum = 0
    for i, year in enumerate(years):
        # Calculate the number of the current year and add it up
        current_year_count = data[(data['category'] == category) & (data['year'] == year)].shape[0]
        cumulative_sum += current_year_count
        category_cumulative_count[category][i] = cumulative_sum

# Start drawing
plt.figure(figsize=(14, 8))
# colors = cm.get_cmap('tab20', len(categories))  # Use a color map to get 18 different colors
colors = [
    'red', 'blue', 'green', 'orange', 'purple', 'brown', 'pink', 'gray', 
    'yellow', 'cyan', 'magenta', 'lime', 'olive', 'teal', 'navy', 'maroon',
    'gold', 'lightblue'
]

for idx, category in enumerate(categories):
    plt.plot(years, category_cumulative_count[category], marker='o', color=colors[idx], label=category)

# Chart Settings
plt.xlabel("Year")
plt.ylabel("Cumulative Number of Repositories Created")
plt.title("Cumulative Repositories Created per Category (2010-2023)")
plt.legend(loc='upper left', bbox_to_anchor=(1.15, 1))  # Legend placed in the upper right corner
plt.grid(True)
plt.tight_layout()

# Save image as PDF file
plt.savefig("SourceCode\cumulative_repositories_per_category.pdf", format="pdf")

# Show Chart
plt.show()
