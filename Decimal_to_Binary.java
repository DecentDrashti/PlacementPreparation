//decimal to binary
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read input number
        
        // Edge case for zero
        if (n == 0) {
            System.out.println(0);
            return;
        }
        
        int[] binary = new int[32]; // Array to store binary digits
        int i = 0;
        
        // Loop to divide and store remainders
        while (n > 0) {
            binary[i] = n % 2; // Store remainder (0 or 1)
            n = n / 2;         // Update quotient
            i++;
        }
        
        // Print the array in reverse order
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }
        System.out.println();
        sc.close();
    }
}
