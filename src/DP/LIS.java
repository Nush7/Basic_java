package DP;

import java.util.Arrays;

public class LIS {
    //tabulation
    public static int topDownLIS(int[] arr){
        int n= arr.length;
        int[] t= new int[n];
        int maxLIS=1;
        Arrays.fill(t,1);

        for(int i=0; i<n; i++){

            for(int j=0; j<i; j++){
                if(arr[j]< arr[i]){
                    t[i]=Math.max(t[i], t[j]+1);
                    maxLIS= Math.max(maxLIS, t[i]);
                }
            }
        }
        return maxLIS;
    }
//recursively
    public static int solve(int[][] dp,  int[] arr, int idx, int prev){
        int n= arr.length;
        if(idx>= n) return 0;
        if(prev!=-1 && dp[idx][prev]!= -1) return dp[idx][prev];
        int take=0;
        if(prev==-1 || arr[prev]< arr[idx]){
            take= 1+solve(dp,arr, idx+1, idx);
        }

        int skip= solve(dp,arr, idx+1, prev);
        if(prev!=-1){
            dp[idx][prev]=Math.max(take, skip);
        }
        return Math.max(take, skip);
    }
    public static void main(String[] args) {
        int[] nums= {10,9,2,5,3,7,101,18};
        int n= nums.length;
        int[][] dp= new int[n+1][n+1];
        for(int[] temp: dp){
            Arrays.fill(temp, -1);
        }
        int ans= solve(dp,nums, 0, -1);
        System.out.println(ans);
    }

}
