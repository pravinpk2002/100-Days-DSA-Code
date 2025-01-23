package day79;

public class Solution {

//    450. Delete Node in a BST
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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return null;

        if ( key < root.val){

            root.left = deleteNode(root.left,key);
        }else if (key > root.val){
            root.right = deleteNode(root.right,key);
        }else{
            root = helper(root);        }

        return root;
    }

    public TreeNode helper(TreeNode root){

        if (root.left == null && root.right == null)
            return null;

        if (root.left == null)
            return root.right;

        if (root.right == null)
            return root.left;

        TreeNode successor = findmin(root.right);

        root.val = successor.val;
        root.right = deleteNode(root.right, successor.val);
        return root;


    }

    public TreeNode findmin(TreeNode node){
        while (node.left != null)
            node = node.left;

        return node;
    }

}
