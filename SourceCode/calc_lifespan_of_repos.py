import pandas as pd
from datetime import datetime
import os

def calculate_repo_lifespan(input_file, output_file):
    """
    计算存储库的lifespan（生命周期）并保存到新文件
    
    参数:
    input_file: 输入Excel文件路径
    output_file: 输出Excel文件路径
    """
    
    try:
        # 读取Excel文件
        print(f"正在读取文件: {input_file}")
        df = pd.read_excel(input_file)
        
        print(f"文件读取成功，共有 {len(df)} 行数据")
        print(f"列名: {list(df.columns)}")
        
        # 显示前几行数据以确认结构
        print("\n前5行数据:")
        print(df.head())
        
        # 获取第三列（创建日期）和第四列（最后提交日期）
        # 注意：Python中索引从0开始，所以第三列是索引2，第四列是索引3
        created_date_col = df.iloc[:, 2]  # 第三列：创建日期
        last_commit_col = df.iloc[:, 3]   # 第四列：最后提交日期
        
        print(f"\n创建日期列的数据类型: {created_date_col.dtype}")
        print(f"最后提交日期列的数据类型: {last_commit_col.dtype}")
        
        # 初始化lifespan列表
        lifespan_days = []
        
        # 逐行处理日期计算
        for i in range(len(df)):
            try:
                # 获取创建日期和最后提交日期
                created_date = created_date_col.iloc[i]
                last_commit_date = last_commit_col.iloc[i]
                
                # 处理创建日期 - 格式如 "2018-01-15"
                if pd.isna(created_date):
                    lifespan_days.append(None)
                    print(f"第 {i+1} 行: 创建日期为空")
                    continue
                
                # 如果是字符串，解析日期
                if isinstance(created_date, str):
                    created_dt = datetime.strptime(created_date, "%Y-%m-%d")
                else:
                    # 如果已经是datetime对象
                    created_dt = pd.to_datetime(created_date)
                
                # 处理最后提交日期 - 格式如 "9/7/2023"
                if pd.isna(last_commit_date):
                    lifespan_days.append(None)
                    print(f"第 {i+1} 行: 最后提交日期为空")
                    continue
                
                # 如果是字符串，解析日期
                if isinstance(last_commit_date, str):
                    # 尝试不同的日期格式
                    try:
                        # 先尝试 M/D/YYYY 格式
                        last_commit_dt = datetime.strptime(last_commit_date, "%m/%d/%Y")
                    except ValueError:
                        try:
                            # 尝试 MM/DD/YYYY 格式
                            last_commit_dt = datetime.strptime(last_commit_date, "%m/%d/%Y")
                        except ValueError:
                            try:
                                # 尝试 YYYY-MM-DD 格式
                                last_commit_dt = datetime.strptime(last_commit_date, "%Y-%m-%d")
                            except ValueError:
                                print(f"第 {i+1} 行: 无法解析最后提交日期格式: {last_commit_date}")
                                lifespan_days.append(None)
                                continue
                else:
                    # 如果已经是datetime对象
                    last_commit_dt = pd.to_datetime(last_commit_date)
                
                # 计算lifespan（天数）
                lifespan = (last_commit_dt - created_dt).days
                lifespan_days.append(lifespan)
                
                # 每100行打印一次进度
                if (i + 1) % 100 == 0:
                    print(f"已处理 {i + 1} 行")
                
            except Exception as e:
                print(f"第 {i+1} 行处理出错: {str(e)}")
                lifespan_days.append(None)
        
        # 将lifespan添加到数据框的第六列
        df['Lifespan_Days'] = lifespan_days
        
        # 显示一些统计信息
        valid_lifespans = [x for x in lifespan_days if x is not None]
        if valid_lifespans:
            print(f"\n成功计算了 {len(valid_lifespans)} 个存储库的lifespan")
            print(f"平均lifespan: {sum(valid_lifespans) / len(valid_lifespans):.2f} 天")
            print(f"最短lifespan: {min(valid_lifespans)} 天")
            print(f"最长lifespan: {max(valid_lifespans)} 天")
        
        # 保存到新文件
        print(f"\n正在保存到: {output_file}")
        df.to_excel(output_file, index=False)
        print("文件保存成功！")
        
        # 显示结果的前几行
        print("\n结果预览（前5行）:")
        print(df[['Lifespan_Days']].head())
        
        return df
        
    except Exception as e:
        print(f"处理文件时发生错误: {str(e)}")
        return None

def main():
    # 文件路径
    input_file = "SourceCode/repos_created_time_new.xlsx"
    output_file = "SourceCode/repos_lifespan_days_new.xlsx"
    
    # 检查输入文件是否存在
    if not os.path.exists(input_file):
        print(f"错误: 输入文件 {input_file} 不存在")
        print("请确保文件路径正确")
        return
    
    # 执行计算
    result = calculate_repo_lifespan(input_file, output_file)
    
    if result is not None:
        print(f"\n任务完成！结果已保存到 {output_file}")
    else:
        print("\n任务失败，请检查错误信息")

if __name__ == "__main__":
    main()