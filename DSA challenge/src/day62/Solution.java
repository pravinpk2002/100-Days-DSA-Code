package day62;

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

//    101. Symmetric Tree

    public boolean helper(TreeNode left,TreeNode right){

        if (left == null && right == null)
            return true;

        if (left == null || right == null)
            return false;

        return (left.val == right.val) && helper(left.left,right.right) && helper(left.right,right.left);
    }

    public boolean isSymmetric(TreeNode root) {

        if (root == null)
            return true;


        return helper(root.left,root.right);

    }



}
