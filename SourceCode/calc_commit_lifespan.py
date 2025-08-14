import pandas as pd
from datetime import datetime
import numpy as np

def calculate_commit_days_after_repo_creation():
    """
    计算每个commit发生在其所在仓库创建多少天之后
    """
    # 文件路径
    commits_file = "SourceCode/commits (evolutionary steps).xlsx"
    repos_file = "SourceCode/226 repos with lifespans.xlsx"
    output_file = "SourceCode/commits_with_days_after_creation.xlsx"
    
    try:
        # 读取表格A (commits信息)
        print("正在读取commits数据...")
        df_commits = pd.read_excel(commits_file)
        print(f"成功读取commits数据，共{len(df_commits)}行")
        
        # 读取表格B (repositories信息)
        print("正在读取repositories数据...")
        df_repos = pd.read_excel(repos_file)
        print(f"成功读取repositories数据，共{len(df_repos)}行")
        
        # 显示表格结构
        print("\n表格A的列名:", list(df_commits.columns))
        print("表格B的列名:", list(df_repos.columns))
        
        # 创建一个字典来快速查找仓库创建日期
        # 使用 (login, repo_name) 作为键
        repo_creation_dict = {}
        
        print("\n正在构建仓库创建日期查找字典...")
        for _, row in df_repos.iterrows():
            login = row['Owner Login']
            repo_name = row['Repository Name']
            created_date = row['Created date']
            
                    # 处理日期格式，假设是 "MM/DD/YYYY" 格式
            if pd.notna(created_date):
                if isinstance(created_date, str):
                    try:
                        # 尝试解析 MM/DD/YYYY 格式
                        created_datetime = datetime.strptime(created_date, "%m/%d/%Y")
                    except ValueError:
                        try:
                            # 尝试其他可能的格式
                            created_datetime = pd.to_datetime(created_date)
                        except:
                            print(f"警告: 无法解析日期 {created_date} for {login}/{repo_name}")
                            continue
                else:
                    # 如果已经是datetime对象
                    created_datetime = pd.to_datetime(created_date)
                
                # 确保创建日期格式正确
                repo_creation_dict[(login, repo_name)] = created_datetime
        
        print(f"成功构建了{len(repo_creation_dict)}个仓库的创建日期查找字典")
        
        # 为表格A添加第八列："Days After Repo Creation"
        days_after_creation = []
        
        print("\n正在处理每个commit...")
        processed_count = 0
        not_found_count = 0
        
        for index, row in df_commits.iterrows():
            login = row['login']
            repo_name = row['repo_name']
            commit_time_str = row['commit_time']
            
            # 查找仓库创建日期
            repo_key = (login, repo_name)
            
            if repo_key in repo_creation_dict:
                repo_creation_date = repo_creation_dict[repo_key]
                
                # 解析commit时间，只取日期部分
                try:
                    # commit_time格式类似 "2021-07-14T07:18:34+02:00"
                    commit_datetime = pd.to_datetime(commit_time_str)
                    
                    # 只取日期部分，忽略时间和时区
                    commit_date = commit_datetime.date()
                    repo_creation_date_only = repo_creation_date.date()
                    
                    # 计算天数差异
                    time_diff = commit_date - repo_creation_date_only
                    days_diff = time_diff.days
                    
                    days_after_creation.append(days_diff)
                    processed_count += 1
                    
                except Exception as e:
                    print(f"警告: 无法解析commit时间 {commit_time_str} for {login}/{repo_name}: {e}")
                    days_after_creation.append(None)
            else:
                print(f"警告: 未找到仓库 {login}/{repo_name} 的创建日期")
                days_after_creation.append(None)
                not_found_count += 1
            
            # 显示进度
            if (index + 1) % 50 == 0:
                print(f"已处理 {index + 1}/{len(df_commits)} 条记录...")
        
        # 将计算结果添加到DataFrame的第八列
        df_commits['Days After Repo Creation'] = days_after_creation
        
        # 保存结果到新的Excel文件
        print(f"\n正在保存结果到 {output_file}...")
        df_commits.to_excel(output_file, index=False)
        
        # 显示统计信息
        print(f"\n处理完成!")
        print(f"总计处理: {len(df_commits)} 条commit记录")
        print(f"成功计算: {processed_count} 条记录")
        print(f"未找到仓库: {not_found_count} 条记录")
        
        # 显示一些统计信息
        valid_days = [d for d in days_after_creation if d is not None]
        if valid_days:
            print(f"\n统计信息:")
            print(f"平均天数: {np.mean(valid_days):.2f}")
            print(f"中位数天数: {np.median(valid_days):.2f}")
            print(f"最小天数: {min(valid_days)}")
            print(f"最大天数: {max(valid_days)}")
        
        # 显示前几行结果作为示例
        print(f"\n前5行结果示例:")
        print(df_commits[['login', 'repo_name', 'commit_time', 'Days After Repo Creation']].head())
        
        return df_commits
        
    except FileNotFoundError as e:
        print(f"错误: 找不到文件 {e}")
        return None
    except Exception as e:
        print(f"处理过程中发生错误: {e}")
        return None

if __name__ == "__main__":
    # 运行脚本
    result = calculate_commit_days_after_repo_creation()
    
    if result is not None:
        print("\n脚本执行成功！结果已保存到 'SourceCode/commits_with_days_after_creation.xlsx'")
    else:
        print("\n脚本执行失败，请检查错误信息")