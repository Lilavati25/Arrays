import java.util.*;
public class FiboRecur {
     public static void main (String[]args)
      {
        Scanner sc = new Scanner(System.in);
        int a,b,num;
        a = 0;
        b = 1;

        System.out.println("Enter number");
        num = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        fibo(a,b,num - 2);
      }

      public static void fibo(int a, int b, int num){

        if(num == 0){
            return ;
        }
        int c = a+b;
        System.out.println(c);
        fibo(b,c,num-1);
      }
}