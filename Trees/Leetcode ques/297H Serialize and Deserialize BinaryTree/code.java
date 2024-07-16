//https://leetcode.com/problems/serialize-and-deserialize-binary-tree/

import java.util.*;

public class code {
    public static void main(String[] args) {
        
    }

    //* Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


//Google ,Facebook and Amazon question

    // Encodes a tree to a single string.
    static List<String> serialize(TreeNode root){
        List<String> list = new ArrayList<>();
        helper(root , list);
        return list;
    }


    private static void helper(TreeNode node, List<String> list) {
        if(node == null){
            list.add("null");
        }

        list.add(String.valueOf(node.val));

        helper(node.left, list);
        helper(node.right, list);

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(List<String> data) {
        //If we try to remove from beginning then list will adjust everytime so
        Collections.reverse(data);
        TreeNode node = helper2(data);
        return node; 
    }


    private TreeNode helper2(List<String> data) {
        String val = data.remove(data.size()-1);

        if(val.charAt(0)=='n'){
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(val));

        node.left = helper2(data);
        node.right = helper2(data);

        return node;
    }
}
