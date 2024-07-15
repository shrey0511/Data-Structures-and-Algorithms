//https://leetcode.com/problems/create-binary-tree-from-descriptions/?envType=daily-question&envId=2024-07-15

import java.util.HashMap;
import java.util.HashSet;

public class code {
    public static void main(String[] args) {
        
    }

    //* Definition for a binary tree node.
    static class TreeNode {
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

    static TreeNode createBinaryTree(int[][] descriptions) {
        
        HashMap<Integer , TreeNode> map = new HashMap<>();
        HashSet<Integer> children = new HashSet<>();

        for(int[] arr : descriptions){
            int parent = arr[0] , child = arr[1] , isLeft = arr[2];
            children.add(child);

            TreeNode node = map.getOrDefault(parent , new TreeNode(parent));

            if(isLeft == 1){
                node.left = map.getOrDefault(child , new TreeNode(child));
                map.put(child , map.getOrDefault(child , node.left));
            }else{
                node.right = map.getOrDefault(child , new TreeNode(child));
                map.put(child , map.getOrDefault(child , node.right));
            }
            map.put(parent , node);
        }

        int root = -1;
        for(int[] arr : descriptions){
            if(!children.contains(arr[0])){
                root = arr[0];
                break;
            }
        }
        return map.getOrDefault(root,null);
    }
}
