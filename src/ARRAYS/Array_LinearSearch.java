package Coding_Blocks;

public class Array_LinearSearch {
    public static int linearSearch(int[] arr, int item){
        for (int i=0;i<arr.length;i++){
            if(arr[i]== item){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr={12, 34,54,76,84,98};
        int item= 76;
        int index= linearSearch(arr, item);
        if(index== -1){
            System.out.println("Item not found");
        }
        else{
            System.out.println("Item found at index " +index);
        }

    }

}
