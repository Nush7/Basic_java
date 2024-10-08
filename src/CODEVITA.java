import java.util.*;


public class CODEVITA {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String val = sc.nextLine();
        String[] arr = val.split("\\s+");
        int[] chocolates= new int[arr.length];
        for(int i=0; i<arr.length; i++){
            chocolates[i]= Integer.parseInt(arr[i]);
        }
        int initialChocolates= sc.nextInt();

        int n = chocolates.length;
        int[][] dp = new int[n + 1][initialChocolates + 1];

        // Base case: No chocolates or no bags
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j <= initialChocolates; j++) {
            dp[0][j] = 1;
        }

        // Dynamic programming loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= initialChocolates; j++) {
                int maxPoints = dp[i - 1][j];
                if (chocolates[i - 1] <= j) {
                    maxPoints = Math.max(maxPoints, 1 + dp[i - 1][j - chocolates[i - 1]]);
                }
                maxPoints = Math.max(maxPoints, dp[i - 1][j]);
                dp[i][j] = maxPoints;
            }
        }

        System.out.println(dp[n][initialChocolates]);

    }

}
