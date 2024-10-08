package RECURSION;

import java.util.ArrayList;

public class ReturnSSQ {
    //here we have to return the array list, thus we are creating
    //an arrayList and hence consuming more space.

    public static ArrayList<String> subsequence(String s){
        ArrayList<String> ans = new ArrayList<>();
        //base case
        if(s.length()==0){
            ans.add("");
            return ans;
        }

        char curr= s.charAt(0); //a
        ArrayList<String> smallAns = subsequence(s.substring(1)); //["bc", "b", "c", ""]


        //smallAns= ["bc", "b", "c", ""]
        //ans= ["bc", "abc", "b", "ab", "c", "ac", "", "a"]
        for (String ss: smallAns){
            ans.add(ss);
            ans.add(curr+ss);
        }

        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> ans= subsequence("abc");
        for (String ss: ans){
            System.out.println(ss);
        }
    }

}
