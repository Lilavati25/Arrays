import java.util.*;
public class NonZeroFactRec {

        static int factorial(int n)
        {
            if(n==0 || n==1)
            return 1;
            
            return n*factorial(n-1);
        }
    
        public static void main(String[] args)
        {
            int n;
            Scanner sc = new Scanner(System.in);

            System.out.println("\nenter end numbers");
            n = sc.nextInt();
            int fact = factorial(n);
            
            int res;
            
            while(fact%10==0){
                fact /=10;
            }
            
            System.out.println("The last non zero digit of " +n+ " factorial is:" +fact%10);
        }
    }