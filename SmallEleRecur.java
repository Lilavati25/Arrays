import java.util.*;
public class SmallEleRecur {
    
    static int smallest(int arr[]){
        int min = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
    }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter array values");

        for(int i=0; i<arr.length;i++){
             arr[i] = sc.nextInt();  
        }

        System.out.println("Smallest value in array is: " +smallest(arr));
        
    }
}
