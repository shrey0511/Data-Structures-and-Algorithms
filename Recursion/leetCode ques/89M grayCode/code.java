//https://leetcode.com/problems/gray-code/

import java.util.*;

public class code {
    public static void main(String[] args) {
        
    }

    static List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        helper(ans , 0 , n);
        return ans;
    }

    private static void helper(List<Integer> list , int i , int n){
        if(i == (1<<n)){
            return;
        }
        list.add(i ^ (i>>1));
        helper(list,++i,n);
    }

    // Bitwise
    // public List<Integer> grayCode(int n) {
    //     List<Integer> ans = new ArrayList<>();
    //     for(int i=0;  i<(1<<n) ; i++){
    //         ans.add(i^(i>>1));
    //     }
    //     return ans;
    // }
}
