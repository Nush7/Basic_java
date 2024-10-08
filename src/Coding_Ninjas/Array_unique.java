package Coding_Ninjas;

public class Array_unique {
    public static int findUnique(int arr[] , int n){
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                return arr[i];
            }
        }
        return -1;
        //if no element is unique
    }
    public static void main(String[] args) {
        int arr[]={3,7,8,8,7,3,5};
        int n=arr.length;
        System.out.println("The unique element is:" + findUnique(arr,n));
    }

}
