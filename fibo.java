import java.util.*;
public class fibo {
    
    public static void main(String[] args){
        
        int num;
        int a=0,b=1;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number");
        num = sc.nextInt();

        System.out.print(a + "," + b + ",");

        int nextterm;
        for(int i=2;i<num;i++){

            nextterm = a + b;
            a = b;
            b = nextterm;
            System.out.print(nextterm+ ",");

        }


    }
}
