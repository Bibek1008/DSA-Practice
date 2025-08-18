package BST;
import java.util.*;

public class predsuccess {




        static int pred=-1;
        static int succ=-1;
        static TreeNode temp=null;
        static boolean flag=false;

        public static TreeNode buildTree(String[] values) {
        if (values.length == 0 || values[0].equals("")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while (!q.isEmpty() && i < values.length) {
            TreeNode curr = q.poll();

            // left child
            if (i < values.length && !values[i].equals("")) {
                curr.left = new TreeNode(Integer.parseInt(values[i]));
                q.add(curr.left);
            }
            i++;

            // right child
            if (i < values.length && !values[i].equals("")) {
                curr.right = new TreeNode(Integer.parseInt(values[i]));
                q.add(curr.right);
            }
            i++;
        }

        return root;
    }

    public static void inorder(TreeNode root,int val) {
        if (root == null) return;
        inorder(root.left,val);

        if(temp==null){
            temp=root;
        }
        else{

            if(root.val==val){
                pred=temp.val;
                flag=true;
            } else if (root.val>val && flag==true) {
                succ=root.val;
                flag=false;

            }
            else{
                temp=root;
            }


        }



        inorder(root.right,val);
    }

    public static void main(String[] args) {
        // Example input as string array
        String[] input = {"50", "30", "70", "20", "40", "60", "80"};
        TreeNode root = buildTree(input);

        int val=50;
        inorder(root,val);
        System.out.println("Pred: "+pred);
        System.out.println("successor: "+succ);

    }
}





















