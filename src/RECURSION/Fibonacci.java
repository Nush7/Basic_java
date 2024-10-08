package RECURSION;

public class Fibonacci {
    public static int fibo(int n){
        if(n==0 || n==1)
            return n;

        int prev= fibo(n-1);
        int prevPrev= fibo(n-2);

        int ans= prev + prevPrev;
        return ans;


    }
    public static void main(String[] args) {
        for (int i=0; i<=10;i++){
            System.out.println(fibo(i));
        }
        System.out.println(fibo(5));
    }

}
