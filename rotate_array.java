import java.util.Scanner;
public class Rotate_Array{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the number of rotations:");
        int k = sc.nextInt();
        int[] arr = new int[n];
        if(k>n){
            k = k%n;
        }
        System.out.println("Enter the elements of the array:");
        for(int i = k; i <n; i++){
            if(i==n-1){
                arr[i] = sc.nextInt();
                System.out.println("element " + "arr[" + i + "]: " + arr[i]);
                i=0;
                arr[i] = sc.nextInt();
            }
            else if(i==k-1){
                arr[i] = sc.nextInt();
                System.out.println("element " + "arr[" + i + "]: " + arr[i]);
                break;
            }
            else{
                arr[i] = sc.nextInt();
            }
            System.out.println("element " + "arr[" + i + "]: " + arr[i]);
        }
    }
}
