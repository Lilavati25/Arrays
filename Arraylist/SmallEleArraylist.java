import java.util.*;
public class SmallEleArraylist {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements: ");
        for(int i=0;i<5;i++){
            int i1 = sc.nextInt();
            al.add(i1); 
        }

        int min = al.get(0);
        for(int i=0;i<al.size();i++){
            if(al.get(i) < min){
                min = al.get(i);   
               
            }
        }
        System.out.println("Largest element is: " +min);
    }
}

