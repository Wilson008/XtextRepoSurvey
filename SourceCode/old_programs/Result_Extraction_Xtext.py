import json
import csv

def read_data(file_path):
    total_count = None
    incomplete_results = None
    items = []

    # 读取文件内容
    try:
        with open(file_path, 'r', encoding='utf-8') as file:
            search_results = json.load(file)
    except FileNotFoundError:
        print("文件不存在！")
        return None, None, None

    # 提取 total_count 和 incomplete_results
    total_count = search_results.get("total_count")
    incomplete_results = search_results.get("incomplete_results")

    # 检查是否找到了 total_count
    if total_count is None:
        print("无法找到 total_count 字段！")
        return None, None, None

    # 检查是否找到了 items 列表
    if "items" not in search_results:
        print("无法找到 items 列表！")
        return None, None, None

    # 解析每个 item
    items = []
    for item in search_results["items"]:
        # 检查是否为fork，如果是则跳过
        if item["fork"]:
            continue

        # 提取所需信息
        repository_name = item["name"]
        repository_html_url = item["html_url"]
        owner_name = item["owner"]["login"]

        # 添加到 items 列表中
        items.append({
            "Repository Name": repository_name,
            "Repository HTML URL": repository_html_url,
            "Owner Name": owner_name
        })

    return total_count, incomplete_results, items

# 写入CSV文件
def write_to_csv(file_path, items):
    if not items:
        print("没有可写入的数据！")
        return

    # 写入CSV文件
    with open(file_path, "w", newline="", encoding="utf-8") as csvfile:
        fieldnames = ["Repository Name", "Repository HTML URL", "Owner Name"]
        writer = csv.DictWriter(csvfile, fieldnames=fieldnames)
        writer.writeheader()
        for item in items:
            writer.writerow(item)

    print("CSV文件已创建并成功写入搜索结果信息。")

# 测试函数
total_count, incomplete_results, items = read_data("search_results/Python_search_results.txt")
if total_count is not None:
    print("total_count:", total_count)
    print("incomplete_results:", incomplete_results)
    print("items:")
    for item in items:
        print(item)

# 写入CSV文件
write_to_csv("analysis_results/search_results_files_with_duplicate.csv", items)
