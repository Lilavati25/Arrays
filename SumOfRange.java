//Sum of numbers in given range
import java.util.Scanner;

public class SumOfRange {

    public static void main(String[] args) {
        int ch,i;
        int sum=0;
    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter starting number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter ending number: ");
        int num2 = sc.nextInt();
        
        for(i=num1;i<=num2;i++)
        {
            sum = sum+i;
        }
        System.out.println(sum + " is sum");
    }
    
}