import java.util.*;
public class CountLengthWord {
    private static int recLength(String str)
    {
        
        if (str.equals(""))
            return 0;
        else
            return recLength(str.substring(1)) + 1;
    }

    
    public static void main(String[] args)
    {
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter string");
        str = sc.next();
        System.out.println("length of the string "+recLength(str));
    }
}