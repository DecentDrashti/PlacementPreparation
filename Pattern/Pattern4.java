public class Pattern4 {
    public static void main(String[] args) {
        int n=4;
        int size=2*n-1;

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
            
            int min1 = i < (size - i - 1) ? i : (size - i - 1);
            int min2 = j < (size - j - 1) ? j : (size - j - 1);
            int min = min1 < min2 ? min1 : min2;
            System.out.print(n - min);
            }
            System.out.println();

        }

    }
}
