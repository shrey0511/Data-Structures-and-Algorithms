//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

public class code {
    public static void main(String[] args) {
        
    }

    class TreeNode{
        int val;
        TreeNode left , right;
        int height;

        TreeNode(int val){
            this.val = val;
            this.left = this.right = null;
            this.height = 1;
        }
    }

    TreeNode root;
    public TreeNode sortedArrayToBST(int[] nums) {
        root = null;
        populateSorted(nums,0,nums.length);
        return root;//Returns the root of the created binary tree
    }
    private void populateSorted(int[] nums, int start, int end) {
        if(start >= end)
            return;

        int mid = (start + end) / 2 ;

        //Now insert this element using insert function
        this.insert(nums[mid]);

        populateSorted(nums, start, mid);
        populateSorted(nums, mid+1, end);
    }
    private void insert(int value) {
        root = insert(root , value);
    }
    private TreeNode insert(TreeNode node, int value) {
        if(node == null){
            node = new TreeNode(value);
            return node;
        }

        if(value < node.val){
            node.left = insert(node.left, value);
        }else if(value > node.val){
            node.right = insert(node.right, value);
        }

        node.height = Math.max(height(node.left),height(node.right)) + 1;

        return node;
    }
    private int height(TreeNode node) {
        if(node == null)
            return 0;

        return node.height;
    }
}
