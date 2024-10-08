package SORTING_ALGO;

public class QuickSorting {
    public static void printArray(int[] arr){
        int n= arr.length;
        for(int val: arr){
            System.out.print(val +" ");
        }
    }
    public static void swap(int[] arr, int x, int y){
        int temp= arr[x];
        arr[x]= arr[y];
        arr[y]= temp;
    }
    static int partition(int[] arr, int st, int end){
        int pivot= arr[st];
        int count=0;
        for(int i= st+1; i<=end; i++){
            if(arr[i]< pivot) count++;
        }

        int pivotIdx= st+count;
        swap(arr, st, pivotIdx);
        int i=st, j=end;
        while(i< pivotIdx && j> pivotIdx){
            while(arr[i]<= pivot) i++;
            while(arr[j]> pivot) j--;

            if(i< pivotIdx && j> pivotIdx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    public static void quickSort(int[] arr, int st, int end){
        if(st>= end){
            return;
        }

        int pi= partition(arr, st, end);
        quickSort(arr, st, pi-1);
        quickSort(arr, pi+1, end);
    }
    public static void main(String[] args) {
        int[] arr={4,5,7,2,3,1,6};
        int n= arr.length;
        System.out.println("Array before sorting");
        printArray(arr);
        System.out.println();
        quickSort(arr, 0, n-1);
        System.out.println("Array after sorting");
        printArray(arr);
    }

}
