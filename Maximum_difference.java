//Given an array, find the maximum difference arr[j] - arr[i] where j > i
//input
// 7
// 2 3 10 6 4 8 1
//output
//8 (10-2)
//Important

// We cannot simply find maximum and minimum anywhere.

// The smaller number must occur before the larger number.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int first = sc.nextInt();

        int minElement = first;
        int maxDifference = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {

            int current = sc.nextInt();

            int difference = current - minElement;

            if (difference > maxDifference) {
                maxDifference = difference;
            }

            if (current < minElement) {
                minElement = current;
            }
        }

        System.out.println(maxDifference);
    }
}
