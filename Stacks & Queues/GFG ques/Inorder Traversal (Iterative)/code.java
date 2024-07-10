//https://www.geeksforgeeks.org/problems/inorder-traversal-iterative/1

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

    static ArrayList<Integer> inOrder(Node root)
    {
        // Code
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> s = new Stack<>();
        Node current = root;
        
        while(current != null || !s.isEmpty()){
            while(current != null){
                s.push(current);
                current = current.left;
            }
            //Now current is null
            current = s.pop();
            ans.add(current.data);
            
            //Now go for right side
            current = current.right;
        }
        return ans;
    }
}
