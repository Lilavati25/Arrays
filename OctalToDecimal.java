import java.util.*;
public class OctalToDecimal {
    public static void main(String[] args){

        int num,dec= 0,rem,i=1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Octal  number");
        num = sc.nextInt();

       while(num!=0){

        rem = num % 10;
        dec = dec + rem * i;
        i = i * 8;
        num = num/10;
       }
       System.out.println("The Decimal number is "+dec );

    }
}
