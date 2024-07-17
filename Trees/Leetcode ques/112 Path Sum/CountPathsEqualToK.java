import java.util.*;

public class CountPathsEqualToK {
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

    public int countPaths(TreeNode node , int k){
        List<Integer> path = new ArrayList<>();
        return helper(node , k , path);
    }

    private int helper(TreeNode node, int k, List<Integer> path) {
        if(node == null)
            return 0;

        path.add(node.val);

        int count = 0 , s = 0;

        //How many paths can I make
        ListIterator<Integer> ltr = path.listIterator(path.size());
        while(ltr.hasPrevious()){
            s += ltr.previous();

            if(s == k)
                count++;
        }

        count += helper(node.left, k, path) + helper(node.right, k, path);

        //backtrack
        path.remove(path.size()-1);

        return count;
    }
    //Time complexity : O(N^2)(Worst) and O(N)
    //Space : O(logN)(best) or O(N)

    //Put in a list from root to leaf node
    public List<List<Integer>> findPaths(TreeNode node , int k){
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        helper2(node ,k, path , paths);
        return paths;
    }

    private void helper2(TreeNode node,int sum, List<Integer> path, List<List<Integer>> paths) {
        if(node == null)
            return;

        path.add(node.val);

        if(node.val == sum && node.left == null && node.right == null){
            paths.add(new ArrayList<>(path));
        }else{
            helper2(node.left, sum-node.val, path, paths);
            helper2(node.right, sum-node.val, path, paths);
        }

        //backtrack
        path.remove(path.size()-1);

        return;
    }
    //Time and Space : O(logN)

}
