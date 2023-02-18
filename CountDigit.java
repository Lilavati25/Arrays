import java.util.*;
public class CountDigit {
     public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        num = sc.nextInt();
        int num1 = num;
        int count = 0;
        while(num!=0){

            int lastnum = num % 10;
            count++;
            num = num/10;
        }

        System.out.println("Total digits in number " + num1 + " is " +count);

        
    }
}
