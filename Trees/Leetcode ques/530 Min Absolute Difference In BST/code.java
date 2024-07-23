//https://leetcode.com/problems/minimum-absolute-difference-in-bst/

public class code {
    public static void main(String[] args) {
        
    }

    private int min = Integer.MAX_VALUE;
    private Integer prev = null;

    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return min;
    }

    private void inOrder(TreeNode node){
        if(node == null){
            return;
        }

        inOrder(node.left);

        if(prev != null){
            min = Math.min(min , Math.abs(node.val - prev));
        }
        prev = node.val; 

        inOrder(node.right);

        return;
    }
}
