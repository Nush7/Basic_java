package RECURSION;

public class ReverseArray {
    public static int[] reverse(int start, int end, int[]a){
        if(start>= a.length/2){
            return a;
        }
        int temp= a[start];
        a[start] = a[end];
        a[end]= temp;
         return reverse(start+1, end-1, a);
    }
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5,6,7,8,9};
        int[] ans= new int[a.length];

        ans= reverse(0, a.length-1, a);
        for(int i=0; i< ans.length; i++){
            System.out.println(ans[i]);
        }


    }

}
