import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {
    int ch;
    
    do
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num > 0)
            System.out.println(num + " is positive");
        else
            System.out.println(num + " is negative");
        
        System.out.println("Do you want to continue!!! press 1 ");   
        ch= sc.nextInt();
    }while(ch >= 1);

    }
    
}