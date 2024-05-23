//https://leetcode.com/problems/valid-parentheses/description/

import java.util.Stack;

public class parenthesis {
    public static void main(String[] args) {
        
    }
    static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
            for(char c:s.toCharArray()){
                if(c=='('||c=='['||c=='{'){
                    stack.push(c);
                }
                else if(c==')' && !stack.isEmpty() && stack.peek()=='(' ){
                    stack.pop();
                }
                else if(c==']' && !stack.isEmpty() && stack.peek()=='['){
                    stack.pop();
                }
                else if(c=='}' && !stack.isEmpty() && stack.peek()=='{'){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            return stack.isEmpty();  
    }
}
