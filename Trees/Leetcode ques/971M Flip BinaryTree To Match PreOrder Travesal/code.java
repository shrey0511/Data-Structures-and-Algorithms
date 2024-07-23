//https://leetcode.com/problems/flip-binary-tree-to-match-preorder-traversal/

public class code {
    public static void main(String[] args) {
        
    }

    int vix = 0;
    List<Integer> ans = new ArrayList<>();
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        dfs(root , voyage);
        return ans;

    }
    private void dfs(TreeNode node , int[] V){
        if(node == null || (ans.size()!= 0 && ans.get(0) == -1))
            return;

        if(V[vix++] != node.val){
            ans = new ArrayList<Integer>(Arrays.asList(-1));
        }else if(node.left != null && node.left.val != V[vix]){
            ans.add(node.val);
            dfs(node.right , V);
            dfs(node.left , V);
        }else{
            dfs(node.left,V);
            dfs(node.right,V);
        }
        return;
    }
}
