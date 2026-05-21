## each character frequency in python
text = "apple"
frequency = {}

for char in text:
    if char in frequency:
        frequency[char] = frequency[char] + 1  # Already saw it? Add 1
    else:
        frequency[char] = 1                    # New character? Start at 1

print(frequency)
# Output: {'a': 1, 'p': 2, 'l': 1, 'e': 1}
