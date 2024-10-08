package Coding_Blocks;

import java.util.Scanner;

public class Array2D_RotateMatrix {

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

    public static void reverseArray(int[] arr){
        int i=0, j= arr.length-1;

        while(i<j){
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
    }

    public static void rotate (int [][] matrix, int n){
        transposeInPlace(matrix, n ,n);
        //reverse each row of the transposed matrix
        for (int i=0; i<n; i++){
            reverseArray(matrix[i]);
        }

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
        System.out.println("enter no. of rows and cols of matrix");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int [][] a= new int[r][c];
        System.out.println("enter matrix values");
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                a[i][j]= sc.nextInt();
            }
        }

        System.out.println("Input matrix");
        display(a);

        rotate(a, r);

        System.out.println("Rotated Matrix");
        display(a);
    }

}
