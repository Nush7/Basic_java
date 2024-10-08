package HASHMAPS;

import java.util.*;

public class MaxFreq {
    public static void main(String[] args) {
        int[] arr= {1,4,3,5,1,4,6,8,4,8,6,4,2,4,9,4,4};
        Map<Integer, Integer> freq= new HashMap<>();
        for(int el: arr){
            if(!freq.containsKey(el)){
                freq.put(el, 1);
            }
            else{
                freq.put(el, freq.get(el)+1);
            }
        }
        System.out.println(freq.entrySet());
        int mxfreq=0, ansKey=-1;
        for(var key: freq.keySet()){
            if(freq.get(key)> mxfreq){
                mxfreq= freq.get(key);
                ansKey= key;
            }
        }
        System.out.println( ansKey+" "+ mxfreq);
    }

}
