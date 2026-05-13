//Given an array of N integers, and an integer K, find the number of pairs of elements in the 
// array whose sum is equal to K. 
// e.g. Input: N = 4, K = 6 
// arr[] = {1, 5, 7, 1} 
// Output: 2 
// Explanation: 
// arr[0] + arr[1] = 1 + 5 = 6 
// and arr[1] + arr[3] = 5 + 1 = 6.
import java.util.*; 
public class sum_equal_k{
    public static void main(String[] args){
        Scanner sc=new Scanner(system.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the number of rotations:");
        int k = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i <n; i++){
            arr[i] = sc.nextInt();
        }
        //int sum=0;
        int count = 0;
        for (int i = 0; i < n; i++) {
          for (int j = i + 1; j < n; j++) { // 'j' acts as your right pointer
            if (arr[i] + arr[j] == k) {
                count++;
            }
     }
    }
    System.out.println("Number of pairs with sum " + k + ": " + count);
}

//or
//public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
        
    //     System.out.print("Enter size: ");
    //     int n = sc.nextInt();
    //     System.out.print("Enter target sum K: ");
    //     int k = sc.nextInt();
        
    //     int[] arr = new int[n];
    //     for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     int count = 0;

    //     for (int i = 0; i < n; i++) {
    //         int complement = k - arr[i];

    //         // If the complement exists in the map, add its frequency to our count
    //         if (map.containsKey(complement)) {
    //             count += map.get(complement);
    //         }

    //         // Store the current number in the map (increment frequency)
    //         map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    //     }

    //     System.out.println("Total pairs: " + count);
    // }