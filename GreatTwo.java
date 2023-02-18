import java.util.*;
public class GreatTwo {

    public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number1 and Number2 ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
     
    if(num1 >  num2)
    System.out.println(num1 + " is greater");
    else
    System.out.println(num2 + " is greater");
   
    }
    
}