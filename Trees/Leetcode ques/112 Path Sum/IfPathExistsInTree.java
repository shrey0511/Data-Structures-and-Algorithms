
import java.util.*;

public class IfPathExistsInTree {
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

    static boolean pathExists(TreeNode node , int[] path){
        if(node == null)
            return path.length == 0;

        return helper(node , path , 0);
    }

    private static boolean helper(TreeNode node, int[] path, int i) {
        if(node == null)
            return false;

        if(i >= path.length || node.val != path[i]){
            return false;
        }

        if(node.left == null && node.right == null && i == path.length-1){
            return true;
        }

        return helper(node.left, path, i+1) || helper(node.right, path, i+1);

    }
}
