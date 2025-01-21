package day77;

public class BinarySearchTree {


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


    public static class binarySearchTree {

        public static Node insert(Node root, int value) {
            if (root == null) {
                return new Node(value);
            }

            if (value < root.data) {
                root.left = insert(root.left, value);
            } else if (value > root.data) {
                root.right = insert(root.right, value);
            }

            return root;
        }

        public static Node buildBST(int nodes[]) {
            Node root = null;

            for (int value : nodes) {
                if (value != -1) {
                    root = insert(root, value);
                }
            }

            return root;
        }

        public static void inorderTraversal(Node root) {
            if (root == null) {
                return;
            }

            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        int nodes[] = {50, 30, 70, 20, 40, 60, 80, -1};

        binarySearchTree bst = new binarySearchTree();
        Node root = bst.buildBST(nodes);

        System.out.println("Inorder Traversal of the BST:");
        bst.inorderTraversal(root);
    }

}
