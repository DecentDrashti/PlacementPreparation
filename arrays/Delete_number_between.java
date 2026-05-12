//WAP to delete an element from array specified by user. if element is not found print a message 
//“Element is not found” (do not take a new array). 
import java.util.Scanner;
public class Delete_number_between{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the element to remove from array");
        int element = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[] = new int[n];
        int k=n;
        for(int i=0; i<k; i++){
            int temp = sc.nextInt();
            if(temp!=element){
                arr[i] = temp;
            }else{
                arr[n-1] = 0;
                k =n-1;// or some default value
                i--;
            }
            System.out.println("Array a["+i+"] = "+arr[i]);
        }
    }
}