import java.util.*;
public class Revdigit{

    public static void main(String[] args){

        int num,r,rev=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        num = sc.nextInt();

       while(num>0){

            r = num % 10;
            rev = rev * 10 + r;
            num = num/10;
       }
       System.out.println("sum of digits is " +rev);
     

    }
}