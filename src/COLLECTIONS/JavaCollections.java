package COLLECTIONS;

import java.util.*;

public class JavaCollections {
    static void ArrayListExamples(){
        //ArrayList <Integer> l = new ArrayList<>();
        LinkedList <Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        System.out.println(l.get(1)); //1-based indexing
        l.set(1, 10); //modify at index 1
        System.out.println(l);
        System.out.println(l.contains(10)); //true

    }
    static void StackExamples(){
        Stack<String> st = new Stack<>();
        st.push("anushka");
        st.push("singh");
        System.out.println(st.peek()); //singh
        System.out.println(st.pop()); //it will first print singh and then will remove it.
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.empty());

    }
    public static void main(String[] args) {
        ArrayListExamples();
        StackExamples();
    }

}
