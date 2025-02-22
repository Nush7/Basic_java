package TREES;

public class Traversals {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val= val;
        }
    }
    public static void nthLevel(Node root, int n){
        if(root== null) return;
        if(n==1) System.out.print(root.val+ " ");
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
    }
    public static void postorder(Node root){
        if(root== null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);
    }
    public static void inorder(Node root){
        if(root== null) return;
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }
    public static void preorder(Node root){
        if(root== null) return;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root= new Node(1);
        Node a= new Node(2);
        Node b= new Node(3);
        root.left=a;
        root.right= b;
        Node c= new Node(4);
        Node d= new Node(5);
        a.left=c;
        a.right= d;
        Node e= new Node(6);
        Node f= new Node(7);
        b.left= e;
        b.right=f;


    }

}
