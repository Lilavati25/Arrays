import java.util.*;
public class RevNumRec {
    public static void RevNum(int num){

        if(num < 10){
            System.out.println(num);
        }
        else{
            System.out.print( num % 10);
            RevNum(num / 10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("enter a number");
        num = sc.nextInt();

        RevNum(num);
    }
}
