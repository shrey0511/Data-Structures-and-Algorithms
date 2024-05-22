//https://leetcode.com/problems/distribute-coins-in-binary-tree/?envType=daily-question&envId=2024-05-18

public class code {
    public static void main(String[] args) {
        
    }
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
        
    private int moves = 0;
       
    static int countMoves(TreeNode root){
        if(root == null) return 0;
        int leftExcess = countMoves(root.left);
        int rightExcess = countMoves(root.right);
       
        moves += Math.abs(leftExcess) + Math.abs(rightExcess);
        return (root.val-1)+leftExcess+rightExcess;
    }
       
    static int distributeCoins(TreeNode root) {
        countMoves(root);
        return moves;
    }
}
