package HEAP;

import java.util.ArrayList;
import java.util.List;

public class MinHeapInsertion {
    private static void swap(List<Integer> heap, int l, int r){
        int temp= heap.get(l);
        heap.set(l,heap.get(r));
        heap.set(r, temp);
    }
    private static void push_up_in_MinHeap(List<Integer> heap, int i){
        int parent_index= (i-1)/2;

        //until root reached/ correct position found
        if(i==0 || heap.get(parent_index)< heap.get(i)){
            return;
        }
        //swap
        swap(heap, i, parent_index);
        push_up_in_MinHeap(heap, parent_index);
    }
    private static void insert_in_MinHeap(List<Integer> heap, int element){
        //last me add
        heap.add(element);

        int index= heap.size()-1;
        push_up_in_MinHeap(heap, index);
    }
    private static void push_up_in_MaxHeap(List<Integer> heap, int i){
        int parent_index= (i-1)/2;
        if(i==0 || heap.get(parent_index)> heap.get(i)){
            return;
        }

        //swap until correct position found
        swap(heap, i, parent_index);
        push_up_in_MaxHeap(heap, parent_index);
    }
    private static void insert_in_MaxHeap(List<Integer> heap, int element){
        //last me add
        heap.add(element);

        int index= heap.size()-1;
        push_up_in_MaxHeap(heap, index);
    }
    public static void push_down_in_MinHeap(List<Integer> heap, int index){
        int n= heap.size()-1;
        if(index==n){
            return;
        }
        int left= (2*index)+1;
        int right= (2*index)+2;
        int smallest= index;
        if(left<= n && heap.get(left)< heap.get(smallest)){
            smallest= left;
        }
        if(right<= n && heap.get(right)< heap.get(smallest)){
            smallest= right;
        }
        if(smallest== index){
            return;
        }

        swap(heap, index, smallest);
        push_down_in_MinHeap(heap, smallest);


    }
    public static void push_down_in_MaxHeap(List<Integer> heap, int index){
        int n= heap.size()-1;
        if(index==n){
            return;
        }
        int left= (2*index)+1;
        int right= (2*index)+2;
        int largest= index;
        if(left<= n && heap.get(left)>heap.get(largest)){
            largest= left;
        }
        if(right<= n && heap.get(right)> heap.get(largest)){
            largest= right;
        }
        if(largest== index){
            return;
        }

        swap(heap, index, largest);
        push_down_in_MinHeap(heap, largest);


    }
    public static void deleteFromMinHeap(List<Integer> heap){
        //swapping 1st and last element
        swap(heap, 0, heap.size()-1);
        heap.remove(heap.size()-1);

        push_down_in_MinHeap(heap, 0);
    }
    public static void heapify(List<Integer> arr){
        int first_non_leaf_node=((arr.size()-1)-1) /2;
        for(int i= first_non_leaf_node; i>=0; i--){
            push_down_in_MinHeap(arr,i);
        }

    }
    public static void main(String[] args) {
        //we'll be implementing heaps through arrayList/ arrays
        List<Integer> heap= new ArrayList<>();
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);
        System.out.println(heap);
        insert_in_MinHeap(heap, 5);
        System.out.println(heap);

        List<Integer> maxHeap= new ArrayList<>();
        maxHeap.add(60);
        maxHeap.add(50);
        maxHeap.add(40);
        maxHeap.add(30);
        maxHeap.add(20);
        maxHeap.add(30);
        maxHeap.add(10);
        System.out.println(maxHeap);
        insert_in_MaxHeap(maxHeap, 40);
        System.out.println(maxHeap);






    }

}
