// Sum of the Numbers in a String Given a string, calculate the sum of numbers in a string (multiple consecutive digits are considered one number)

// Input : string = "123xyz" Output : 123 Explanation : The only number is 123, so the sum = 123

// Input : string = "1xyz23" Output : 24 Explanation : Numbers are 1 and 23, sum = 24

//(ch - '0') for converting string to int 
//-->The character '0' has a decimal value of 48.
//For example, if ch = '5':(ch - '0')=53-48=5

public class NumberSumLoop {
    public static int sumOfNumbers(String input) {
        int totalSum = 0;
        int currentNum = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                // Shift digits left and add the new digit
                currentNum = currentNum * 10 + (ch - '0');
            } else {
                // Non-digit found; add accumulated number to total
                totalSum += currentNum;
                currentNum = 0; // Reset for the next number
            }
        }
        // Add the last number if the string ends with a digit
        totalSum += currentNum;
        return totalSum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNumbers("123xyz")); // Output: 123
        System.out.println(sumOfNumbers("1xyz23")); // Output: 24
    }
}
