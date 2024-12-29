package day54;


import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeOperations {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){

            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public  static class BinaryTree {
        static int index =  -1;
        public static Node buildTree(int nodes[]){
            index++;
            if (nodes[index] == -1){
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void preorder(Node root){

        if (root == null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);


    }


    public static void inorder(Node root){
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static  void postorder(Node root){
        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }


    public static void leevelOrder(Node root){

        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node cuurentNode = q.remove();

            if (cuurentNode == null){
                System.out.println();

                if (! q.isEmpty())
                    q.add(null);

            }else {
                System.out.print(cuurentNode.data+" ");
                if (cuurentNode.left != null)
                    q.add(cuurentNode.left);

                if (cuurentNode.right != null)
                    q.add(cuurentNode.right);

            }
        }
    }

    public static int height(Node root) {
        if(root == null) {
            return 0;
        }


        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }


    public static int countOfNodes(Node root) {
        if(root == null) {
            return 0;
        }

        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);

        leevelOrder(root);

        System.out.println("height of tree "+ height(root));
        System.out.println("total number of nodes: "+countOfNodes(root));


    }
}
