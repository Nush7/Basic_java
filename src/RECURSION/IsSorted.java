package RECURSION;

public class IsSorted {
    public static boolean isSort(int[] a, int idx){
        //base case
        if(idx== a.length-1){
            return true;
        }

        if(a[idx]> a[idx+1]){
            return false;
        }

        return isSort(a,idx+1);


    }
    public static void main(String[] args) {
    int[] a={1,2,4,8,5};
    System.out.println(isSort(a,0));


    }

}
