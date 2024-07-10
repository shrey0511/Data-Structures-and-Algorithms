//https://leetcode.com/problems/crawler-log-folder/?envType=daily-question&envId=2024-07-10

import java.util.Stack;

public class code {
    public static void main(String[] args) {
        
    }

    //We are concerned with the order of folders and how we add or remove them
    //Gives the intuition of stacks

    static int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();

        for(String s : logs){
            if(s.charAt(0) == '.'){
                if(s.charAt(1) == '.' && !stack.isEmpty()){
                    stack.pop();
                }else{
                    continue;
                }
            }else{
                stack.push(s);
            }
        }

        return stack.size();
    }
}
