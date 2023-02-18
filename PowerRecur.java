import java.util.*;
public class PowerRecur {
     public static void main (String[]args)
      {
        Scanner sc = new Scanner(System.in);
        int base,x;

        System.out.println("Enter base and power");
        base = sc.nextInt();
        x = sc.nextInt();
        System.out.println ("Power is " + power (base, x));
      }

      static int power (int base, int x)
      {
        if (x == 0)    
          return 1;
        return (base * power (base, x - 1));
      }
}