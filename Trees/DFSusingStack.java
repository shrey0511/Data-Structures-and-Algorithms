
import java.util.*;

public class DFSusingStack {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(dfs(root));
    }

    //* Definition for a binary tree node.
    public static class TreeNode {
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

    //Using stack
    static List<Integer> dfs(TreeNode root){

        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        Stack<TreeNode> st = new Stack<>();

        st.push(root);

        while(!st.isEmpty()){
            TreeNode popped = st.pop();

            if(popped.right != null){
                st.push(popped.right);
            }
            if(popped.left != null){
                st.push(popped.left);
            }

            ans.add(popped.val);
        }

        return ans;
    }
}
