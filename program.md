# 🔁 loop logic programs (python)

this repository contains basic and intermediate loop logic programs using python.
all programs are written in a simple and easy manner, suitable for beginners and placement preparation.

# Level 1 – Basic Loop Logic


## 2️⃣Find factorial of a given number (n!)

    n = int(input("Enter a number: "))
    fact = 1
    
    for i in range(1, n + 1):
        fact = fact * i
    
    print("Factorial is:", fact)


## 3️⃣Print sum series 1 + 4 + 9 + 16 + … + n

    n = int(input("Enter limit: "))
    total = 0
    
    for i in range(1, n + 1):
        total = total + (i * i)
    
    print("Sum of series:", total)


## 4️⃣Print digits of a number in reverse order

    num = int(input("Enter a number: "))
    
    while num > 0:
        print(num % 10)
        num = num // 10


## 5️⃣Print sum of digits of a given number

    num = int(input("Enter a number: "))
    sum_digits = 0
    
    while num > 0:
        sum_digits = sum_digits + (num % 10)
        num = num // 10
    
    print("Sum of digits:", sum_digits)


## 6️⃣Perform multiplication without using * operator

    a = int(input("Enter first number: "))
    b = int(input("Enter second number: "))
    result = 0
    
    for i in range(b):
        result = result + a
    
    print("Multiplication result:", result)


## 7️⃣Calculate x^y without using power operator

    x = int(input("Enter base: "))
    y = int(input("Enter power: "))
    result = 1
    
    for i in range(y):
        result = result * x
    
    print("Result:", result)

# Level 2 – Loops with Conditional Logic

## 🔟Find the sum of all divisors of a number

    n = int(input("Enter a number: "))
    total = 0
    
    for i in range(1, n + 1):
        if n % i == 0:
            total = total + i
    
    print("Sum of divisors:", total)


## 1️⃣1️⃣Find the GCD (Greatest Common Divisor) of two numbers

    a = int(input("Enter first number: "))
    b = int(input("Enter second number: "))
    gcd = 1
    
    for i in range(1, min(a, b) + 1):
        if a % i == 0 and b % i == 0:
            gcd = i
    
    print("GCD is:", gcd)


## 1️⃣2️⃣Find the LCM (Least Common Multiple) of two numbers

    a = int(input("Enter first number: "))
    b = int(input("Enter second number: "))
    num = max(a, b)
    
    while True:
        if num % a == 0 and num % b == 0:
            print("LCM is:", num)
            break
        num = num + 1


## 1️⃣3️⃣Check whether a number is a Perfect Number

    n = int(input("Enter a number: "))
    total = 0
    
    for i in range(1, n):
        if n % i == 0:
            total = total + i
    
    if total == n:
        print("Perfect Number")
    else:
        print("Not a Perfect Number")


## 1️⃣4️⃣Check whether a number is a Harshad Number

    n = int(input("Enter a number: "))
    temp = n
    sum_digits = 0
    
    while temp > 0:
        sum_digits = sum_digits + (temp % 10)
        temp = temp // 10
    
    if n % sum_digits == 0:
        print("Harshad Number")
    else:
        print("Not a Harshad Number")


## 1️⃣5️⃣Check whether a number is Prime or Not

    n = int(input("Enter a number: "))
    count = 0
    
    for i in range(1, n + 1):
        if n % i == 0:
            count = count + 1
    
    if count == 2:
        print("Prime Number")
    else:
        print("Not a Prime Number")


## 1️⃣6️⃣Print the Fibonacci Series

    n = int(input("Enter number of terms: "))
    a = 0
    b = 1
    
    print(a, b, end=" ")
    
    for i in range(2, n):
        c = a + b
        print(c, end=" ")
        a = b
        b = c


## 1️⃣7️⃣Find the sum of series 1 – 2 + 3 – 4 + … ± n

    n = int(input("Enter value of n: "))
    total = 0
    
    for i in range(1, n + 1):
        if i % 2 == 0:
            total = total - i
        else:
            total = total + i
    
    print("Sum of series:", total)s:", total)

# Level 3 – Nested Loops, Patterns and Arrays
## 1️⃣Find the sum of 1+(1+2)+(1+2+3)+…(1+2+3+…+n)

    n = int(input("Enter value of n: "))
    total_sum = 0
    
    for i in range(1, n + 1):
        inner_sum = 0
        for j in range(1, i + 1):
            inner_sum = inner_sum + j
        total_sum = total_sum + inner_sum
    
    print("Sum is:", total_sum)

    or 
        for i in range(1, n + 1):
            total_sum=n*(n+1)/2
        print("Sum is:", total_sum)

## 2️⃣Power without using multiplication and power operator

    x = int(input("Enter base: "))
    y = int(input("Enter power: "))
    result = 1
    
    for i in range(y):
        temp = 0
        for j in range(x):
            temp = temp + result
        result = temp
    
    print("Result:", result)

## 3️⃣implement a pattern

    1
    
    1 2
    
    1 2 3
    
    1 2 3 4
    
    1 2 3 4 5

    for i in range(1, 6):
        for j in range(1, i + 1):
            print(j, end=" ")
        print()

## 4️⃣implement a pattern

        *
      * * *
    * * * * *

    public class PyramidPattern {
    public static void main(String[] args) {
        int n = 3;   // number of rows

        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }

            // print stars
            for (int k = 1; k <= (2*i - 1); k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    }

## 5️⃣implement a pattern

1

2   3

4   5  6

7   8   9  10

11  12  13  14  15

    num = 1
    
    for i in range(1, 6):
        for j in range(i):
            print(num, end=" ")
            num = num + 1
        print()

## 6️⃣Find a Largest Element in array

    arr = [10, 25, 3, 89, 45]
    largest = arr[0]
    
    for i in arr:
        if i > largest:
            largest = i
    
    print("Largest element:", largest)

## 7️⃣Find a Smallest Element in array

    arr = [10, 25, 3, 89, 45]
    smallest = arr[0]
    
    for i in arr:
        if i < smallest:
            smallest = i
    
    print("Smallest element:", smallest)

## 8️⃣Search for an element in Array

    arr = [10, 25, 3, 89, 45]
    key = int(input("Enter element to search: "))
    found = False
    
    for i in arr:
        if i == key:
            found = True
            break
    
    if found:
        print("Element found")
    else:
        print("Element not found")

## 9️⃣Reverse an Array Elements

    arr = [10, 20, 30, 40, 50]
    n = len(arr)
    
    for i in range(n // 2):
        temp = arr[i]
        arr[i] = arr[n - i - 1]
        arr[n - i - 1] = temp
    
    print("Reversed array:", arr)
