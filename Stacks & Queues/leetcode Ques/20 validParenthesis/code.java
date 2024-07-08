//https://leetcode.com/problems/valid-parentheses/

import java.util.*;

public class code {
    public static void main(String[] args) {
        
    }

    //Stack is used since we deal with the stored order of elements
    static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }else if(s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if(s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else if(s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }else{
                return false;
            }
            i++;
        }
        return stack.isEmpty();
    }
}
