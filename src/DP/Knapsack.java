package DP;

import java.util.List;

public class Knapsack {
    private static int rec(int idx, int W,List<Integer> profit,List<Integer> weights, int[][] dp ){
        if(dp[idx][W]!=-1)
            return dp[idx][W];
        if(idx==0) {
            if (weights.get(0) <= W)
                return profit.get(0);
            else return 0;
        }
        int pick=0;
        if(W>= weights.get(idx)){
            pick= profit.get(idx) + rec(idx-1, W- weights.get(idx), profit, weights,dp);
        }
        int not_pick= rec(idx-1, W, profit, weights,dp);

        return dp[idx][W]=Math.max(pick, not_pick);

    }
    public static void main(String[] args) {
        List<Integer> profit= List.of(1,2,3);
        List<Integer> weights= List.of(4,5,1);
        int W= 4;
        int n= profit.size();
        int[][] dp= new int[n+1][n+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=W; j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(rec(n-1, W, profit, weights,dp));
    }

}

//DP NOT APPLIED- ONLY RECURSION

//    private static int rec(int idx, int W,List<Integer> profit,List<Integer> weights ){
//        if(idx==0) {
//            if (weights.get(0) <= W)
//                return profit.get(0);
//            else return 0;
//        }
//        int pick=0;
//        if(W>= weights.get(idx)){
//            pick= profit.get(idx) + rec(idx-1, W- weights.get(idx), profit, weights);
//        }
//        int not_pick= rec(idx-1, W, profit, weights);
//
//        return Math.max(pick, not_pick);
//
//    }
//    public static void main(String[] args) {
//        List<Integer> profit= List.of(1,2,3);
//        List<Integer> weights= List.of(4,5,1);
//        int W= 4;
//        int n= profit.size();
//        System.out.println(rec(n-1, W, profit, weights));
//    }
