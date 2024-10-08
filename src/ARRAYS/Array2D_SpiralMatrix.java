package Coding_Blocks;

import java.util.Scanner;

public class Array2D_SpiralMatrix {

    public static int[][] spiralMatrix(int n){
        int[][] matrix= new int [n][n];
        int topRow= 0, bottomRow= n-1, leftCol=0, rightCol= n-1;
        int curr= 1;
        while(curr<= n*n){
            // top row -> leftCol to rightCol
            for(int j=leftCol; j<= rightCol && curr<= n*n; j++){
                matrix[topRow][j]= curr;
                curr++;
            }
            topRow++;

            // rightCol -> topRow to BottomRow
            for (int i=topRow; i<=bottomRow && curr<= n*n; i++){
                matrix[i][rightCol]=curr;
                curr++;
            }
            rightCol--;

            //bottomRow -> rightCol to leftCol
            for (int j= rightCol; j>=leftCol && curr<= n*n; j--){
                matrix[bottomRow][j]= curr;
                curr++;
            }
            bottomRow--;

            //leftCol -> bottomRow to topRow
            for (int i= bottomRow; i>= leftCol && curr<= n*n; i--)
            {
                matrix[i][leftCol]= curr;
                curr++;
            }
            leftCol++;
        }
        return matrix;
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
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any integer");
        int n=sc.nextInt();
        int[][] ans = spiralMatrix(n);

        display(ans);
    }

}
