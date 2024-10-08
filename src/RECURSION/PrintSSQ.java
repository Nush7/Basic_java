package RECURSION;

public class PrintSSQ {
    //here we don't have ro create an arrayList
    //we have to make a void method and simply print the ssqs.

    public static void printSSQ( String s, String currAns){
        //base case
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }
        char curr= s.charAt(0);
        String remString= s.substring(1);

        printSSQ(remString, currAns+curr);//char inclusion
        printSSQ(remString, currAns);//chr exclusion

    }
    public static void main(String[] args) {
        printSSQ("abc", "");
    }

}
