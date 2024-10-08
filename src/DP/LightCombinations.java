package DP;

public class LightCombinations {
    public static int countValidCombinations(int n) {
        if (n < 2) return 0;

        // dp[i] represents the number of valid combinations of i lights with exactly one '00'
        int[] dp = new int[n + 1];

        // Base cases
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1; // "00"

        // Iterate and fill the dp table
        for (int i = 3; i <= n; i++) {
            // We can place '00' at the end of any valid combination of (i-2) lights
            dp[i] = dp[i - 1] + dp[i - 2];

            // If i >= 4, we also need to add the cases where '00' is placed not at the very end
            for (int j = 0; j <= i - 3; j++) {
                dp[i] += (Math.pow(2, j));
            }
        }
        //1 << (i - j - 2)
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Number of valid combinations for " + n + " lights: " + countValidCombinations(n));
    }
}
