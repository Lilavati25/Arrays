import java.util.*;
public class armstrong{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num,len,mul;
        len = 0;
        mul = 1;
        System.out.println("Enter a number");
        num = sc.nextInt();
        int t1 = num;
        while(t1!=0){

            len = len + 1;
            t1 = t1 / 10;

        }

        int t2 = num;
        int arm = 0;
        while(t2 != 0){
          
            int rem = t2 % 10;
            for(int i=0;i<len;i++)
            {
                mul = mul * rem;
            }
            arm += mul;
            t2 = t2/10;

        }
        if(arm == num)
        {
            System.out.println("number is armstrong");

        }
        else
        {
            System.out.println("number is not armstrong");

        }


    }
}