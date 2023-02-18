import java.util.*;
public class OctalToBinary {
    public static void main(String[] args){

        String num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter octal number");
        num = sc.next();

        int decimal = Integer.parseInt(num,8);
        System.out.println("Decimal No is:" +decimal);      

        String binary = Integer.toBinaryString(decimal);
        System.out.println("Octal No is:" +binary); 
        

    }
}

/* Using inbuilt functions

    toOctalString() = concert decimal to octal
    toHexString() = concert decimal to Hexadecimal
    parseInt(string,power) = covert any number to integer 

*/
