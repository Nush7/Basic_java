package Coding_Blocks;

import java.util.Scanner;

public class Array2D_multiplication {
    public static void multiply(int [][]a, int r1, int c1, int[][] b, int r2, int c2){
        if(c1!=r2){
            System.out.println("Multiplication impossible");
            return;
        }

        int[][] mul= new int[r1][c2];

        for (int i=0; i<r1; i++){
            for (int j=0; j<c2; j++){
                for (int k=0; k<c1; k++){
                    /*
                    i=1, j=0
                    mul[i][j]= ith row of a * jth col of b
                    */
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("Multiplication of two matrices");
        display(mul);

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
        System.out.println("enter no. of rows and cols of matrix 1");
        int r1= sc.nextInt();
        int c1= sc.nextInt();
        int [][] a= new int[r1][c1];
        System.out.println("enter matrix values");
        for (int i=0; i<r1; i++){
            for (int j=0; j<c1; j++){
                a[i][j]= sc.nextInt();
            }
        }

        System.out.println("enter no. of rows and cols of matrix 2");
        int r2= sc.nextInt();
        int c2= sc.nextInt();
        int [][] b= new int[r2][c2];
        System.out.println("enter matrix values");
        for (int i=0; i<r2; i++){
            for (int j=0; j<c2; j++){
                b[i][j]= sc.nextInt();
            }
        }

        System.out.println("Matrix 1");
        display(a);
        System.out.println("Matrix 2 ");
        display(b);

        multiply(a, r1, c1, b, r2, c2);
    }

}
