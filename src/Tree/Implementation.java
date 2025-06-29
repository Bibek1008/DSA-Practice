package Tree;

public class Implementation {

    public static class Node{

        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val=val;
        }
    }

    public static void display(Node root){

        if(root==null){
            return;
        }

        System.out.print(root.val+"--->");
        if (root.left!=null) System.out.print(root.left.val+",");
        if (root.right!=null) System.out.print(root.right.val+",");
        System.out.println();

        display(root.left);
        display(root.right);


    }


    public static void main(String[] args) {

        Node root=new Node(1);

        Node a=new Node(10);
        Node b=new Node(15);

        root.left=a;
        root.right=b;

        Node c=new Node(20);
        Node d=new Node(35);
        a.left=c;
        a.right=d;
        Node e=new Node(30);
        b.right=e;

        //printing tree
        display(root);



    }
}
