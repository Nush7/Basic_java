package Coding_Blocks;

import java.util.Scanner;

public class Array2D_PrintSpiral {

    public static void printSpiralOrder(int [][] matrix, int r, int c){
        int topRow= 0, bottomRow= r-1, leftCol=0, rightCol= c-1;
        int totalElements = 0;
        while(totalElements< r*c){
            // top row -> leftCol to rightCol
            for(int j=leftCol; j<= rightCol && totalElements< r*c; j++){
                System.out.print(matrix[topRow][j]+ " ");
                totalElements++;
            }
            topRow++;

            // rightCol -> topRow to BottomRow
            for (int i=topRow; i<=bottomRow && totalElements< r*c; i++){
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            //bottomRow -> rightCol to leftCol
            for (int j= rightCol; j>=leftCol && totalElements< r*c; j--){
                System.out.print(matrix[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;

            //leftCol -> bottomRow to topRow
            for (int i= bottomRow; i>= leftCol && totalElements< r*c; i--)
            {
                System.out.print(matrix[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
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

        System.out.println("Spiral Order");
        printSpiralOrder(a, r, c);
    }

}
