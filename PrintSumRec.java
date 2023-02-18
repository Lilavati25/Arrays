import java.util.*;
public class PrintSumRec {
    public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number");
    int num = sc.nextInt();
    printSum(1,num,0);
    }
    public static void printSum(int i,int num,int sum) {
        if(i == num){
            sum +=i;
            System.out.println("The sum is " +sum);
            return;
        }
        sum += i;
        printSum(i+1,num,sum);
    }
}
