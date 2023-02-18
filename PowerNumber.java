import java.util.*;
public class PowerNumber{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int base,expo;

        System.out.println("Enter base and exponent");
        base = sc.nextInt();
        expo = sc.nextInt();

        int power = 1;
        while(expo != 0){
            power = power * base;
            --expo;
        }

        System.out.println("The power is " +power);

    }
}
