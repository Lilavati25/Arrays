import java.util.*;
public class BinaryToOctal {
    public static void main(String[] args){

        String num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number");
        num = sc.next();

        int decimal = Integer.parseInt(num,2);

        System.out.println("Decimal No is:" +decimal);      

        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal No is:" +octal); 
        
        String hexa = Integer.toHexString(decimal);
        System.out.println("Hexadecimal No is:" +hexa); 

    }
}

/* Using inbuilt functions

    toOctalString() = concert decimal to octal
    toHexString() = concert decimal to Hexadecimal
    parseInt(string,power) = covert any number to integer 

*/
