import java.util.*;
public class PerfectNum{
    public  static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++)
        {
     	    if (n % i == 0)
 	        sum = sum + i;
        }

        if (sum == n)
            System.out.println (n + " Is a perfect number");
        else
            System.out.println (n + " Is not a perfect number");

   }
 }

//Perfect Numbers means the sum of given numbers divisor should be equal to the given number
/*  eg num= 6
  its divisors are - 1+2+3 = 6
 */