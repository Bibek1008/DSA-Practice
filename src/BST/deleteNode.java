package BST;
import java.util.*;
public class deleteNode {


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
//    public static void preorder(TreeNode root) {
//        if (root == null) return;
//        System.out.print(root.val + " ");
//        preorder(root.left);
//        preorder(root.right);
//
//
//    }
//
//    public static void delete(TreeNode root,int target){
//        if(root==null){
//            return;
//        }
//        //left delete
//        if(root.val>target){
//            if(root.left==null) return;
//            if(root.left.val==target) {
//
//                if(root.left.left==null && root.left.right==null){//leaf node
//
//                    root.left=null;
//                } else if (root.left.left==null || root.left.right==null) {//1 child case
//
//                    if (root.left.left!=null){
//                        root.left=root.left.left;
//                    }
//                    else{
//                        root.left=root.left.right;
//                    }
//
//                }
//
//
//            }
//
//            else{
//                delete(root.left,target);
//            }
//        }
//        //right del
//       else{
//            if(root.right==null) return;
//            if(root.right.left==null && root.right.right==null){//leaf node
//
//                root.right=null;
//            } else if (root.right.left==null || root.right.right==null) {//1 child case
//
//                if (root.right.left!=null){
//                    root.right=root.right.left;
//                }
//                else{
//                    root.right=root.right.right;
//                }
//
//            }
//            else{
//                delete(root.right,target);
//            }
//        }
//
//    }
//
//    public static void main(String[] args) {
//        // Example input as string array
//        String[] input = {"50", "20", "60", "17", "34", "55", "89","10","","28","","","","78","","","14"};
//        TreeNode root = buildTree(input);
//
//        System.out.println("Inorder traversal:");
//        inorder(root);
//
//        System.out.println("\npreorder traversal:");
//        preorder(root);
//
//        delete(root,10);
//
//        System.out.println("\npreorder traversal after deletion:");
//        preorder(root);
//    }















}
