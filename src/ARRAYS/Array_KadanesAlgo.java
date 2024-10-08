package ARRAYS;

public class Array_KadanesAlgo {
    public static void main(String[] args) {
        int[] arr= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n= arr.length;
        int sum=0;
        int maxSum= arr[0];
        for(int i=0; i<n; i++){
            sum+= arr[i];
             maxSum= Math. max(maxSum, sum);

             if(sum<0) sum=0;
        }
        System.out.println("maximum sum= "+ maxSum);
    }

}
