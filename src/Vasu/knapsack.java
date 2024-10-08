package Vasu;

/* A Naive recursive implementation
of 0-1 Knapsack problem */

class knapsack {

    // A utility function that returns
    // maximum of two integers
    static int max(int a, int b) { return (a > b) ? a : b; }

    // Returns the maximum value that
    // can be put in a knapsack of
    // capacity W
    static int knapSack(int W, int wt[], int val[], int n)
    {
        // Base Case
        if (n == 0 || W == 0)
            return 0;

        // If weight of the nth item is
        // more than Knapsack capacity W,
        // then this item cannot be included
        // in the optimal solution
        if (wt[n - 1] > W)
            return knapSack(W, wt, val, n - 1);

            // Return the maximum of two cases:
            // (1) nth item included
            // (2) not included
        else
            return max(val[n - 1]
                            + knapSack(W - wt[n - 1], wt,
                            val, n - 1),
                    knapSack(W, wt, val, n - 1));
    }

    // Driver code
    public static void main(String args[])
    {
        int profit[] = new int[] { 44,21,38, 11, 40, 37,13 };
        int weight[] = new int[] { 4,7,5,2,7,10,3 };
        int W = 22;
        int n = profit.length;
        System.out.println(knapSack(W, weight, profit, n));
    }
}
/*This code is contributed by Rajat Mishra */
