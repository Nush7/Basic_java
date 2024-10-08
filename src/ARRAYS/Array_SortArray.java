package Coding_Blocks;

import java.util.Scanner;
//the arrays contain only zeroes and ones
public class Array_SortArray {
    public static void printArray(int[] arr){
        int n= arr.length;
        for (int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int [] arr, int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void sortZeroesAndOnes(int [] arr){
        int left=0;
        int right= arr.length -1;
        while (left<right){
            if (arr[left]==1 && arr[right]==0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
    }

//    public static void sortZeroesAndOnes(int [] arr){
//        int n=arr.length;
//        int zeroes=0;
//        for (int i=0;i<n;i++){
//            if(arr[i]==0){
//                zeroes++;
//            }
//        }
//
//        for (int i=0; i<n;i++){
//            if(i<zeroes){
//                arr[i]=0;
//            }
//            else {
//                arr[i]=1;
//            }
//        }
//    }
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
        sortZeroesAndOnes(arr);
        System.out.println("Sorted Array");
        printArray(arr);
    }


}
