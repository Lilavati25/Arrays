import java.util.*;
public class PrimeFactor{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num , count=0;
        System.out.println("Enter a number");
        num = sc.nextInt();
      
        for(int i = 1; i <= num; i++){

            if(num % i == 0){
                count++;
            
            if(count == 2)
            System.out.println(i);
            i++;

            }
        }
    }
      
}