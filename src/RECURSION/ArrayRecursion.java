package RECURSION;

public class ArrayRecursion {
    static void printArray( int[] arr, int idx){
        if(idx== arr.length){
            return;
        }

        System.out.println(arr[idx]);
        printArray(arr, idx+1);
    }

    static int maxInArray( int[] arr, int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }

        int smallAns= maxInArray(arr, idx+1);

        return Math.max(smallAns, arr[idx]);
    }

    public static int sumArray (int [] arr, int idx){
        if(idx== arr.length-1){
            return arr[idx];
        }

        int smallSum= sumArray(arr, idx+1);

        return smallSum+ arr[idx];
    }
    public static void main(String[] args) {
        int[] arr= {2,3,5,20,1};
        printArray(arr, 0);
        System.out.println("max is "+ maxInArray(arr, 0));
        System.out.println("sum is "+ sumArray(arr, 0));
    }

}
