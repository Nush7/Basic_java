package ARRAYS;

import java.util.Scanner;

public class Array2D_RectangleSum {
    public static int findSum(int [][] matrix, int l1, int r1, int l2, int r2){
        int sum=0;
        for (int i=l1; i<=l2; i++){
            for (int j=r1; j<=r2; j++){
                sum+= matrix[i][j];
            }
        }
        return sum;
    }
    public static void findPrefixSumMatrix(int [][] matrix){
        int r=matrix.length;
        int c= matrix[0].length;

        //traverse horizontally to calculate row-wise prefix sum
        for (int i=0; i<r; i++){
            for (int j=1; j<c; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }

        //traverse vertically to calculate column-wise prefix sum
        for (int j=0; j<c; j++){
            for (int i=1; i< r; i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }

    public static int findSum2(int [][] matrix, int l1, int r1, int l2, int r2){
        int sum=0;
        findPrefixSumMatrix(matrix);

        for (int i= l1; i<= l2; i++){
            //r1 to r2 sum for row i
            if (r1>=1){
                sum += matrix[i][r2] - matrix[i][r1-1];
            }
            else {
                sum += matrix[i][r2];
            }
        }
        return  sum;
    }

    public static int findSum3(int [][] matrix, int l1, int r1, int l2, int r2){

        findPrefixSumMatrix(matrix);
        int sum=0, up=0, left=0, leftUp=0, ans=0;
        sum= matrix[l2][r2];

        if (r1>=1)
            left= matrix[l2][r1-1];
        if (l1>=1)
            up= matrix[l1-1][r2];
        if (r1>=1 && l1>=1)
            leftUp= matrix[l1-1][r1-1];
        ans= sum- up- left +leftUp;
        return ans;

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

        System.out.println("Enter rectangle boundaries l1, r1, l2, r2");
        int l1= sc.nextInt();
        int r1= sc.nextInt();
        int l2= sc.nextInt();
        int r2 =sc.nextInt();

        System.out.println("Rectangle sum "+ findSum(a, l1, r1, l2, r2));
        System.out.println("Rectangle sum "+ findSum2(a, l1, r1, l2, r2));
        System.out.println("Rectangle sum "+ findSum3(a, l1, r1, l2, r2));
    }

}
