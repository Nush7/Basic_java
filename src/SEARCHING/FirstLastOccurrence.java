package SEARCHING;

public class FirstLastOccurrence {
    public static int firstOccurrence(int[] arr, int x){
        int n= arr.length;
        int st=0, end= n-1;
        int fo=-1;
        while (st<=end){
            int mid= st+ (end-st)/2;
            if(x== arr[mid]){
                fo= mid;
                end= mid-1;
            }
            else if(x< arr[mid]){
                end= mid-1;
            }
            else {
                st= mid+1;
            }
        }
        return fo;

    }
    public static int lastOccurrence(int[] arr, int x){
        int n= arr.length;
        int st=0, end= n-1;
        int lo=-1;
        while(st<=end){
            int mid= st+ (end- st)/2;
            if(x== arr[mid]){
                lo= mid;
                st= mid+1;
            }
            else if(x< arr[mid]){
                end= mid-1;
            }
            else {
                st= mid+1;
            }
        }
        return lo;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,3,3,5,6,6};
        int target= 3;
        System.out.println(firstOccurrence(arr, target));
        System.out.println(lastOccurrence(arr, target));
    }

}
