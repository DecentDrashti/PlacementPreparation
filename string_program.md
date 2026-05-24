# String Problems:
## 1️⃣ Reverse a String

Example
Input: "hello"
Output: "olleh"

    String str = "hello";
    String rev = "";
    
    for(int i = str.length()-1; i >= 0; i--){
        rev = rev + str.charAt(i);
    }
    
    System.out.println(rev);

## 2️⃣ Check Palindrome String

Example
Input: "madam"
Output: Palindrome

    String str = "madam";
    String rev = "";
    
    for(int i = str.length()-1; i >= 0; i--){
        rev += str.charAt(i);
    }
    
    if(str.equals(rev)){
        System.out.println("Palindrome");
    }else{
        System.out.println("Not Palindrome");
    }

## 3️⃣ Count Vowels and Consonants

      String str = "programming";
      int vowels = 0, consonants = 0;
      
      for(int i=0;i<str.length();i++){
          char ch = str.charAt(i);
      
          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
              vowels++;
          }else{
              consonants++;
          }
      }
      
      System.out.println("Vowels: "+vowels);
      System.out.println("Consonants: "+consonants);

## 5️⃣ Count Frequency of Each Character

Example
program

Output

p=1
r=2
o=1
g=1
a=1
m=1

     String str = "program";
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // If character exists, increment count. Otherwise, start at 1.
            if (frequency.containsKey(ch)) {
                frequency.put(ch, frequency.get(ch) + 1);
            } else {
                frequency.put(ch, 1);
            }
        }

        System.out.println(frequency); 
### or(in python)
        text = "program"
        frequency = {}
        for char in text:
            # 1. Look for the character. If not found, start at 0.
            # 2. Add 1 to that number.
            frequency[char] = frequency.get(char, 0) + 1
        
        print(frequency)
### or 
    text = "program"
    frequency = {}
    
    for char in text:
        if char in frequency:
            frequency[char] = frequency[char] + 1  # Already saw it? Add 1
        else:
            frequency[char] = 1                    # New character? Start at 1
    
    print(frequency)


## 6️⃣ Remove Spaces from String

    String str = "hello world java";
    String result = "";
    
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)!=' '){
            result += str.charAt(i);
        }
    }
    
    System.out.println(result);

## 7️⃣ Check Anagram
Two strings contain same characters in different order

    String s1 = "listen";
    String s2 = "silent";
    
    char a[] = s1.toCharArray();
    char b[] = s2.toCharArray();
    
    Arrays.sort(a);
    Arrays.sort(b);
    
    if(Arrays.equals(a,b)){
        System.out.println("Anagram");
    }else{
        System.out.println("Not Anagram");
    }

## 8️⃣ Find First Non-Repeating Character

Example
programming

Output

p

      String str = "programming";
      
      for(int i=0;i<str.length();i++){
          int count=0;
      
          for(int j=0;j<str.length();j++){
              if(str.charAt(i)==str.charAt(j)){
                  count++;
              }
          }
      
          if(count==1){
              System.out.println(str.charAt(i));
              break;
          }
      }

### or( in python)
    text = "swiss"
    frequency = {}
    
    # Step 1: Count frequencies
    for char in text:
        if char in frequency:
            frequency[char] += 1
        else:
            frequency[char] = 1
    
    # Step 2: Find the first character with a count of 1
    first_unique = None
    for char in text:
        if frequency[char] == 1:
            first_unique = char
            break
    
    print("First non-repeating character:", first_unique)# Output: w

## 9️⃣ Convert First Letter of Each Word to Capital

Example
hello world java

Output
Hello World Java

    String str = "hello world java";
    String words[] = str.split(" ");
    
    for(int i=0;i<words.length;i++){
        String first = words[i].substring(0,1).toUpperCase();
        String rest = words[i].substring(1);
    
        System.out.print(first + rest + " ");
    }
    
## 🔟 Count Words in String
    String str = "hello world java programming";
    
    String words[] = str.split(" ");
    
    System.out.println("Total words = "+words.length);

## 11 most reapeating char return that word from list
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
    
