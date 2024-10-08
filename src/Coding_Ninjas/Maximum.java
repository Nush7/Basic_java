package Coding_Ninjas;

import java.util.Scanner;

public class Maximum {
    public static void largest_no(int a[]){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("largest element is"+ max);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the no. of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("enter the "+ i+"th element");
            arr[i]=sc.nextInt();
        }
        largest_no(arr);
    }

}
