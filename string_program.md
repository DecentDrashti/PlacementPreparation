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
    
    for(int i=0;i<str.length();i++){
        int count=1;
    
        for(int j=i+1;j<str.length();j++){
            if(str.charAt(i)==str.charAt(j)){
                count++;
            }
        }
    
        System.out.println(str.charAt(i)+" = "+count);
    }

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
    
    for(int i=0;i<str.length();i++){
        int count=1;
  
        for(int j=i+1;j<str.length();j++){
            if(str.charAt(i)==str.charAt(j)){
                count++;
            }
        }
    
        System.out.println(str.charAt(i)+" = "+count);
    }

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
