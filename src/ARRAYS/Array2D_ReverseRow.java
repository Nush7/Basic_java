package Coding_Blocks;

import java.util.Scanner;

public class Array2D_ReverseRow {
    public static void reverseRow(int[][] arr, int r1, int c1){
        for (int i=0; i<r1; i++){
            int start=0;
            int end= c1-1;
            while(start<end){
                int temp= arr[i][start];
                arr[i][start]= arr[i][end];
                arr[i][end]= temp;

                start++;
                end--;
            }
        }
        System.out.println("Required array");
        display(arr);




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


        reverseRow(a, r1, c1);
    }

}
