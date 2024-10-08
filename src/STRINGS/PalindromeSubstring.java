package STRINGS;

public class PalindromeSubstring {
    public static boolean isPalin(String s){
        int i=0;
        int j= s.length()-1;
        while(i<j){
            if(s.charAt(i)!= s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str= "abbd";
        int count=0;
        for (int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                if(isPalin(str.substring(i,j))==true){
                    System.out.print(str.substring(i,j)+ " ");
                    count++;
                }
            }
        }
        System.out.println("\n The no. of palindrome substring is "+count);
    }

}
