package LINKEDLISTS;

public class Basics {
    //finding the length of the LL
    public static int lengthLL(Node head){
        int count=0;
        while(head!= null){
            count++;
            head=head.next;
        }
        return count;
    }
    //printing LL recursively
    public static void displayRec (Node head){
        if (head== null) return;
        System.out.println(head.data +" ");
        displayRec(head.next);
    }
    public static void displayRecREVERSE (Node head){
        if (head== null) return;
        displayRec(head.next);
        System.out.println(head.data +" ");
    }
    public static void displayLL(Node head){
        Node temp= head;
        while (temp != null) {
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
    }
    public static class Node{
        int data;// value
        Node next;// address of next node
        Node(int data){
            this.data= data;
        }
    }
    public static void main(String[] args) {
        Node a= new Node(5);
        System.out.println(a.next); //null
        Node b= new Node(3);
        Node c= new Node(9);
        Node d= new Node(8);
        Node e= new Node(16);
        //now we need to link all the nodes
        // 5 3 9 8 16
        a.next=b; // 5 -> 3 9 8 16
        //printing a ka data
        System.out.println(a.data); //5
        //if we want to print b ka data
        System.out.println(a.next.data); //3
        //linking remaining nodes
        b.next= c; // 5 -> 3 -> 9 8 16
        c.next= d; // 5 -> 3 -> 9 -> 8 16
        d.next= e; // 5 -> 3 -> 9 -> 8 -> 16

        //printing the linked list when we know our head
        //here we knew that our head node is a
        Node temp= a;
        for(int i=1; i<= 5; i++){ //since we know there are 5 nodes
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        displayLL(a);
        displayRec(a);
        displayRecREVERSE(a);
        int len= lengthLL(a);

        //case: no. of nodes unknown
        // logic: the address value of the last node is null
//        while (temp != null) {
//            System.out.print(temp.data +" ");
//            temp=temp.next;
//        }



    }

}
