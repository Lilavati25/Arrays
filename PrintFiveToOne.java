//print 5 to 1 numbers using recurssion
import java.util.*;
public class PrintFiveToOne {
     public static void main(String[] args) {
        int n=5;
        printNum(n);

        
    }
    public static void printNum(int n){
        if(n == 0)
        return;
        System.out.println(n);
        printNum(n-1);
    }
    

}
