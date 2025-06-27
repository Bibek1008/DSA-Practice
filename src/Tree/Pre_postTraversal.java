package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Pre_postTraversal {


    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    static void preOrder(Node root){

        if(root==null){
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);

    }


    static void postOrder(Node root){

        if(root==null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);

    }
    static void inOrder(Node root){

        if(root==null){
            return;
        }

        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);


    }
    static  int height(Node root){
        if (root == null||(root.left==null && root.right==null)) {
            return 0;
        }

        return 1+ Math.max(height(root.left),height(root.right));
    }
    static void nthlevet(Node root,int n){

        if(root==null){
            return;
        }
        if(n==1){
            System.out.print(root.val+" ");
            return;

        }
        nthlevet(root.left,n-1);
        nthlevet(root.right,n-1);

    }
    static void bfs(Node root){

        Queue<Node> q=new LinkedList<>();
        if(root!=null){
            q.add(root);

        }
        while (q.size()>0){
            Node temp=q.peek();


            if(temp.left!=null){
                q.add(temp.left);

            }
            if (temp.right!=null){
                q.add(temp.right);
            }
            System.out.print(temp.val+" ");
            q.remove();
        }



    }



    public static void main(String[] args) {

        Node root = new Node(1);

        Node a = new Node(2);
        Node b = new Node(3);

        root.left = a;
        root.right = b;

        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;

        Node e = new Node(6);
        b.right = e;
        preOrder(root);

        System.out.println("This is post order");

        postOrder(root);
        System.out.println("This is in order");

        inOrder(root);

        System.out.println("Printing nth level ");
        nthlevet(root,2);
        int level=height(root)+1;
        System.out.println("\nPrinting level by level");
        for(int i=1;i<=level;i++){
            nthlevet(root,i);
            System.out.println();
        }
        System.out.println("Bfs way printing");
        bfs(root);

    }
}
