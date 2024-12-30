package day55;

import java.util.ArrayList;
import java.util.List;

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



    public void preorder(TreeNode root, List<Integer> list){
        if (root == null)
            return;;

            list.add(root.val);
            preorder(root.left,list);
            preorder(root.right,list);
    }

    public List<Integer> preorderTraversal(TreeNode root) {

        if (root == null)
            return new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        preorder(root,list);
        return list;

    }



    public void inorder(TreeNode root, List<Integer> list){

        if (root == null)
            return;


        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right,list);

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        inorder(root, list);

        return list;
    }



    public void postorder(TreeNode root, List<Integer> list){


        if( root == null)
            return;

        postorder(root.left,list);
        postorder(root.right,list);
        list.add(root.val);


    }
    public List<Integer> postorderTraversal(TreeNode root) {

        if(root == null)
            return new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        postorder(root, list);

        return list;
    }




}
