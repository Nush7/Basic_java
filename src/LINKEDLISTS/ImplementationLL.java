package LINKEDLISTS;

public class ImplementationLL {
    public static class Node{
        int data;
        Node next;
        Node (int data){
            this.data= data;
        }
    }
    public static class linkedlist{
        Node head= null;
        Node tail= null;
        int size=0;
        void insertAtEnd(int val){
            Node temp= new Node(val);
            if(head== null){
                head= temp;
            }
            else{
                tail.next= temp;
            }
            tail = temp;
            size++;
        }
        void insertAtHead(int val){
            Node temp= new Node(val);
            if(head==null){ //empty list
                head= tail= temp;
            }
            else{ //non-empty list
                temp.next= head;
                head= temp;
            }
            size++;
        }
        //inserting element in a Linked list if the index is given
        void insertAt(int idx, int val){
            Node t= new Node(val);
            Node temp= head;
            if(idx==size){
                insertAtEnd(val);
                return;
            }
            else if(idx==0){
                insertAtHead(val);
                return;
            } else if (idx<0 || idx> size()) {
                System.out.println("wrong index");
            }
            for(int i=1; i<= idx-1;i++ ){
                temp= temp.next;
            }
            t.next= temp.next;
            temp.next= t;
            size++;
        }
        int getAt(int idx){
            Node temp = head;
            for(int i=1; i<= idx; i++){
                temp= temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){
            if(idx==0) head=head.next;
            Node temp= head;
            for(int i=1; i<= idx-1; i++){
                temp= temp.next;
            }
            temp.next= temp.next.next;
            tail = temp;
            size--;
        }
        void display(){
            Node temp= head;
            while(temp!= null){
                System.out.print(temp.data +" ");
                temp= temp.next;
            }
        }
        int size(){
            Node temp= head;
            int count =0;
            while(temp!= null){
                count++;
                temp= temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist ll= new linkedlist();
        ll.insertAtEnd(4); //4
        ll.insertAtEnd(5); //4 5
        ll.display();
        System.out.println();
        ll.insertAtHead(10);
        ll.display();
        System.out.println();
        System.out.println(ll.size());
        System.out.println(ll.getAt(3));
    }

}
