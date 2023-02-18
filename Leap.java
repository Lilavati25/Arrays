import java.util.Scanner;

public class Leap{

    public static void main(String[] args) {
    int ch;
    
    do
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if(year % 4 == 0 )
            System.out.println(year + " is leap year");
        else
            System.out.println(year + " not a leap year");
        
        System.out.println("Do you want to continue!!! press 1 ");   
        ch= sc.nextInt();
    }while(ch >= 1);

    }
    
}