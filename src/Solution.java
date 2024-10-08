import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] arr= new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j= sc.nextInt();
            }
        }
        int q= sc.nextInt();
        int[] queries= new int[q];
        for(int i=0; i<q; i++){
            queries[i]= sc.nextInt();
        }
        int ans[]= new int[q];
        Map<Integer, Integer> mp= new HashMap<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                mp.put(arr[i][j], mp.getOrDefault(arr[i][j],1)+1);
            }
        }
        for(int i=0; i<q; i++){
            int x= queries[i];
            if(mp.containsKey(x)){
                int val= mp.get(x);
                if(val)

            }
        }
    }

}
