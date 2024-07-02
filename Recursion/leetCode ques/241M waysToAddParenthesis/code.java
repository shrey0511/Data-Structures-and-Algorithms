//https://leetcode.com/problems/different-ways-to-add-parentheses/

import java.util.ArrayList;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }

    //This code can be improved using memoization and DP
    
    static List<Integer> diffWaysToCompute(String expression) {
        List<Integer> ans = new ArrayList<>();

        for(int i = 0 ; i<expression.length() ; i++){
            char c = expression.charAt(i);

            if(c == '-' || c == '+' || c == '*'){
                String a = expression.substring(0,i);
                String b = expression.substring(i+1);
                List<Integer> list1 = diffWaysToCompute(a);
                List<Integer> list2 = diffWaysToCompute(b);

                for(int x : list1){
                    for(int y : list2){
                        if(c == '-'){
                            ans.add(x-y);
                        }
                        if(c == '+'){
                            ans.add(x+y);
                        }
                        if(c == '*'){
                            ans.add(x*y);
                        }
                    }
                }
            }
        }
        if(ans.size() == 0) ans.add(Integer.valueOf(expression));
        return ans;
    }
}
