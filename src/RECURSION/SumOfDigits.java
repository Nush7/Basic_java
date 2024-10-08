package RECURSION;

public class SumOfDigits {
    public static int sum (int n){
        if(n>=0 && n<10){
            return n;
        }

        int smallAns= sum(n/10);
        int finalSum= smallAns + n%10;

        return  finalSum;
    }
    public static void main(String[] args) {

        int n= 1234;
        System.out.println(sum(n));
    }

}
