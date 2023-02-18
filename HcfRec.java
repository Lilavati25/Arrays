import java.util.*;
public class HcfRec {
    
    
    public static int hcf(int num1,int  num2) {

        if (num2 != 0)
            return hcf(num2, num1 % num2);
        else
        return num1;
    }
  
    public static void main(String[] args){

        int num1,num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        int greater = hcf(num1,num2);

        System.out.printf("G.C.D of %d and %d is %d.", num1, num2, greater);
    }
     
}
