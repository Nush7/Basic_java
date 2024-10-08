package Coding_Blocks;

import java.util.Scanner;

public class Array2D_Transpose {
    public static void transposeInPlace(int [][] matrix, int r, int c){
        for(int i=0; i< c; i++){
            // Important
            for (int j=i; j<r; j++){
                //swap matrix[i][j] and matrix[j][i]
                int temp= matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;
            }
        }
    }

//    public static int[][] transpose(int[][] matrix, int r, int c){
//        int [][] ans= new int[c][r];
//        // we are traversing through ans matrix
//        for (int i=0; i<c; i++){
//            for (int j=0; j<r; j++){
//                ans[i][j]= matrix[j][i];
//            }
//        }
//        return ans;
//    }

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
        System.out.println("enter no. of rows and cols of matrix");
        int r1= sc.nextInt();
        int c1= sc.nextInt();
        int [][] a= new int[r1][c1];
        System.out.println("enter matrix values");
        for (int i=0; i<r1; i++){
            for (int j=0; j<c1; j++){
                a[i][j]= sc.nextInt();
            }
        }

        System.out.println("Input matrix");
        display(a);

        System.out.println("Transpose matrix");
        transposeInPlace(a, r1, c1);
        display(a);
//        int [][] ans = transpose(a, r1, c1);
//        display(ans);
    }

}
