import java.util.*;
public class Arraylist1{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(3);
        list.add(1);
        System.out.println(list);

        int gete = list.get(4);
        System.out.println(gete);

        list.set(4,88);
        System.out.println(list);

        list.remove(4);
        System.out.println(list);

        int size = list.size();
        System.out.println("Size is: " +size);

        for(int i=0;i<size;i++){
            System.out.println(list.get(i));
        }

        Collections.sort(list);
     
        
    }
}

/* Declare an ArrayList of different Types
Add Element
Get Element
Add Element at a specific Index
Set Element at a specific Index
Delete Element from an Index
Size of the List
Loop/Iterate on the List
Sort the List */