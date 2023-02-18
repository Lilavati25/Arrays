import java.util.*;
public class CountSubset {   
        static void subsetSums(int[] arr, int l, int r, int sum)
        {
     
            if (l > r) {
                System.out.print(sum + " ");
                return;
            }
     
            subsetSums(arr, l + 1, r, sum + arr[l]);
     
            subsetSums(arr, l + 1, r, sum);
        }
     
        // Driver code
        public static void main(String[] args)
        {
            int arr[] = new int[5];
            int n = arr.length;
            Scanner sc = new Scanner(System.in);
         
            System.out.println("Enter array values");
            for(int i=0;i<arr.length;i++){
              arr[i] = sc.nextInt();
            }
            System.out.println("following are subsets of sums can be made:");
            subsetSums(arr, 0, n - 1, 0);
        }
    }
     
