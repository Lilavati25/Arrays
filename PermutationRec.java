import java.util.*;
public class PermutationRec {

    static void printPermutn(String str, String ans) {

        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {

            
            char ch = str.charAt(i);

           
            String r = str.substring(0, i) + str.substring(i + 1);

            
            printPermutn(r, ans + ch);
        }
    }

    
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nenter string");
        str = sc.next();
        System.out.println("Permutations of string are: ");
        printPermutn(str, "");
       
    }
}