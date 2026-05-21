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

## most reapeating char return that word from list
words_list = ["cat", "apple", "banana", "hello"]

    highest_repeat_word = ""
    max_frequency_seen = 0
    
    for word in words_list:
        # Step 1: Count character frequencies for the current word
        char_counts = {}
        for char in word:
            if char in char_counts:
                char_counts[char] += 1
            else:
            char_counts[char] = 1
            
    # Step 2: Find the highest frequency in this specific word
    current_word_max = 0
    for char in char_counts:
        if char_counts[char] > current_word_max:
            current_word_max = char_counts[char]
            
    # Step 3: Check if this word beats the overall champion
    if current_word_max > max_frequency_seen:
        max_frequency_seen = current_word_max
        highest_repeat_word = word

print("Word with most repeating character:", highest_repeat_word)
# Output: banana (because 'a' repeats 3 times)
