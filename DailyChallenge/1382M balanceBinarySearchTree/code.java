//https://leetcode.com/problems/balance-a-binary-search-tree/?envType=daily-question&envId=2024-06-26

import java.util.ArrayList;
import java.util.List;

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

    static TreeNode balanceBST(TreeNode root) {
        List<Integer> sortedElements = new ArrayList<>();
        inOrderTraversal(root, sortedElements);
        return buildBalancedBST(sortedElements, 0, sortedElements.size() - 1);
    }
    
    static void inOrderTraversal(TreeNode node, List<Integer> sortedElements) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left, sortedElements);
        sortedElements.add(node.val);
        inOrderTraversal(node.right, sortedElements);
    }
    
    static TreeNode buildBalancedBST(List<Integer> elements, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(elements.get(mid));
        node.left = buildBalancedBST(elements, start, mid - 1);
        node.right = buildBalancedBST(elements, mid + 1, end);
        return node;
    }
}
