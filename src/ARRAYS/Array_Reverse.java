package Coding_Blocks;

public class Array_Reverse {
    public static int[] reverse(int[] arr){
        int n= arr.length;
        int[] ans= new int[n];
        int j=0;

        for (int i=n-1; i>=0; i--){
            ans[j++]= arr[i];
        }

        return ans;
    }
    public static void swapInArray(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void inplaceReverse(int[] arr){
        int i=0;
        int j= arr.length-1;

        while(i<j){
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int[] ans= reverse(arr);
        for (int i=0;i<ans.length; i++){
            System.out.print(ans[i]+ " ");
        }
    }

}
