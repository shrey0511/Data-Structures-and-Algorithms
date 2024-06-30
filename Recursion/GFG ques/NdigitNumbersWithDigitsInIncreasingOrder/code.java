//https://www.geeksforgeeks.org/problems/n-digit-numbers-with-digits-in-increasing-order5903/1

import java.util.ArrayList;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }

    static List<Integer> increasingNumbers(int n){
        List<Integer> ans = new ArrayList<>();

        if(n == 1){
            for(int i = 0 ; i<10 ; i++){
                ans.add(i);
            }
            return ans;
        }

        helper(ans,n,new StringBuilder());
        return ans;
    }

    private static void helper(List<Integer> ans, int n, StringBuilder sb) {
        //Base case
        if(n == 0){
            ans.add(Integer.parseInt(sb.toString()));
            return;
        }

        for(int i = 1 ; i<10 ; i++){
            if(sb.length() == 0 || i > sb.charAt(sb.length()-1)-'0'){
                sb.append(i);
                helper(ans, --n, sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}
