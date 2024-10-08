package ARRAYS;

public class Array_BubbleSort {

    public static void bubbleSort(int[] arr){
        for(int counter=0; counter<arr.length-1; counter++){
            for (int j=0;j< arr.length-1 -counter; j++){
                if(arr[j]> arr[j+1]){
                    int temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr={88,66,44,22};
        bubbleSort(arr);
    }

}
