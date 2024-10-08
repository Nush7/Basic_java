package Coding_Ninjas;

public class CBrecursion {
//    public static void print(int n){
//        if(n==0){
//            return;
//        }
//
//        System.out.println(n);
//        print(n-1);
//        System.out.println(n);
//    }

//    public static void printSkip(int n){
//        if(n==0){
//            return;
//        }
//
//        if(n%2== 1){
//            System.out.println(n);
//        }
//        printSkip(n-1);
//        if (n%2==0){
//            System.out.println(n);
//        }
//    }

    public static int index(int[] a, int target, int idx){
        if(idx>= a.length){
            return  -1;
        }

        if(target == a[idx]){
            return idx;
        }

        return index(a, target, idx+1);
    }
    public static void main(String[] args) {
        int n=5;
        //print(n);
        //printSkip(n);
        int[] a= {6,8,1,1,3,4};
        int target = 1;
        System.out.println(index(a,target, 0));
    }

}
