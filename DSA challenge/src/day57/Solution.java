package day57;

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


    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;


        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public int diameterOfBinaryTree(TreeNode root) {
            if (root == null)
                return 0;


            int diam1 = maxDepth(root.left) + maxDepth(root.right);
            int diam2 = diameterOfBinaryTree(root.left);
            int diam3 = diameterOfBinaryTree(root.right);

            return Math.max(diam1, Math.max(diam2,diam3));



    }

}
