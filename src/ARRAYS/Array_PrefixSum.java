package Coding_Blocks;

import java.util.Scanner;

public class Array_PrefixSum {
    public static void printArray(int[] arr){
        int n= arr.length;
        for (int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

//    public static int[] prefixsum(int[] arr){
//        int n=arr.length;
//        int [] pref= new int[n];
//        pref[0]= arr[0];
//
//        for (int i=1; i<n; i++){
//            pref[i]= pref[i-1] + arr[i];
//        }
//
//        return pref;
//  }
    public static void prefixSum(int[] arr){
        for (int i=1; i<arr.length; i++){
            arr[i]+=arr[i-1];
        }

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
        System.out.println("Original Array: ");
        printArray(arr);

        prefixSum(arr);
        System.out.println("Running sum array");
        printArray(arr);
    }

}
