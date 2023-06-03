//reversing a string without changing its sequence
import java.util.Scanner;
public class string2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Input");
            String s = sc.nextLine();
            System.out.println(reverse(s)); 
           
        }    

        public static String reverse(String s) {
            String w[] = s.split(" ");
            for(int i=0;i<w.length-1;i++){
              StringBuffer buf = new StringBuffer(w[i]);
              w[i] = buf.reverse().toString();
            }
            return s.join(" ", w);
        }
}
