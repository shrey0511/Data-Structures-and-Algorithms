//https://leetcode.com/problems/kth-smallest-element-in-a-bst/

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

    //Since we are concerned with smallest element , we use inOrder traversal
    static int count = 0;
    static int kthSmallest(TreeNode root , int k){
        if(root == null)
            return -1;

        int left = kthSmallest(root.left, k);

        if(left != -1){
            //We have already found the answer below no need to go more
            return left;
        }

        count++;
        if(count == k){
            return root.val;
        }

        return kthSmallest(root.right, k);
    }
}
