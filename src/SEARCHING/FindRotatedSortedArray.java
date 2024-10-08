package SEARCHING;

public class FindRotatedSortedArray {
    public static int search(int[] arr, int target){
        int st=0, end= arr.length-1;
        while(st<= end){
            int mid= st+ (end-st)/2;
            if(arr[mid]== target){
                return mid;
            }
            else if(arr[mid]< arr[end]){ //mid to end is sorted
                if(target> arr[mid] && target<= arr[end]){
                    st= mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{ //start to mid is sorted
                if(target>= arr[st] && target< arr[mid]){
                    end= mid-1;
                }
                else{
                    st= mid+1;
                }
            }
        }
        return -1;
    }

    public static int search_duplicate(int[] arr, int target){
        int st=0, end= arr.length-1;
        while(st<= end){
            int mid= st+ (end-st)/2;
            if(arr[mid]== target){
                return mid;
            }
            else if (arr[st]== arr[mid] && arr[end]== arr[mid]){
                st++;
                end--;
            }
            else if(arr[mid]< arr[end]){ //mid to end is sorted
                if(target> arr[mid] && target<= arr[end]){
                    st= mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{ //start to mid is sorted
                if(target>= arr[st] && target< arr[mid]){
                    end= mid-1;
                }
                else{
                    st= mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr= {9,10,11,12, 1, 2,3,4,5,6,8};
        int target= 12;
        int[] arr1= {1,1,1,1,1,1, 2,2,3,1};
        int target1= 2;
        System.out.println(search(arr, target));
        System.out.println(search_duplicate(arr1, target1));
    }

}
