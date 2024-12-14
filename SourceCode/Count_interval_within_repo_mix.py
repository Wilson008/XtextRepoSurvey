import pandas as pd

# 读取 Excel 文件
file_path = "SourceCode/temp_exclude_within_30_days.xlsx"

# 读取文件，第一行是表头
data = pd.read_excel(file_path)

# 确保数据存在，取相关列
data = data.loc[:, ["login", "repo_name", "file_path", "commit_time"]]

# 将 commit_time 转换为 datetime 格式，并移除时区
data["commit_time"] = pd.to_datetime(data["commit_time"], utc=True).dt.tz_localize(None)

# 按 login 和 name 排序，确保同一 repo 的行连续
data = data.sort_values(by=["login", "repo_name", "commit_time"]).reset_index(drop=True)

# 初始化天数差分列
data["days_diff"] = 0.0

# 遍历数据行计算时间差
previous_repo = None  # 用于跟踪上一个 repo
previous_time = None  # 用于跟踪上一个 commit 时间

for idx, row in data.iterrows():
    current_repo = (row["login"], row["repo_name"])  # 当前行的 repo
    current_time = row["commit_time"]          # 当前行的 commit 时间

    # 如果 repo 发生变化，重新计算时间差
    if current_repo != previous_repo:
        data.at[idx, "days_diff"] = 0  # 新 repo 的第一个 commit，时间差为 0
    else:
        # 计算与上一行时间的差异（以天为单位）
        time_diff = (current_time - previous_time).total_seconds() / 86400
        data.at[idx, "days_diff"] = time_diff

    # 更新状态
    previous_repo = current_repo
    previous_time = current_time

# 将结果写入 Column O
data["Column O"] = data["days_diff"].round(0)  # 保留两位小数

# 保存为新的 Excel 文件（如果需要）
output_path = "SourceCode/temp_exclude_within_30_days_with_diff.xlsx"
data.to_excel(output_path, index=False)

print(f"处理完成，结果已保存到 {output_path}")
