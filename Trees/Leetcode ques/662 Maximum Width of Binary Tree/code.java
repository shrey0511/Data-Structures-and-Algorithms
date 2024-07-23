//https://leetcode.com/problems/maximum-width-of-binary-tree/

import java.util.*;

public class code {
    public static void main(String[] args) {
        
    }

    class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() { return key; }
        public V getValue() { return value; }
    }

    public int widthOfBinaryTree(TreeNode root) {
        int max = 0;
        Queue< Pair<TreeNode,Integer> > q = new LinkedList();
        q.offer(new Pair<>(root,0));

        while(!q.isEmpty()){
            int size = q.size();
            int start = q.peek().getValue();//Position of leftMost node
            int endPos = start;

            for(int i = 0 ; i<size ; i++){
                Pair<TreeNode,Integer> curr = q.poll();
                TreeNode node = curr.getKey();
                endPos = curr.getValue();//To prevent overflow and get correct position

                if(node.left != null){
                    q.offer(new Pair<>(node.left , 2*endPos+1));
                }
                if(node.right != null){
                    q.offer(new Pair<>(node.right , 2*endPos+2));
                }
            
            }
            max = Math.max(max , endPos-start+1);
        }
        return max;
    }
}
