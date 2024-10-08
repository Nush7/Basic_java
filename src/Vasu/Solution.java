package Vasu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    // Perform DFS to find minimum weight in the path between node and all other nodes
    private static void dfs(int node, int parent, List<List<Integer>> adj, int[] weight, int[][] minWeights, int currentMin) {
        minWeights[parent][node] = minWeights[node][parent] = Math.min(currentMin, weight[node]);
        for (int neighbor : adj.get(node)) {
            if (neighbor != parent) {
                dfs(neighbor, node, adj, weight, minWeights, minWeights[parent][node]);
            }
        }
    }

    // Function to find the sum of minimum weights in paths between all pairs
    public static long computeMinWeights(int n, int[] weight, int[][] edges) {
        // Build adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        // Initialize minWeights matrix
        int[][] minWeights = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(minWeights[i], Integer.MAX_VALUE);
            minWeights[i][i] = weight[i];
        }

        // Perform DFS from each node to compute minimum weights for all pairs
        for (int i = 0; i < n; i++) {
            dfs(i, i, adj, weight, minWeights, weight[i]);
        }

        // Sum the minimum weights for all pairs (i, j) where i < j
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                totalSum += minWeights[i][j];
            }
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] weight = {6, 3, 7, 5};  // example weights
        int[][] edges = {{0, 1}, {0, 3}, {0, 2}};  // example edges

        long result = computeMinWeights(n, weight, edges);
        System.out.println(result);  // Output the result, should be 21
    }
}
