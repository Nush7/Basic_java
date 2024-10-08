package STACKS;

import java.util.Stack;

public class DisplayStack {
    public static void displayReverseRecursively(Stack<Integer> st){
        if(st.size()==0) return;
        int top= st.pop();
        System.out.print(top+ " ");
        displayReverseRecursively(st);
        st.push(top);
    }
    public static void displayRecursively(Stack<Integer> st){
        if(st.size()==0) return;
        int top= st.pop();
        displayRecursively(st);
        System.out.print(top+ " ");
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displayRecursively(st);
        displayReverseRecursively(st);
//        int n= st.size();
//        int[] arr= new int[n];
//        for(int i= n-1; i>=0;i--){
//            arr[i]= st.pop();
//        }
//        for(int i=0; i<n; i++){
//            System.out.print(arr[i]+ " ");
//            st.push(arr[i]);
//        }
    }

}
