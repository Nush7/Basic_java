package Coding_Blocks;

public class Array_SecondLargest {

    public static int findMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int findSecondMax(int[] arr){
        int max= findMax(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]==max){
                arr[i]= Integer.MIN_VALUE;
            }
        }

        int secondMax= findMax(arr);
        return secondMax;
    }
    public static void main(String[] args) {
        int[] arr={10, 10, 5,8 ,3};
        int secondMax= findSecondMax(arr);
        System.out.println(secondMax);
    }

}
