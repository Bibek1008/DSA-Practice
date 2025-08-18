package Generic_Tree;
import java.util.*;
public class Construct {

    static class Node{

        int value;
        List<Node> child;
        Node(int val){

            this.value=val;

            child=new ArrayList<>();
        }
    }

    static void postodred(Node root){

        if(root==null){

            return;
        }


        for(Node temp:root.child){
            postodred(temp);
        }
        System.out.print(root.value+" ");
    }
    static void preodred(Node root){
        int max=Integer.MIN_VALUE;
        if(root==null){

            return;
        }
        System.out.print(root.value+" ");
        if(root.value>max){
            max=root.value;
        }

        for(Node temp:root.child){
            preodred(temp);
        }

    }
    static int maxi(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE; // better than -1 for general case
        }

        int max = root.value;

        for (Node temp : root.child) {
            int childMax = maxi(temp);
            if (childMax > max) {
                max = childMax;
            }
        }
        return max;
    }
    static void mirrorTree(Node root) {
        if (root == null) {
            return;
        }

        // First mirror all subtrees
        for (Node temp : root.child) {
            mirrorTree(temp);
        }

        // Then reverse the current node's children
        Collections.reverse(root.child);
    }



    static void levelorder_traversal(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node current = q.peek();
            System.out.print(current.value + " ");
            q.remove();

            for (Node child : current.child) {
                q.add(child);
            }
        }
    }

    static void zigzagorder_traversal(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean flag = false; // false = left-to-right, true = right-to-left

        while (!q.isEmpty()) {
            int levelsize = q.size();
            List<Integer> currentlevel = new ArrayList<>();

            while (levelsize > 0) {
                Node current = q.peek();
                currentlevel.add(current.value);
                q.remove();

                for (Node child : current.child) {
                    q.add(child);
                }
                levelsize--; // important to decrement
            }

            if (flag == true) {
                Collections.reverse(currentlevel);
            }

            for (int val : currentlevel) {
                System.out.print(val + " ");
            }
            System.out.println();

            flag = !flag; // toggle direction
        }
    }






    public static void main(String[] args) {


        Node root=new Node(30);

        root.child.add(new Node(5));
        root.child.add(new Node(15));
        root.child.add(new Node(25));

        //in next level

        root.child.get(0).child.add(new Node(12));
        root.child.get(0).child.add(new Node(22));
        root.child.get(0).child.add(new Node(32));

        //
        root.child.get(1).child.add(new Node(12));
        root.child.get(1).child.add(new Node(23));
        root.child.get(1).child.add(new Node(33));

        root.child.get(2).child.add(new Node(24));
        root.child.get(2).child.add(new Node(34));
        root.child.get(2).child.add(new Node(35));


        preodred(root);
        System.out.println("\nThis is post order traversal");
        postodred(root);

        System.out.println("\nThis is level order traversal");
        levelorder_traversal(root);

        System.out.println("\nThis is zigzag traversal");
        zigzagorder_traversal(root);

        System.out.println("\nThe maximum value is "+maxi(root));
        System.out.println("\nThis is mirror");
        mirrorTree(root);
        levelorder_traversal(root);
    }


}
