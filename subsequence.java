import java.util.Scanner;
public class subsequence{
    public static void subSequences(String str, int idx, String newString ) {
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
       
        char curchar = str.charAt(idx);

        subSequences(str,idx+1,newString+curchar);

        subSequences(str,idx+1,newString);
    }
    public static void main(String[] rags) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.next();
        subSequences(str,0,"");
        
    }
}