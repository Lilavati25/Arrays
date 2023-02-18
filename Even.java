import java.util.*;
public class Even
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num = sc.nextInt();

        if(num < 0){

            System.out.println("Enterned number is negative " +num);
        }
        else{
            System.out.println("Enterned number is positive " +num);
        }
    }
}