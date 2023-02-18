import java.util.*;
public class Lcm {
    
    public static void main(String[] args){

        int num1,num2,hcf=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        for(int i=1; i<=num1  || i<=num2; i++){
            if (num1 % i == 0 && num2 % i == 0)
            hcf = i;
          }
    
          int lcm = (num1 * num2) / hcf;
          System.out.println ("The LCM: " + lcm);
    }
     
}
