//given a string of surname you need to get unique characters and then find the length if it is even then print even else odd
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuffer st=new StringBuffer();
       
            for(int i=0;i<s.length();i++){
                if(st.indexOf(String.valueOf(s.charAt(i))) != -1){//indexof is used in string buffer not contains is used in string buffer and valueof will convert char into string because indexOf() in StringBuffer can search for a String  Simply it converts 'a' to "a"
                    continue;
                }
                else {
                    st.append(s.charAt(i));
                }
            }
        if(st.length()%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
