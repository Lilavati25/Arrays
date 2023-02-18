import java.util.*;
public class PermutationEx {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n,r;

        System.out.println("Enter number of students");
        n = sc.nextInt(); 

        System.out.println("Enter number of seats");
        r = sc.nextInt(); 

        int fact1 = 1;

        for(int i = n; i > 1; i = i-1 ){

            fact1 = fact1 * i;
        }

        int number = n -r;

        int fact2 = 1;

        for(int i = number; i > 1; i = i-1 ){

            fact2 = fact2 * i;
        }

        int per = fact1 / fact2;

        System.out.println(per+ " numbers of ways students can seats");
    
    }
}
