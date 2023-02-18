import java.util.*;
public class PrimeRecur {
     public static void main (String[] args)
      {
        Scanner sc = new Scanner(System.in);
        int p,num;

        System.out.println("Enter number");
        num = sc.nextInt();
        p = isPrime(num, num/2);

        if (p == 1){
          System.out.println(num+ " prime number");
        }
        else{
          System.out.println(num+ " not prime number");
        }
       
      }

      public static int isPrime(int num,int i)
      {
        if(i == 1 )
          return 1;

        if(num % i == 0)
          return 0;
        
        return isPrime(num, i-1);
      }
}