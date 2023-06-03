import java.util.*;
public class PairFriend {

    public static int pairFriends(int n) {
       if(n <= 1) {
           return 1;
       }
 
       int ways1 = pairFriends(n-1);

       int ways2 = (n-1) * pairFriends(n-2) ;

       return ways1 + ways2;
    }
 
 
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nenter number");
        n = sc.nextInt();
        System.out.println(pairFriends(n));
    }
}
 