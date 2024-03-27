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
        print("File doesn't exist!")
        return None, None, None

    # 提取 total_count 和 incomplete_results
    total_count = search_results.get("total_count")
    incomplete_results = search_results.get("incomplete_results")

    # 检查是否找到了 total_count
    if total_count is None:
        print("Can't find total_count field!")
        return None, None, None

    # 检查是否找到了 items 列表
    if "items" not in search_results:
        print("Can't find items list")
        return None, None, None

    # 解析每个 item
    seen_items = set()  # 用于记录已经见过的item，使用(item_name, owner_id)作为唯一标识
    items = []
    for item in search_results["items"]:
        # 检查是否为fork，如果是则跳过
        if item["fork"]:
            continue

        # 提取item的唯一标识，使用(item_name, owner_id)作为唯一标识
        item_unique_id = (item["name"], item["owner"]["id"])

        # 如果该item已经在已见过的集合中，则跳过
        if item_unique_id in seen_items:
            continue

        # 将item添加到已见过的集合中，并添加到items列表中
        seen_items.add(item_unique_id)
        items.append({
            "Owner Login": item["owner"]["login"],  # 添加所有者的登录名
            "Repository Name": item["name"],
            "Repository URL": item["html_url"]
            
        })

    return total_count, incomplete_results, items

# 写入CSV文件
def write_to_csv(file_path, items):
    if not items:
        print("There is no data for writing.")
        return

    # 写入CSV文件
    with open(file_path, "w", newline="", encoding="utf-8") as csvfile:
        fieldnames = ["Owner Login", "Repository Name", "Repository URL"]
        writer = csv.DictWriter(csvfile, fieldnames=fieldnames)
        writer.writeheader()
        for item in items:
            writer.writerow(item)

    print("CSV is created and successfully written with searched results and information!。")

# 测试函数
total_count, incomplete_results, items = read_data("search_results/Python_search_results.txt")
if total_count is not None:
    print("total_count:", total_count)
    print("incomplete_results:", incomplete_results)
    print("items:")
    for item in items:
        print(item)

# 写入CSV文件
write_to_csv("search_results_files_without_duplicate.csv", items)
