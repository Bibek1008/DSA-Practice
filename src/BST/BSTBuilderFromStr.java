package BST;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}

public class BSTBuilderFromStr {

//    public static TreeNode buildTree(String[] values) {
//        if (values.length == 0 || values[0].equals("")) {
//            return null;
//        }
//
//        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
//        Queue<TreeNode> q = new LinkedList<>();
//        q.add(root);
//
//        int i = 1;
//        while (!q.isEmpty() && i < values.length) {
//            TreeNode curr = q.poll();
//
//            // left child
//            if (i < values.length && !values[i].equals("")) {
//                curr.left = new TreeNode(Integer.parseInt(values[i]));
//                q.add(curr.left);
//            }
//            i++;
//
//            // right child
//            if (i < values.length && !values[i].equals("")) {
//                curr.right = new TreeNode(Integer.parseInt(values[i]));
//                q.add(curr.right);
//            }
//            i++;
//        }
//
//        return root;
//    }
//
//    public static void inorder(TreeNode root) {
//        if (root == null) return;
//        inorder(root.left);
//        System.out.print(root.val + " ");
//        inorder(root.right);
//    }
//
//    public static void main(String[] args) {
//        // Example input as string array
//        String[] input = {"5", "3", "7", "2", "4", "", "8"};
//        TreeNode root = buildTree(input);
//
//        System.out.println("Inorder traversal:");
//        inorder(root);
//    }
}
