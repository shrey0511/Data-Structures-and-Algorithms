//https://leetcode.com/problems/letter-combinations-of-a-phone-number/

//Google , Amazon question

import java.util.ArrayList;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }

    static List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return new ArrayList<>(){};
        ArrayList<String> ans = new ArrayList<>();

        ans.addAll(helper("" , digits));
        return ans;
    }
    static List<String> helper(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> let = new ArrayList<>();

        int digit = up.charAt(0) - '0';
        int i = (digit-2)*3;

        if(digit > 7){ //Because 7 has 4 letters
            i += 1;
        }

        int len = i+3;
        if(digit == 7 || digit == 9){
            len += 1;
        }
        
        for( ; i<len ; i++){
            char ch = (char) ('a' + i);
            let.addAll(helper(p+ch,up.substring(1)));
        }
        return let;
    }
}
