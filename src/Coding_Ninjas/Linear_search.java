package Coding_Ninjas;

import java.util.Scanner;

public class Linear_search {
    public static int search(int a[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter element to be searched");
        int x=sc.nextInt();
        for (int i=0;i<a.length;i++){
            if(a[i]==x){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2, 13, 4, 1, 3, 6, 28};
        int index=search(arr);
        if(index==-1){
            System.out.println("element not found");

        }
        else {
            System.out.println("element at " +index);
        }

    }

}
