import java.util.*;
public class MaxEleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements: ");
        for(int i=0;i<5;i++){
            int i1 = sc.nextInt();
            list.add(i1); 
        }

        int max = list.get(0);
        for(int i=0;i<list.size();i++){
            if(list.get(i) > max){
                max = list.get(i);   
               
            }
        }
        System.out.println("Largest element is: " +max);
    }
}
