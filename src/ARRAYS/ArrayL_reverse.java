package Coding_Blocks;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayL_reverse {
    public static void reverseList(ArrayList<Integer> list){
        int i=0, j= list.size()-1;
        while (i<j){
            Integer temp= list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

    /*Without swapping, we can also import the Collections class,
    use the method of the collections class
    Collections.reverse(list);
    */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original list "+ list);
        reverseList(list);
        System.out.println("Reversed list "+ list);
        Collections.sort(list);
        System.out.println("Ascending order "+ list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order "+ list);

        ArrayList<String> l1= new ArrayList<>();
        l1.add("I");
        l1.add("Am");
        l1.add("Talking");
        l1.add("Nonsense");
        System.out.println("Original list "+l1);
        Collections.sort(l1);
        System.out.println("Ascending order "+ l1);
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("Descending order "+ l1);


    }

}
