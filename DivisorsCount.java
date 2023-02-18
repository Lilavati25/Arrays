import java.util.*;
public class DivisorsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,div;

        System.out.println("Enter number and divisor");
        num = sc.nextInt();
        div = sc.nextInt();
        int count = 0;
    
        for(int i=1; i<=num; i++){
            int count_factors = 0;
            for(int j = 1; j<= i; j++){
                if(i%j==0){
                    count_factors++;
                }
            }
    
        if(count_factors == div)
            count++;
        }
        System.out.println(count+ " number have exactly " +div+ " divisors");
    }
}

