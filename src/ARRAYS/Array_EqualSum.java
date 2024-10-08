package ARRAYS;

import java.util.Scanner;

public class Array_EqualSum {
    public static int findSum(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static boolean equalSumPartition (int[] arr){
        int totalSum= findSum(arr);

        int prefSum=0;
        for(int i=0; i< arr.length; i++){
            prefSum+= arr[i];
            int suffixSum = totalSum- prefSum;
            if( suffixSum == prefSum){
                return  true;

            }
        }
        return false;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int[] arr= new int [n];

        System.out.println("Enter " +n+ " elements");
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Equal Partition possible: "+ equalSumPartition(arr));
    }

}
