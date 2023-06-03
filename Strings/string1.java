//TO REVERSE STRING
import java.util.Scanner;
public class string1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input");
        String s = sc.nextLine();
        String res = reverseString(s);
        System.out.println("Reverse string :" +res);
    }
    public static String reverseString(String s) {
        char[] a = s.toCharArray();
        for(int i=0,j =a.length-1;i<j;i++,j--){
                char t = a[i];
                a[i] = a[j];
                a[j] = t;
            }  
        String retstr = new String(a);
        return retstr;
    }

}

