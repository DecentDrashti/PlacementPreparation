// WAP for following Scenario. 
// Given n rupees and a chocolate price of m for each chocolate, with a wrapper exchange offer of 1 
// chocolate per k wrappers, calculate the total number of chocolates you can eat with n rupees. 

import java.util.Scanner;

public class ChocolateProblem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total money (n): ");
        int n = sc.nextInt();

        System.out.print("Enter price per chocolate (m): ");
        int m = sc.nextInt();

        System.out.print("Enter wrappers needed for exchange (k): ");
        int k = sc.nextInt();

        int chocolates = n / m;
        int wrappers = chocolates;
        int total = chocolates;

        while (wrappers >= k) {
            int extra = wrappers / k;
            total += extra;
            wrappers = (wrappers % k) + extra;
        }

        System.out.println("Total chocolates you can eat: " + total);

        sc.close();
    }
}

//Example

// Let’s take:

// n = 15
// m = 1
// k = 3

// Step 1:

// 15 / 1 = 15 chocolates
// wrappers = 15

// Step 2:

// 15 / 3 = 5 extra
// wrappers = 5

// Step 3:

// 5 / 3 = 1 extra
// wrappers = 3

// Step 4:

// 3 / 3 = 1 extra
// wrappers = 1

// Stop.

// Total:

// 15 + 5 + 1 + 1 = 22 chocolates
