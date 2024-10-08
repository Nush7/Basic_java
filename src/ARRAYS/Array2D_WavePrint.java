package Coding_Blocks;

import java.util.Scanner;

public class Array2D_WavePrint {
    public static void wavePrint(int[][] matrix, int r, int c){
        for (int i=0; i<r; i++){
            if(i%2==0){
                for (int j=0; j<c;j++){
                    System.out.print(matrix[i][j] +" ");
                }
            }
            else{
                for (int j=c-1;j>=0; j--){
                    System.out.print(matrix[i][j] +" ");
                }
            }
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
        wavePrint(a, r, c);
    }

}
