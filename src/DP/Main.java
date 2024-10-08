package DP;
// You are using Java
import java.util.*;
class Main{
    public static int helper(String word1, String word2) {
        if (word1.equals(word2)) return 0;
        int m = word1.length();
        int n = word2.length();
        int[][] t = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0) t[i][j] = j;
                if (j == 0) t[i][j] = i;
                if (i > 0 && j > 0) {
                    if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                        t[i][j] = t[i - 1][j - 1];
                    } else {
                        t[i][j] = 1 + Math.min(t[i][j - 1], Math.min(t[i - 1][j - 1], t[i - 1][j]));
                    }
                }

            }
        }

        return t[m][n];
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        String[] words= str.split(" ");
        String s1= words[0];
        String s2= words[1];
        System.out.print( helper(s1, s2));
    }
}

