package ARRAYS;

public class Array_PairSum {

    public static int pairSum(int []arr, int target){
        int ans=0;
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]+ arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={4, 6, 3, 5, 8, 2};
        int target=7;
        int ans= pairSum(arr, target);
        System.out.println("no of pairs = "+ans);
    }

}
