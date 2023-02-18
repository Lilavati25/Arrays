import java.util.*;
public class CountPaths {
    
        public static int countPaths(int i, int j, int m, int n) {
            if(i == m-1 || j == n-1) {
                return 1;
            }
     
     
            return countPaths(i+1, j, m, n) + countPaths(i, j+1, m, n);
        }
     
     
        public static void main(String args[]) {
            int n , m;
            Scanner sc = new Scanner(System.in);

            System.out.println("\nenter end numbers");
            n = sc.nextInt();
            m = sc.nextInt();
            System.out.println("count of paths is:" +countPaths(0, 0, m, n));

        }
}

        
     