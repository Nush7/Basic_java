package DP;

import java.util.*;

public class CoinChange {
    static int minCoins(int n, int[] a, int[] dp){
        if(n==0) return 0;
        int ans= Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(n-a[i]>=0){
                int subAns=0;
                if(dp[n-a[i]]!=-1){
                    subAns=dp[n-a[i]];
                }
                else{
                    subAns= minCoins(n-a[i], a, dp);
                }

                if(subAns!= Integer.MAX_VALUE && subAns+1<ans){
                    ans= subAns;
                }
            }
        }
        return dp[n]=ans;
    }
    public static void main(String[] args) {
        int n=18;
        int a[]={7,5,1};
        int[] dp= new int[n+1];
        Arrays.fill(dp,-1);

        int ans= minCoins(n, a, dp);
        System.out.println(ans);

    }

}
