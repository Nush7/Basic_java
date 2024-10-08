package ARRAYS;

public class Array_Rotate {
    public static int[] rotate(int[] arr, int k){
        int n=arr.length;
        k=k%n;
        int j=0;
        int[] ans= new int[n];

        for (int i=n-k; i<n; i++){
            ans[j++]= arr[i];
        }

        for (int i=0; i<n-k; i++){
            ans[j++]=arr[i];
        }

        return ans;
    }
    public static void swapInArray(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void reverse(int[] arr, int i, int j){
        while(i<j){
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }

    public static void rotateInPlace(int[] arr, int k){
        int n=arr.length;
        k=k%n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);

    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        int[] ans= rotate(arr,5);
        for (int i=0;i<ans.length; i++){
            System.out.print(ans[i]+ " ");
        }
        rotateInPlace(arr, 5);

    }

}
