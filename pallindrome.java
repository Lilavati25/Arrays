import java.util.*;
public class pallindrome{
   public static void main (String[]args)
   {
    
     int num , reverse = 0, rem, temp;
     
     Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number");
    num = sc.nextInt();
    
     temp = num;
    
     while (temp != 0)
       {
     	rem = temp % 10;
     	reverse = reverse * 10 + rem;
     	temp /= 10;
       };

     if (num == reverse)
       System.out.println (num + " is Palindrome");
     else
       System.out.println (num + " is not Palindrome");
   }
 }