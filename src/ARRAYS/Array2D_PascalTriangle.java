package Coding_Blocks;

import java.util.Scanner;

public class Array2D_PascalTriangle {
    public static int[][] pascal(int n){
        int[][] ans= new int [n][];
        for (int i=0; i<n; i++){
            ans[i]= new int[i+1];
            //humlog har ek row me jaa ke ek 1d array bana re hai.
            ans[i][0]= ans[i][i]= 1;

            for (int j=1; j<i; j++){
                ans[i][j]= ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }

    public static void display(int [][] arr){
        for (int i=0; i<arr.length; i++){ //for rows
            for (int j=0; j< arr[i].length; j++){ //for cols
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        //n = no. rows in a pascal triangle.
        int n= sc.nextInt();
        int[][] ans= pascal(n);
        display(ans);
    }

}
