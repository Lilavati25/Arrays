import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        int ch,i;
        int sum=0;
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for(i=0;i<=num;i++)
        {
            sum = sum+i;
        }
        System.out.println(sum + " is sum of first\t" +num+  "\tnatural numbers");
    }
    
}