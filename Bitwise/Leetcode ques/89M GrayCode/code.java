//https://leetcode.com/problems/gray-code/description/

import java.util.ArrayList;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }
    static List<Integer> grayCode(int n){
        List<Integer> ans = new ArrayList<>();
        for(int i=0 ; i<(1<<n) ; i++){
            ans.add(i^(i>>1));
        }
        return ans;
    }
}
