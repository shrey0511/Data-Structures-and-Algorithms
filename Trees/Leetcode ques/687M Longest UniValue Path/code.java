//https://leetcode.com/problems/longest-univalue-path/

public class code {
    public static void main(String[] args) {
        
    }

    private int ans = 0;
    public int longestUnivaluePath(TreeNode root) {
        helper(root);
        return ans;
    }

    private int helper(TreeNode node){
        if(node == null)
            return 0;

        int left = helper(node.left);
        int right = helper(node.right);

        //Calculate the path length
        int leftLength = 0 , rightLength = 0;

        if(node.left != null && node.left.val == node.val){
            leftLength = left + 1;
        }
        if(node.right != null && node.right.val == node.val){
            rightLength = right + 1;
        }

        ans = Math.max(ans , leftLength + rightLength);

        return Math.max(leftLength , rightLength);
    }
}
