package Coding_Ninjas;

public class Array_duplicate {
    public static int findDupe(int a[], int n){
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(a[i]==a[j]){
                        count++;
                    }
                }
            }
            if(count==1){
                return a[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={0,7,2,5,4,7,1,3,6};
        int n=arr.length;
        System.out.println("Dupe is:" +findDupe(arr,n));
    }

}
