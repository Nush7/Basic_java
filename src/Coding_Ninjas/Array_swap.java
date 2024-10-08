package Coding_Ninjas;

public class Array_swap {
    public static void swapAlternate(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+",");
        }

    }
    public static void main(String[] args) {
        int arr[]={ 9, 3, 6, 12, 4 ,32};
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
        swapAlternate(arr);
    }

}
