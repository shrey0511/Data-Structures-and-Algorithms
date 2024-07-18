//https://leetcode.com/problems/binary-tree-paths/

import java.util.ArrayList;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }

    //* Definition for a binary tree node.
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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        helper(root , paths , new StringBuilder());
        return paths; 
    }

    private void helper(TreeNode node , List<String> paths , StringBuilder sb){
        if(node == null){
            return;
        }
        int lengthBefore = sb.length();

        sb.append(node.val);

        if(node.left == null && node.right == null){
            paths.add(sb.toString());
        }else{
            sb.append("->");
            helper(node.left , paths , sb);
            helper(node.right , paths , sb);
        }

        //Backtracking
        sb.setLength(lengthBefore);

        return;
    }
}
