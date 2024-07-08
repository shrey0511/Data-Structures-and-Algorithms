//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/

//Facebook question

import java.util.Stack;

public class code {
    public static void main(String[] args) {
        
    }

    static int minAddToMakeValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }else if(ch == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }
        }
        return stack.size();
    }
}
