//https://leetcode.com/problems/self-dividing-numbers/description/

import java.util.ArrayList;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }
    static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSelfDiv(i))
                ans.add(i);
        }
        return ans;
    }
    static boolean isSelfDiv(int x){
        int temp = x;
        while(x>0){
            int digit = x%10;
            if(digit == 0 || temp%digit!=0)
                return false;
            x /= 10;
        }
        return true;
    }
}
