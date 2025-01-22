package day78;

public class Solution {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;


        TreeNode() {}


        TreeNode(int val) {
            this.val = val;
        }


        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public TreeNode insertIntoBST(TreeNode root, int val) {


            return insert(root,val);
    }


    public TreeNode insert(TreeNode root, int val){
        if (root == null){
            return new TreeNode(val,null,null);
        }

        if(root.val < val){
            root.right =  insert(root.right,val);
        }else{
            root.left = insert(root.left,val);
        }

        return root;
    }
}
