package RECURSION;

public class LastIndex {
    public static int findLastIndex(int[] a, int target, int idx){
        if(idx==a.length){
            return -1;
        }

        int lastIndex= findLastIndex(a, target, idx+1);
        if(lastIndex==-1){
            if(a[idx]==target){
                return idx;
            }
            else {
                return -1;
            }
        }
        else {
            return lastIndex;
        }

    }
    public static void main(String[] args) {
        int[] a= {1,2,3,4,2,5,6,2};
        int target= 2;
        System.out.println(findLastIndex(a, target, 0));
    }

}
