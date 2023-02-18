import java.util.*;
public class AddTwoFractions {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of x1:");
        int x1 = sc.nextInt();

        System.out.println("Enter values of y1:");
        int y1 = sc.nextInt();

        System.out.println("Enter values of x2:");
        int x2 = sc.nextInt();

        System.out.println("Enter values of y2:");
        int y2 = sc.nextInt();

        int Div;
        int x3 = (x1*y2) + (x2*y1);
        int y3 = y1*y2;

        if(x3 > y3)
            Div = x3;
        else
            Div = y3;

        for(int i=Div; i > 0; i--){
            if(x3 % i == 0 && y3 % i == 0){
                x3 = x3 / i;
                y3 = y3 / i; 
            }
        }
        System.out.println("Sum of fractions is:" +x3+ "/" +y3);


    }
}
