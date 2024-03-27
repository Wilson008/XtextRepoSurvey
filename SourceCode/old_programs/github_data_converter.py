def read_data(file_path):
    total_count = None
    incomplete_results = None
    items = []

    # 读取文件内容
    try:
        with open(file_path, 'r') as file:
            lines = file.readlines()
    except FileNotFoundError:
        print("文件不存在！")
        return None, None, None

    # 检查文件格式是否正确
    if len(lines) < 5 or lines[0].strip() != "{" or lines[-1].strip() != "}":
        print("文件格式不正确！")
        return None, None, None

    # 查找 total_count 字符串并获取数值
    for line in lines:
        if '"total_count":' in line:
            total_count = int(line.split(":")[1].strip().rstrip(","))
            break

    # 检查是否找到了 total_count
    if total_count is None:
        print("无法找到 total_count 字符串！")
        return None, None, None

    # 解析完整性标志
    for line in lines:
        if '"incomplete_results":' in line:
            incomplete_results = line.split(":")[1].strip().rstrip(",").lower() == "false"
            break

    # 查找 items 列表部分的起始位置
    start_index = None
    for i, line in enumerate(lines):
        if '"items":' in line and '[' in line:
            start_index = i + 1
            break

    if start_index is None:
        print("无法找到 items 列表部分！")
        return None, None, None

    # 解析列表部分
    end_index = start_index + total_count * 75
    for line in lines[start_index:end_index]:
        items.append(line.rstrip("\n"))
        # items.append(line.strip().rstrip(","))

    return total_count, incomplete_results, items

# 测试函数
total_count, incomplete_results, items = read_data("search_results/Python_search_results.txt")
if total_count is not None:
    print("total_count:", total_count)
    print("incomplete_results:", incomplete_results)
    print("items:")
    for item in items:
        print(item)
