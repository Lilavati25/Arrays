// Java Program to find maximum in arr[]
import java.io.*;
import java.util.Scanner;

public class LargeEleRecur {
 
	static int largest(int arr[])
	{
		int i;
		int max = arr[0];

		for (i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];

		return max;
	}
	public static void main(String[] args)
	{
    int arr[] = new int[5];
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter array values");
    for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();
    }
		System.out.println("Largest value in given array is "
						+ largest(arr));
	}
}
