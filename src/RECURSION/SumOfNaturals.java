package RECURSION;

public class SumOfNaturals {
    public static int printSum(int n){
        if(n==0){
            return n;
        }

        return printSum(n-1) + n;

    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(printSum(n));
    }

}
