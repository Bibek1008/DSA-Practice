package BST;
import java.util.*;
public class Predicessor {
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

    public static void inorder(TreeNode root,List<Integer>arr) {
        if (root == null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }




    public static void main(String[] args) {
        // Example input as string array
        String[] input = {"50", "20", "60", "17", "34", "55", "89","10","","28","","","","78","","","14"};
        TreeNode root = buildTree(input);
        List<Integer>arr=new ArrayList<>();
        System.out.println("Inorder traversal:");
        inorder(root,arr);
        int val=28;
        int idx=-1;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==val){
                idx=i;
                break;
            }
        }
        int pred=arr.get(idx-1);
        int succ=arr.get(idx+1);

        System.out.println("The pred is "+pred);
        System.out.println("The succ is "+succ);


    }
}
