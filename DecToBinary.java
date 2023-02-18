import java.util.*;
public class DecToBinary {
    public static void main(String[] args){

        int num,index=0;
        int arr[]  = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal  number");
        num = sc.nextInt();

       while(num>0){

            arr[index] = num % 2;
            index++;
            num = num/2;
       }
       System.out.println("The Binary number is: " );
       for(int i =index-1; i>=0 ; i--)
       {
        System.out.print(arr[i] );        
       }

    }
}
