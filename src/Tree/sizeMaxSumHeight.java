package Tree;

public class sizeMaxSumHeight {

    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void display(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + "--->");
        if (root.left != null) System.out.print(root.left.val + ",");
        if (root.right != null) System.out.print(root.right.val + ",");
        System.out.println();

        display(root.left);
        display(root.right);
    }

    static int size(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }

    static  int sum(Node root){
        if (root == null) {
            return 0;
        }
        return root.val+sum(root.left)+sum(root.right);
    }

    static  int height(Node root){
        if (root == null) {
            return 0;
        }
        if(root.left==null && root.right==null){
            return 0;
        }
        return 1+ Math.max(height(root.left),height(root.right));
    }

    static  int maximum(Node root){
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int a=root.val;
        int b=maximum(root.left);
        int c=maximum(root.right);
        return Math.max(a,Math.max(b,c));
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        Node a = new Node(10);
        Node b = new Node(15);

        root.left = a;
        root.right = b;

        Node c = new Node(20);
        Node d = new Node(35);
        a.left = c;
        a.right = d;

        Node e = new Node(36);
        b.right = e;

        // Printing the tree
        display(root);

        // Print size of tree
        System.out.println("Size of tree: " + size(root));

        System.out.println("Size of tree: " + sum(root));

        System.out.println("The maximum value of tree: " + maximum(root));
        System.out.println("The maximum height of tree: " + height(root));
    }
}
