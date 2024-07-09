//https://leetcode.com/problems/min-stack/

import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {
        
    }

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }

    //In pop .equals is used because in Stack Integer objects are
    //stored not primitive int that is why .equals will compare
    //their exact values but '==' will check if they point to the
    //same object or not(reference) which we dont want here
    
    public void pop() {
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
