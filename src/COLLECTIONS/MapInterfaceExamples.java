package COLLECTIONS;


import java.util.*;

public class MapInterfaceExamples {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(3, "Anushka");
        mp.put(1, "Aman");
        mp.put(2, "Abhay");
        //mp.put(1 , "Raj"); //Aman will be over-ridden, 1 will now correspond to Raj
        //but if we don't want our values to be over-ridden then
        mp.putIfAbsent(1,"Raj");
        System.out.println(mp);
        System.out.println(mp.get(2)); //Abhay
        System.out.println(mp.containsKey(6)); //false - as key 6 is not present
        System.out.println(mp.containsValue("Anushka")); //true
        System.out.println(mp.keySet()); //print all the keys
        System.out.println(mp.values()); //print all the values
        //Iterating over keys in a map
        for(Integer i: mp.keySet()){
            System.out.println(i);
        }
        //Iterating over values in a map
        for(String j: mp.values()){
            System.out.println(j);
        }
    }

}
