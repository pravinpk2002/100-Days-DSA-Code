package day56;

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


      //104. Maximum Depth of Binary Tree
    public int maxDepth(TreeNode root) {

        if (root == null)
            return 0;


        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }


    public int countNodes(TreeNode root) {


        if (root == null)
            return 0;


        return  1 +(countNodes(root.left) + countNodes(root.right));

    }

}
