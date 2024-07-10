//https://www.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1

import java.util.Stack;

public class code {
    public static void main(String[] args) {
        
    }

    //Function to delete middle element of a stack.
    //Amazon question
    
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        int mid = (sizeOfStack+1) / 2;
        
        helper(s , mid , sizeOfStack);
        
    } 
    
    public void helper(Stack<Integer> s , int mid , int size){
        if(size == mid){
            s.pop();
            return;
        }
        
        int popped = s.pop();
        helper(s,mid,s.size());
        s.push(popped);
        
    }
}
