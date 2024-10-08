package STACKS;

import java.util.Stack;

public class ReverseStack {
    public static void pushAtBottom(Stack<Integer> st, int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top= st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }
    public static void reverseRec(Stack<Integer> st){
        if(st.size()==1) return;
        int top= st.pop();
        reverseRec(st);
        pushAtBottom(st, top);

    }
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverseRec(st);
        System.out.println(st);

        //Iterative method
//        Stack<Integer> rt= new Stack<>();
//        while(st.size()>0){
//            rt.push(st.pop());
//        }
//        System.out.println(rt);
//        Stack<Integer> qt= new Stack<>();
//        while(rt.size()>0){
//            qt.push(rt.pop());
//        }
//        System.out.println(qt);
//        while(qt.size()>0){
//            st.push(qt.pop());
//        }
//        System.out.println(st);
    }
}
