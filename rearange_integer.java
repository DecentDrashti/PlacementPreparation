import java.util.*;

public class rearange_Integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        long num = sc.nextLong();
        System.out.println(rearrange(num));
    }

    public static String rearrange(long num) {
        boolean isNegative = num < 0;
        long n = Math.abs(num);
        ArrayList<Integer> list = new ArrayList<>();

        // 1. Extract digits into ArrayList
        if (n == 0) return "0";
        while (n > 0) {
            list.add((int) (n % 10));
            n /= 10;
        }

        // 2. Sort digits
        if (isNegative) {
            // For negative: Descending (e.g., -310 -> -310)  
            // (-310 < -103), so (-310) is the true minimum value.
            list.sort(Collections.reverseOrder());
        } else {
            // For positive: Ascending (e.g., 310 -> 013)
            Collections.sort(list);

            // 3. Handle leading zeros: Swap first non-zero digit to index 0
            if (list.get(0) == 0) {
                for (int i = 1; i < list.size(); i++) {
                    if (list.get(i) != 0) {
                        // Swap index 0 and the first non-zero index
                        int nonZero = list.get(i);
                        list.set(i, 0);
                        list.set(0, nonZero);
                        break;
                    }
                }
            }
        }

        // 4. Join digits into a string
        StringBuilder sb = new StringBuilder();
        if (isNegative) sb.append("-");
        for (int digit : list) {
            sb.append(digit);
        }

        return sb.toString();
    }
}
