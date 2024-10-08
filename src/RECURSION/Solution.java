package RECURSION;

public class Solution {

    public static void print(int c, int a[], int x){

        if(c==0){
            return;
        }
        a[c] = c-1;
        c--;
        print(c,a, x);
    }
    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] a = new int[x];
        int c=x-1;
        print(c,a,x);
        return a;
    }

    public static void main(String[] args) {


    }
}