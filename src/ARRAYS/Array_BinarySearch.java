package Coding_Blocks;

public class Array_BinarySearch {
    public static int binarySearch(int[] arr, int item){
        int n=arr.length;
        int low=0;
        int high= n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<item){
                low=mid+1;
            }
            else if(arr[mid]>item){
                high=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //Array should be sorted
        int [] arr={12, 34,54,76,84,98};
        int item= 76;
        int index= binarySearch(arr, item);
        if(index== -1){
            System.out.println("Item not found");
        }
        else{
            System.out.println("Item found at index " +index);
        }
    }

}
