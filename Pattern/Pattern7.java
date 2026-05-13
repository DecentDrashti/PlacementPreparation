import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a=66;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print(i+" ");
                }
                else{

                    int distI = (i <= n / 2 + 1) ? i : (n - i + 1);
                    int distJ = (j <= n / 2 + 1) ? j : (n - j + 1);
                    
                    // The smaller distance determines which "ring" we are in
                    int minSearch = (distI < distJ) ? distI : distJ;

                    // 3. Map distance to ASCII alphabet 
                    // (dist 2 = 'A', dist 3 = 'B', etc.)
                    char letter = (char) ('A' + (minSearch - 2));
                    System.out.print(letter + " ");
                }
            }

            System.out.println();
        }
    }
}
