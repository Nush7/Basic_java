package DP;

public class Robber {
    private static int rob(int[] house,int idx, int[] dp){
        if(idx==house.length-1) return house[idx];
        if(idx>=house.length) return 0;
        if(dp[idx]!= -1) return dp[idx];

        int pick= house[idx]+ rob(house, idx+2, dp);
        int not_pick= rob(house, idx+1, dp);
        int result=Math.max(pick, not_pick);
        dp[idx]= result;
        return result;
    }
    public static void main(String[] args) {
        int n=4;
        int[] house= new int[n];
        house[0]=9;
        house[1]=1;
        house[2]=3;
        house[3]=8;
        int[] dp= new int[n];
        System.out.println(rob(house,0,dp));
    }

}
