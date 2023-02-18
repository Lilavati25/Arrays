import java.util.*;
public class StrongNum{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();
        int num1 = num;
        int sum = 0;
        while(num != 0){

            int d = num % 10;
            sum = sum + fac(d);
            num = num/10;
        }
        if(sum == num1){
                System.out.println(num1+ " it is strong number");
        } 
        else {
            System.out.println(num1+ " it is not strong number");
    } 
    }

    public static int fac(int num)
    {
        int f = 1;
        for(int i=1; i<=num; i++)
            f = f*i;
            return f;    
    }
    
}

//Strong number means 145 = 1!+4!+5! = 145