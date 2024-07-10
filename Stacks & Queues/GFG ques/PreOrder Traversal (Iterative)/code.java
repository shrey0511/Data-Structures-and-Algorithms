//https://www.geeksforgeeks.org/problems/preorder-traversal-iterative/1

import java.util.ArrayList;
import java.util.Stack;

public class code {
    public static void main(String[] args) {
        
    }

    //A Binary Tree node 
    class Node {
        int data;
        Node left, right;
        Node(int item){
            data = item;
            left = right = null;
        }
    }

    // Return a list containing the Preorder traversal of the given tree
    static ArrayList<Integer> preOrder(Node root)
    {
        // Code
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> s = new Stack<>();
        
        Node current = root;
        
        while(current != null || !s.isEmpty()){
            while(current!=null){
                ans.add(current.data);
                s.push(current);
                current = current.left;
            }
            //current = null;
            current = s.pop();
            current = current.right;
            
        }
        return ans;
        
    }
}
