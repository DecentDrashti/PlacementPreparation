public class Pattern5 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println("1");
            } else if (i == 2) {
                System.out.println("1 * 1");
            } else {
                // Logic for Row 3 and beyond: 1 * 3 * ... * max * ... * 1
                int maxOdd = 2 * (i - 1) - 1;

                // Ascending part: 1 to maxOdd
                for (int j = 1; j <= (maxOdd + 1) / 2; j++) {
                    System.out.print(2 * j - 1);
                    System.out.print(" * ");
                }

                // Descending part: maxOdd-2 down to 1
                for (int j = (maxOdd - 1) / 2; j >= 1; j--) {
                    System.out.print(2 * j - 1);
                    if (j > 1) System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}
