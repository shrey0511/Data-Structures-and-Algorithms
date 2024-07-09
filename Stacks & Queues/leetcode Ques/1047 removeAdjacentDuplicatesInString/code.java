//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

import java.util.Stack;

public class code {
    public static void main(String[] args) {
        
    }

    static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for( char c : s.toCharArray()){
            if(!stack.isEmpty() && c == stack.peek()){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}
