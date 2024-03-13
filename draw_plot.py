import matplotlib.pyplot as plt

# Define data
x_labels = ['0%~10%', '10%~20%', '20%~30%', '30%~40%', '40%~50%', '50%~60%', '60%~70%', '70%~80%', '80%~90%', '90%~100%']
y_values = [417, 30, 17, 14, 21, 8, 17, 21, 17, 146]

# Plot
plt.figure(figsize=(10, 6))
bars = plt.bar(x_labels, y_values, color='skyblue')

# Display values on top of bars
for bar in bars:
    yval = bar.get_height()
    plt.text(bar.get_x() + bar.get_width()/2, yval + 10, yval, ha='center', va='bottom')

# Set title and labels
# plt.title('Relationship between Git repository active time ratio and repository count')
plt.xlabel("Time between first and last Xtext commit or modification in amount of repository's commits")
plt.ylabel('Repository Count')

# Rotate x-axis labels by 45 degrees
plt.xticks(rotation=45, ha='right')

# Remove the border around the plot
plt.gca().spines['top'].set_visible(False)
plt.gca().spines['right'].set_visible(False)
plt.gca().spines['left'].set_visible(False)
plt.gca().spines['bottom'].set_visible(False)

# Save the plot to a local file
plt.tight_layout()
plt.savefig('git_repository_plot.png', bbox_inches='tight', transparent=True)

# Show the plot
plt.show()
