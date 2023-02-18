import java.util.*;
public class FactRec{
    
    static int fact(int num){
        if (num == 0)
        return 1;

        return num * fact(num - 1);
    }
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        num = sc.nextInt();

        System.out.println("The factorial of number is" + fact(num));
        
    }
}