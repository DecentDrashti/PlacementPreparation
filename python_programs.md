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
words_list = ["cat", "apple", "ban", "hello"]

    words_list = ["apple", "hello", "cat"]
    word_scores = {}
    
    # Pass 1: Calculate the max frequency score for every single word
    for word in words_list:
        char_counts = {}
        for char in word:
            char_counts[char] = char_counts.get(char, 0) + 1
        
        word_scores[word] = max(char_counts.values()) if char_counts else 0
    
    # Find the overall maximum score from our records
    overall_max = max(word_scores.values())
    
    # Pass 2: Collect all words that match that top score
    result = []
    for word in words_list:
        if word_scores[word] == overall_max:
            result.append(word)
    
    print("All words with max frequency:", result)
# Output: ['apple', 'hello']
