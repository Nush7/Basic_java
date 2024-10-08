package SEARCHING;

public class BinarySearch {
    static boolean binarySearch(int[] a, int target){
        int n= a.length;
        int start=0, end=n-1;
        while(start<=end){
            int mid= (start+end)/2;
            if(target== a[mid]){
                return true;
            } else if (target< a[mid]) {
                end= mid-1;
            }
            else{
                start= mid+1;
            }
        }
        return false;
    }

    static boolean recBinarySearch (int[] arr, int st, int end, int target){
        if(st> end) return false; //base case
        int mid= (st+ end)/2;
        if(target== arr[mid]) return true;
        else if( target< arr[mid]){
            return recBinarySearch(arr, st, mid-1, target);
        }
        else {
            return recBinarySearch(arr, mid+1, end, target);
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int target=4;
        //System.out.println(binarySearch(a, target));
        System.out.println(recBinarySearch(a, 0, a.length-1, target));
    }

}
