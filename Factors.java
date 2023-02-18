import java.util.*;
public class Factors
 {
      public static void main(String[] args) {

      int num;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number");
      num = sc.nextInt();

     System.out.println( "Factors of " + num + " are " );

     // finding and printing factors b/w 1 to num
     for(int i = 1; i <= num; i++)
     {
         if(num % i == 0)
         
             System.out.println(i + " "); 
     }

      }
 }