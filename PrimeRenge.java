import java.util.*;
public class PrimeRenge{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int num1,num2,i,j;

        System.out.println("Enter two numbers");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println("\n Prime Numbers are:");
        for(i=num1;i<=num2;i++){

            for(j = 2; j < i ; j++){
            if(i % j == 0)
                break;
            }    
            if(i==j)
            System.out.println(j);
        
        }
    }
}