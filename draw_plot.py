from matplotlib import pyplot as plt
from matplotlib_venn import venn3

# Define the counts
xtext_repos = 725
ecore_repos = 411
mwe2_repos = 697
ecore_xtext_mwe2_repos = 407

# Calculate the individual and overlapping counts
xtext_only = xtext_repos - ecore_xtext_mwe2_repos
ecore_only = ecore_repos - ecore_xtext_mwe2_repos
mwe2_only = mwe2_repos - ecore_xtext_mwe2_repos
ecore_xtext = ecore_xtext_mwe2_repos
xtext_mwe2 = ecore_xtext_mwe2_repos
ecore_mwe2 = ecore_xtext_mwe2_repos
total_count = xtext_only + ecore_only + mwe2_only + ecore_xtext + xtext_mwe2 + ecore_mwe2

# Create the Venn diagram
venn_labels = ('Xtext', 'Ecore', 'Mwe2')
venn_data = (xtext_only, ecore_only, ecore_xtext,
             mwe2_only, ecore_mwe2, xtext_mwe2,
             ecore_xtext_mwe2_repos)

plt.figure(figsize=(10, 8))
venn = venn3(subsets=venn_data, set_labels=venn_labels)
plt.title('Venn Diagram of Repositories File Types')
plt.savefig('venn_diagram.jpg')
plt.show()
