import java.util.Scanner;
public class Quadrant {
    
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int c1,c2;
    
        System.out.println("Enter your Co-ordinates");
        c1 = sc.nextInt();
        c2 = sc.nextInt();

        if(c1 > 0 && c2 > 0)
        System.out.println("Givern Co-ordinates lies in I Quadrant");

        else if(c1 < 0 && c2 > 0)
        System.out.println("Givern Co-ordinates lies in II Quadrant");

        else if(c1 < 0 && c2 < 0)
        System.out.println("Givern Co-ordinates lies in III Quadrant");

        else if(c1 > 0 && c2 < 0)
        System.out.println("Givern Co-ordinates lies in IV Quadrant");

        else if(c1 == 0 && c2 == 0)
        System.out.println("Origin");
    

        else if (c2==0 && c1!=0)
        System.out.println("x-axis");

        else if (c1==0 && c2!=0)
        System.out.println("y-axis");

    }
}
