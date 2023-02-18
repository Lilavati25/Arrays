import java.util.*;
public class PerfectSquare {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        for(int i=1; i<num/2; i++){
         
            if(i*i == num){
            System.out.println("given number is perfect sqaure of " +i);
               return;

            }
         
        
        }
    }
}
