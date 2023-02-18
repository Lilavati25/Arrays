import java.util.*;
public class OccurenceDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,d,count;
        count = 0;

        System.out.print("Enter number:");
        num = sc.nextInt();

        System.out.println("Enter digit to check occurence");
        d = sc.nextInt();

        while(num!=0){
            int rem = num % 10;
            if(rem == d)
            count++;
            num = num/10;
        }
        System.out.println(count+ " times occurence of "+d+ " digit found");
    }
}