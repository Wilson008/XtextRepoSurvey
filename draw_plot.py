import matplotlib.pyplot as plt
from matplotlib_venn import venn3

# 数据
total_repos = 1002
xtext_repos = 738
ecore_repos = 417
mwe2_repos = 717
xtext_ecore_repos = 408
mwe2_xtext_repos = 714
mwe2_ecore_repos = 407
all_three_repos = 407

# 计算各个集合的数量
only_xtext_repos = xtext_repos - xtext_ecore_repos - mwe2_xtext_repos + all_three_repos
only_ecore_repos = ecore_repos - xtext_ecore_repos - mwe2_ecore_repos + all_three_repos
only_mwe2_repos = mwe2_repos - mwe2_xtext_repos - mwe2_ecore_repos + all_three_repos

# 绘制Venn diagram
venn_diagram = venn3(subsets=(only_xtext_repos, only_ecore_repos, xtext_ecore_repos,
                              only_mwe2_repos, mwe2_xtext_repos, mwe2_ecore_repos,
                              all_three_repos),
                     set_labels=('Xtext', 'Ecore', 'Mwe2'))

# 添加标题
plt.title('Repositories with Xtext, Ecore, and Mwe2 Files')

# 标记各个类别的数量
venn_diagram.get_label_by_id('100').set_text(str(only_xtext_repos))
venn_diagram.get_label_by_id('010').set_text(str(only_ecore_repos))
venn_diagram.get_label_by_id('001').set_text(str(only_mwe2_repos))
venn_diagram.get_label_by_id('110').set_text(str(xtext_ecore_repos - all_three_repos))
venn_diagram.get_label_by_id('101').set_text(str(mwe2_xtext_repos - all_three_repos))
venn_diagram.get_label_by_id('011').set_text(str(mwe2_ecore_repos - all_three_repos))
venn_diagram.get_label_by_id('111').set_text(str(all_three_repos))

# 保存为jpg文件
plt.savefig('venn_diagram_labeled.jpg', format='jpg')

# 显示图表
plt.show()
