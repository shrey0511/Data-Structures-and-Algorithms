//https://leetcode.com/problems/combination-sum-iii/

import java.util.*;

public class code {
    public static void main(String[] args) {
        
    }

    static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res , new ArrayList<>() , k , n , 1);
        return res;
    }

    private static void helper(List<List<Integer>> res , List<Integer> list , int k , int remain , int index){

        if(remain == 0 && list.size()==k){
            res.add(new ArrayList<>(list));
            return;
        }else if(remain < 0 || list.size() > k){
            return;
        }else{
            for(int i = index ; i<10 ; i++){
                list.add(i);
                helper(res,list,k,remain - i,i+1);
                list.remove(list.size()-1);
            }
        }
    }
}
