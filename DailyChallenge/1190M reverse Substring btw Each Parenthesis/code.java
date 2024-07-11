//https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/?envType=daily-question&envId=2024-07-11

import java.util.Stack;

public class code {
    public static void main(String[] args) {
        
    }

    static String reverseParenthesesStack(String s) {
        
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c == '('){
                st.push(sb.length());
            }else if(c == ')'){
                int start = st.pop();
                reverse(sb,start,sb.length()-1);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();

    }

    static void reverse(StringBuilder s , int start , int end){
        while(start<end){
            char temp = s.charAt(start);
            s.setCharAt(start++ , s.charAt(end));
            s.setCharAt(end-- , temp);
        }
    }

    int i = 0;
    public String reverseParentheses(String s) {
        char[] c = s.toCharArray();
        return helper(c);
    }

    public String helper(char[] c){
        StringBuilder sb = new StringBuilder();

        while(i<c.length){
            if(c[i] == '('){
                i++;
                String st = helper(c);
                sb.append(st);
            }else if(c[i] == ')'){
                i++;
                return sb.reverse().toString();
            }else{
                sb.append(c[i]);
                i++;
            }
        }

        return sb.toString();
    }
}
