import pandas as pd
import matplotlib.pyplot as plt
import matplotlib.cm as cm

# Reading Data
data = pd.read_csv("SourceCode\last_commit_date_of_categories.csv")

# Parse the creation date into a date format
data['last_commit_date'] = pd.to_datetime(data['last_commit_date'])

# Extraction year
data['year'] = data['last_commit_date'].dt.year

# Set time range
years = list(range(2010, 2025))  # From 2010 to 2024
categories = data['category'].unique()  # Get all categories

# Create a dictionary to store the number of repos created for each category in each year
category_year_count = {category: [0] * len(years) for category in categories}

# Count the number of repos created in each category each year
for category in categories:
    for year in years:
        count = data[(data['category'] == category) & (data['year'] == year)].shape[0]
        category_year_count[category][year - years[0]] = count

# Start drawing
plt.figure(figsize=(15, 8))
colors = cm.get_cmap('tab20', len(categories))  # Use a color map to get 18 different colors

for idx, category in enumerate(categories):
    plt.plot(years, category_year_count[category], marker='o', color=colors(idx), label=category)

# Chart Settings
plt.xlabel("Year")
plt.ylabel("Count of Repositories with commits")
plt.title("Count of Repositories with commits per Category per Year (2010-2024)")
plt.legend(loc='upper right', bbox_to_anchor=(1.15, 1))  # Legend placed in the upper right corner
plt.grid(True)
plt.tight_layout()

# Save image as PDF file
plt.savefig("SourceCode\Repositories_with_commits_per_category.pdf", format="pdf", bbox_inches="tight")

# Show Chart
plt.show()
