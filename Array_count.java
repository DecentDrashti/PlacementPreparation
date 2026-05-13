//Write a Func on that returns either 1 or 0 based on following condi on if the array is in 
// ascending order and occurrence of that number at least 3 then it should return 1 otherwise 
// it should return 0. 
//if A=[1,1,1,2,2] it should return 0 
// if A=[1,1,1,3,3,3,3] it should return 1 
// if A=[2,2,2,1,1,1] it should return 0 
import java.util.*;
public class Array_count {
    public  static int count_occurence(int[] arr){
        //Handle empty arrays or arrays too short to meet the requirement
        if (arr == null || arr.length < 3) {
            return 0;
        }

        int count = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            // Rule 1: Check strictly for ascending order
            if (arr[i] > arr[i + 1]) {
                return 0;
            }

            // Rule 2: Track identical consecutive numbers
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                // Rule 3: Validate the minimum group size before moving to a new number
                if (count < 3) {
                    return 0;
                }
                count = 1; // Reset tracking for the new number group
            }
        }

        // Rule 4: Validate the final group at the end of the loop
        return (count >= 3) ? 1 : 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min=arr[0];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Result: " + count_occurence(arr));
    }
}

