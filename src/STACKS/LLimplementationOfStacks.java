package STACKS;

public class LLimplementationOfStacks {
    public static class Node{
        Node next;
        int val;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLStack{
        Node head= null;
        int size=0;
        void push(int x){
            Node temp= new Node(x);
            temp.next= head;
            head= temp;
            size++;
        }
        int pop(){
            if(head== null){
                return -1;
            }
            int x= head.val;
            head= head.next;
            return x;
        }
        int peek(){
            if(head== null){
                return -1;
            }
            return head.val;
        }
        void displayRec(Node h){
            if(h== null) return;
            displayRec(h.next);
            System.out.println(h.val+ " ");
        }
        void display(){
            displayRec(head);
            System.out.println();
        }
        void displayReverse(){
            Node temp= head;
            while(temp!= null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
    }


    public static void main(String[] args) {
        LLStack st= new LLStack();
        st.push(4);
        st.push(5);
        st.push(1);
        st.display();
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.display();
        st.displayReverse();
    }

}
