import java.util.*;
public class Handshake {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter number of people");
        num = sc.nextInt();

        int total = num * (num-1) / 2; 

		System.out.println("For "+ num +" people there will be " +total+" handshakes");
	
    }
}
