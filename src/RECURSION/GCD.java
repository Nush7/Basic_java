package RECURSION;

public class GCD {
    public static int gcdRecursion(int x, int y){
        if(y==0){
            return x;
        }

        return gcdRecursion(y, x%y);
    }
    public static void main(String[] args) {
        int x=24;
        int y=15;
        System.out.println(gcdRecursion(x, y));
    }

}
