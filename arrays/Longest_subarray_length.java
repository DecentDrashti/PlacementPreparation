import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = {3, 1, 4, 2, 5, 1, 1};
        int target = 7;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 exists before the array starts
        map.put(0, -1);

        int prefixSum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {

            // Add current element
            prefixSum += arr[i];

            // Prefix sum we need
            int required = prefixSum - target;

            // Check if required prefix sum exists
            if (map.containsKey(required)) {

                int previousIndex = map.get(required);

                int length = i - previousIndex;

                maxLength = Math.max(maxLength, length);
            }

            // Store only the first occurrence
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        System.out.println("Longest subarray length: " + maxLength);
    }
}
