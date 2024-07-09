//https://leetcode.com/problems/remove-outermost-parentheses/

import java.util.Stack;

public class code {
    public static void main(String[] args) {
        
    }

    //Using stack
    static String removeOuterParentheses2(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder("");

        for(char c : s.toCharArray()){
            if(c == '('){
                if(stack.size()>0){
                    ans.append(c);
                }
                stack.push(c);
            }else{
                stack.pop();
                if(stack.size()>0){
                    ans.append(c);
                }
            }
        }
        return ans.toString();
    }

    static String removeOuterParentheses(String s){
        StringBuilder ans = new StringBuilder();

        int open = 0;
        for(char c : s.toCharArray()){
            if(c == '(' && open++ > 0 ) ans.append(c);
            if(c == ')' && open-- > 1) ans.append(c);
        }

        return ans.toString();
    }

    
}
