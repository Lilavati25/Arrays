import java.util.*;
public class silly {

        public static void main(String[] args) {
            int i;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size");
            int size = sc.nextInt();
    
            int numbers[] = new int[size];
           
            for (i = 0; i < numbers.length; i++) {
                numbers[i] = sc.nextInt();
            }
    
             int min = numbers[0];
           
            for (i = 0; i < numbers.length; i++) {
    
                if (numbers[i] < min) {
                    min = numbers[i];
                }
    
            }
            System.out.println("THe smallest ele is :" + min);
    
        }
    }
