import statistics

def read_numbers_from_file(filename):
    """Read integers or floats from a text file, one per line."""
    numbers = []
    with open(filename, "r", encoding="utf-8") as f:
        for line in f:
            line = line.strip()
            if line:  # skip empty lines
                try:
                    numbers.append(float(line))
                except ValueError:
                    print(f"Skipping invalid line: {line}")
    return numbers

def main():
    filename = "SourceCode/225.repo.branch.count.txt"
    numbers = read_numbers_from_file(filename)
    
    if not numbers:
        print("No valid numbers found in the file.")
        return
    
    median_value = statistics.median(numbers)
    print(f"Total numbers read: {len(numbers)}")
    print(f"Median value: {median_value}")

if __name__ == "__main__":
    main()
