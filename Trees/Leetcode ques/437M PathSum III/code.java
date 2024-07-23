//https://leetcode.com/problems/path-sum-iii/

public class code {
    public static void main(String[] args) {
        
    }

    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;

        return helper(root , targetSum) + pathSum(root.left,targetSum) + pathSum(root.right , targetSum);
    }

    private int helper(TreeNode node , long target){
        if(node == null)
            return 0;

        int count = 0;//Start counting from the curr node
        if(target == node.val)
            count++;

        count += helper(node.left , target - node.val);
        count += helper(node.right , target - node.val);

        return count;
    }

}
