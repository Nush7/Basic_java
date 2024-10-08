package RECURSION;

public class ArraySearch {

    public static void findAllIndices(int arr[], int n, int target, int idx){
        //base case
        if(idx>= n ){
            return;
        }

        //self work
        if(arr[idx]== target){
            System.out.println(idx);
        }

        //recursive work
        findAllIndices(arr, n, target, idx+1);
    }
    public static boolean search(int[] arr, int n, int target, int idx){
        if(idx>=n){
            return false;
        }

        if(arr[idx]== target){
            return true;
        }

        return search(arr, n, target, idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2,4,5,2,5,7,2,7,3,2};
        int n= arr.length;
        int target = 2;

//        if(search(arr, n, target, 0)){
//            System.out.println("yes");
//        }
//        else {
//            System.out.println("no");
//        }

        findAllIndices(arr,n,target,0);


    }

}
