//https://leetcode.com/problems/step-by-step-directions-from-a-binary-tree-node-to-another/?envType=daily-question&envId=2024-07-16

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

    static String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder pathToS = new StringBuilder();
        StringBuilder pathToT = new StringBuilder();

        findNode(root , startValue , pathToS);
        findNode(root , destValue , pathToT);

        //Trim the common parts
        int i = 0;
        while(i < pathToS.length() && i < pathToT.length() && pathToS.charAt(i) == pathToT.charAt(i)){
            i++;
        }

        StringBuilder result = new StringBuilder();
        for(int j = i ; j<pathToS.length() ; j++){
            result.append('U');
        }

        result.append(pathToT.substring(i));

        return result.toString();
    }

    private static boolean findNode(TreeNode root, int value, StringBuilder path) {
        
        if(root == null){
            return false;
        }

        if(root.val == value){
            return true;
        }

        path.append('L');
        if(findNode(root.left, value, path)){
            return true;
        }

        path.setCharAt(path.length()-1, 'R');
        if(findNode(root.right, value, path)){
            return true;
        }

        path.deleteCharAt(path.length()-1);
        return false;

    }
}
