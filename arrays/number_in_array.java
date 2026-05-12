import java.util.Scanner;
public class number_in_array{
    int k=0;
    int isInArray(int arr[], int element){
            if(arr[k++] == element){
                return k-1;
            }else if(k==arr.length-1){
                 return -1;    
            }
    
        return isInArray(arr, element);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the element to search in array");
        int element = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        number_in_array obj = new number_in_array();
        int ans=obj.isInArray(arr, element);
        if(ans==-1){
            System.out.println("Element is not found");
        }else{
            System.out.println("Element is found at index "+ans);
        }
        //System.out.println("Element is found at index "+obj.isInArray(arr, element));
        // for(int i=0; i<n; i++){
        //     arr[i] = sc.nextInt();
        //     if(arr[i] == element){
        //         System.out.println("Element is found at index "+i);
        //         break;
        //     }
        
        //     if(i == n-1){
        //         System.out.println("Element is not found");
        //     }
        // }
    }
}