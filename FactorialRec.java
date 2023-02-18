import java.util.*;
public class FactorialRec {
    public static void printFactorial(int n, int fact) {
            if(n == 0) {
                System.out.println("The Factorial is " +fact);
                return;
            }
            fact *= n;
            printFactorial(n-1, fact);
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        printFactorial(num, 1);
    }
}


