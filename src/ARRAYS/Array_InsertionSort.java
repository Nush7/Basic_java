package ARRAYS;

public class Array_InsertionSort {
    public static void insertionSort(int[] arr){
        for (int i=1; i< arr.length; i++){
            int current= arr[i];
            int j=i-1;
            while(j>=0 && arr[j]> current){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]= current;
        }
    }

    public static void display( int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " " );
        }
    }
    public static void main(String[] args) {

        int[] arr={88,66,44,22};
        insertionSort(arr);
        display(arr);
    }

}
