package RECURSION;

public class RecOnStrings {
    public static String removeM2(String s){
        //without passing index
        if(s.length()==0){
            return "";
        }
        String smallAns= removeM2(s.substring(1));
         char currChar= s.charAt(0);
         if(currChar!= 'a'){
             return currChar+ smallAns;
         }
         else{
             return smallAns;
         }
    }
    public static String remove(String s, int idx){
        String ans = "";
        //base case
        if(idx== s.length()){
            return ans;
        }
        //self case
        if(s.charAt(idx)!= 'a'){
            ans+=s.charAt(idx);
        }

        String smallAns= remove(s, idx+1);

        return ans+smallAns;// O(n^2)
    }
    public static void main(String[] args) {
        String s= "anushka";
        System.out.println(remove(s, 0));
    }

}
