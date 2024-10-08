package RECURSION;

public class Multiples {
    public static void printMultiples(int n, int k){
//        if(k==1){
//            System.out.println(n);
//            return;
//        }
        if (k==0){
            return;
        }

        printMultiples(n, k-1);
        System.out.println(n*k);

    }
    public static void main(String[] args) {
        int n=4;
        int k=5;
        printMultiples(n,k);
    }

}
