//https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/

public class code {
    public static void main(String[] args) {
        
    }

    public boolean isValidSerialization(String preorder) {
        //We can check how many outNodes and inNodes arrive
        //If difference btw them is 0 then true
        int diff = 1;
        String[] nodes = preorder.split(",");
        for(String node : nodes){
            //diff cant be less than 0 , for a valid tree
            if(--diff < 0) return false;
            if(!node.equals("#")) diff += 2;
        } 
        return diff == 0;
    }
}
