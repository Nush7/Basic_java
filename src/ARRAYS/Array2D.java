package Coding_Blocks;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows");
        int r=sc.nextInt();
        System.out.println("enter no. of columns ");
        int c=sc.nextInt();

        int [][] arr=new int[r][c]; //total=r*c

        System.out.println("Enter "+ r*c + " elements");
        for(int i=0;i<r; i++){
            for(int j=0; j<c;j++){
                arr[i][j]= sc.nextInt();
            }
        }

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

}
