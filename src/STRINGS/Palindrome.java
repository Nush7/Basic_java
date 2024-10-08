package STRINGS;

public class Palindrome {
    public static boolean isPalindrome(String str){
        if(str== null || str.length()==0 ){
            return true;
        }
        str= str.toLowerCase();
        for (int i=0; i<= str.length()/2; i++){
            char start= str.charAt(i);
            char end= str. charAt(str.length() -1-i);

            if(start!= end){
                return false;
            }
        }
        return  true;
    }
    public static void palin_shortcut(String str){
        //since there is no reverse function in string
        //so, convert the string to StringBuilder
        String str1="abcdcba";
        StringBuilder gtr= new StringBuilder(str1);
        gtr.reverse();
        //we can convert any string to string builder easily
        //but to convert StringBuilder to string we need to add ""
        String s= gtr + "";
        if(str1.equals(s)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
    }
    public static void main(String[] args) {
        String str= "abcdcba";
        System.out.println(isPalindrome(str));
    }

}
