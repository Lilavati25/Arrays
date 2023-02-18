//print 5 to 1 numbers using recurssion
import java.util.*;
public class PrintOneToFive {
     public static void main(String[] args) {
        int n=1;
        printNum(n);

        
    }
    public static void printNum(int n){
        if(n == 6)
        return;
        System.out.println(n);
        printNum(n+1);
    }
    

}
