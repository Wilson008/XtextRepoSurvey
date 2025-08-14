import pandas as pd
import os

def process_repository_data():
    """
    处理存储库数据，将表格B中的第8列减去对应存储库的lifespan值，结果存入第9列
    """
    
    # 文件路径
    table_a_path = "SourceCode/226 repos with lifespans.xlsx"
    table_b_path = "SourceCode/commits_with_days_after_creation.xlsx"
    
    # 检查文件是否存在
    if not os.path.exists(table_a_path):
        print(f"错误：找不到文件 {table_a_path}")
        return
    
    if not os.path.exists(table_b_path):
        print(f"错误：找不到文件 {table_b_path}")
        return
    
    try:
        # 读取表格A (存储库信息)
        print("正在读取表格A...")
        df_repos = pd.read_excel(table_a_path)
        
        # 确保列名正确 (假设第1列是login，第2列是name，第5列是lifespan)
        # 如果Excel文件有标题行，pandas会自动使用标题作为列名
        # 这里使用位置索引来确保准确性
        repos_columns = df_repos.columns.tolist()
        login_col_a = repos_columns[0]  # 第1列
        name_col_a = repos_columns[1]   # 第2列
        lifespan_col = repos_columns[4] # 第5列
        
        print(f"表格A列名: {repos_columns}")
        print(f"表格A共有 {len(df_repos)} 行数据")
        
        # 创建存储库信息的字典映射 (login, name) -> lifespan
        repo_lifespan_map = {}
        for _, row in df_repos.iterrows():
            login = row[login_col_a]
            name = row[name_col_a]
            lifespan = row[lifespan_col]
            
            # 跳过lifespan为0的存储库
            if lifespan != 0:
                repo_lifespan_map[(login, name)] = lifespan
        
        print(f"创建了 {len(repo_lifespan_map)} 个有效存储库的映射 (跳过了lifespan为0的存储库)")
        
        # 读取表格B (commit信息)
        print("正在读取表格B...")
        df_commits = pd.read_excel(table_b_path)
        
        commits_columns = df_commits.columns.tolist()
        login_col_b = commits_columns[0]    # 第1列
        name_col_b = commits_columns[1]     # 第2列
        days_col = commits_columns[7]       # 第8列
        
        print(f"表格B列名: {commits_columns}")
        print(f"表格B共有 {len(df_commits)} 行数据")
        
        # 添加第9列用于存储结果
        result_col_name = "commit_time_percentage"  # 存储commit时间在存储库生命周期中的百分比
        df_commits[result_col_name] = None
        
        # 统计处理结果
        processed_count = 0
        skipped_count = 0
        not_found_count = 0
        
        # 逐行处理表格B
        print("正在处理数据...")
        for index, row in df_commits.iterrows():
            login = row[login_col_b]
            name = row[name_col_b]
            days_after_creation = row[days_col]
            
            # 查找对应的lifespan
            repo_key = (login, name)
            if repo_key in repo_lifespan_map:
                lifespan = repo_lifespan_map[repo_key]
                # 计算结果：第8列 ÷ lifespan，然后转换为百分比并保留两位小数
                ratio = days_after_creation / lifespan
                percentage = round(ratio * 100, 2)  # 转换为百分比并保留两位小数
                df_commits.at[index, result_col_name] = percentage
                processed_count += 1
            else:
                # 未找到对应的存储库（可能lifespan为0或不存在）
                not_found_count += 1
                # 可以选择跳过或设置为特殊值
                df_commits.at[index, result_col_name] = None  # 或者可以设置为 NaN
        
        print(f"\n处理完成！")
        print(f"成功处理: {processed_count} 行")
        print(f"未找到匹配存储库: {not_found_count} 行")
        
        # 统计百分比分布情况
        valid_percentages = df_commits[result_col_name].dropna()  # 去除None值
        
        early_commits = len(valid_percentages[valid_percentages <= 25])  # 小于等于25%
        late_commits = len(valid_percentages[valid_percentages > 75])    # 大于75%
        middle_commits = len(valid_percentages[(valid_percentages > 25) & (valid_percentages <= 75)])  # 介于25%和75%之间
        
        print(f"\n百分比分布统计：")
        print(f"早期commits（≤25%）: {early_commits} 个")
        print(f"中期commits（25%-75%）: {middle_commits} 个")
        print(f"晚期commits（>75%）: {late_commits} 个")
        
        # 保存结果到原文件
        output_path = table_b_path  # 直接覆盖原文件
        # 如果想保存到新文件，可以修改为：
        # output_path = "commits_with_days_after_creation_updated.xlsx"
        
        print(f"正在保存结果到 {output_path}...")
        df_commits.to_excel(output_path, index=False)
        print("保存完成！")
        
        # 显示一些样本结果
        print("\n前5行结果预览：")
        preview_cols = [login_col_b, name_col_b, days_col, result_col_name]
        print(df_commits[preview_cols].head())
        
    except Exception as e:
        print(f"处理过程中出现错误: {str(e)}")
        import traceback
        traceback.print_exc()

if __name__ == "__main__":
    process_repository_data()