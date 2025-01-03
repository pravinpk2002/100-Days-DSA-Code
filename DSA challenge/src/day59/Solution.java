package day59;

public class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    //110. Balanced Binary Tree
    // Logic 1
//    public int height(TreeNode root){
//
//        if(root == null)
//            return 0;
//
//        return 1 + Math.max(height(root.left),height(root.right));
//    }
//
//    public boolean isBalanced(TreeNode root) {
//        if (root == null)
//            return true;
//
//        int left = height(root.left);
//        int right = height(root.right);
//
//        boolean balanced = (Math.abs(left - right)>1) ? false : true;
//        return balanced && isBalanced(root.left) && isBalanced(root.right);
//    }

// logic 2
    public int height(TreeNode root){

        if(root == null)
            return 0;

        int left = height(root.left);
        if(left == -1)
            return -1;

        int right = height(root.right);
        if(right == -1)
            return -1;

        if (Math.abs(left - right) > 1)
            return -1;

        return 1 + Math.max(height(root.left),height(root.right));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;


        return height(root) != -1;
    }
}
