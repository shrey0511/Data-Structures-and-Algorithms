//https://leetcode.com/problems/number-of-good-leaf-nodes-pairs/?envType=daily-question&envId=2024-07-18

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

    static int ans = 0;
    static int countPairs(TreeNode root , int distance){
        ans = 0;
        helper(root , distance);
        return ans;
    }
    private static int[] helper(TreeNode node, int distance) {
        if(node == null){
            return new int[distance+1];
        }

        //For leaf nodes
        if(node.left == null && node.right == null){
            int[] leafDistances = new int[distance+1];
            leafDistances[1] = 1;//leaf node distance from itself is 1
            return leafDistances;
        }

        int[] leftDistances = helper(node.left, distance);
        int[] rightDistances = helper(node.right, distance);

        for(int l = 1 ; l <= distance ; l++){
            for(int r = 1 ; r <= distance-l ; r++){
                ans += leftDistances[l] * rightDistances[r];
            }
        }

        int[] currDistances = new int[distance+1];
        for(int i = 1 ; i<distance ; i++){
            currDistances[i+1] = leftDistances[i] + rightDistances[i];
        }

        return currDistances;
    }
    
}
