//https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/

public class code {
    public static void main(String[] args) {
        
    }

    static int MOD = (int)(1e9 + 7);

    private int nodesSum;
    private long maxProd;

    public int maxProduct(TreeNode root) {
        if(root == null)
            return 0;

        nodesSum = findAllNodesSum(root);

        maxProd = 0l;

        findMaxProd(root);

        return (int) (maxProd % MOD);
    }

    private int findMaxProd(TreeNode root) {
        if(root == null) return 0;

        int subTree1 = findMaxProd(root.left) + findMaxProd(root.right) + root.val;

        int subTree2 = nodesSum - subTree1;

        maxProd = Math.max(maxProd , (long)subTree1 * subTree2);

        return subTree1;
    }

    private int findAllNodesSum(TreeNode root) {
        if(root == null) return 0;

        return findAllNodesSum(root.left) + findAllNodesSum(root.right) + root.val;
    }
}
