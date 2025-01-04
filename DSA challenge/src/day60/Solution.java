package day60;

import java.util.LinkedList;
import java.util.Queue;

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


    static class Pair< K,V >{
        K key;
        V value;

        public Pair(K key, V value){
           this.key = key;
           this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;

        Queue<Pair<TreeNode,Integer>> queue = new LinkedList<>();

        queue.offer(new Pair<>(root,0));

        int maxWidth = 0;

        while (queue.isEmpty() == false){
            int size = queue.size();
            int levelstart = queue.peek().getValue();
            int levelEnd = levelstart;

            for (int i = 0; i < size; i++) {
                Pair<TreeNode, Integer> current = queue.poll();
                TreeNode node = current.getKey();
                int index = current.getValue();

                levelEnd = index;

                if (node.left != null){
                    queue.offer(new Pair<>(node.left, 2 * index +1));
                }
                if (node.right !=  null){
                    queue.offer(new Pair<>(node.right, 2 * index + 2));
                }
            }
        int width = levelEnd - levelstart + 1;
        maxWidth = Math.max(maxWidth, width);
        }

        return maxWidth;

    }
}
