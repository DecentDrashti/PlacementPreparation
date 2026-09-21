//  You are given an integer num. Rearrange the digits of num such that its value is minimized 
// and it does not contain any leading zeros. 
// Return the rearranged number with minimal value. 
// Note that the sign of the number does not change a er rearranging the digits. 
// Input: num = 310 
// Output: 103 
// Explanation: The possible arrangements for the digits of 310 are 013, 031, 103, 130, 301, 
// 310. 
// The arrangement with the smallest value that does not contain any leading zeros is 103. 

import java.util.Arrays;

public class MinNumber {

    public static long smallestNumber(long num) {

        if(num == 0) return 0;

        boolean negative = num < 0;

        num = Math.abs(num);

        char[] digits = String.valueOf(num).toCharArray();
      //String.valueOf(num) -->Converts the integer num into its string representation.
      //.toCharArray()-->Converts the String "1234" into a char[].Result: digits = ['1', '2', '3', '4'].

        Arrays.sort(digits);

        if(!negative) {

            if(digits[0] == '0') {

                for(int i=1;i<digits.length;i++) {
                    if(digits[i] != '0') {
                        char temp = digits[0];
                        digits[0] = digits[i];
                        digits[i] = temp;
                        break;
                    }
                }
            }

            return Long.parseLong(new String(digits));
          //digits-->This is expected to be a char[], an array of characters that each represent a numeric digit.
          //new String(digits)-->Converts the char[] array into a String.
          //Long.parseLong(String s)-->This is a static method in the Long class.It takes a String that represents a numeric value and converts it into a long.

        }
        else {

            StringBuilder sb = new StringBuilder(new String(digits));
            sb.reverse();

            return -Long.parseLong(sb.toString());
        }
    }

    public static void main(String[] args) {

        long num = 310;

        System.out.println(smallestNumber(num));
    }
}
//string to integer
//int result = Integer.parseInt(new String(digits));
       // System.out.println(result);
