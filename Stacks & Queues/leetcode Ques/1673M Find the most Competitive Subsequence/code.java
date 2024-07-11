//https://leetcode.com/problems/find-the-most-competitive-subsequence/

import java.util.Stack;

public class code {
    public static void main(String[] args) {
        
    }

    static int[] mostCompetitive(int[] nums, int k) {
        
        Stack<Integer> s = new Stack<>();
        int canBeRemoved = nums.length - k;

        for(int i = 0 ; i<nums.length ; i++){
            while(!s.isEmpty() && canBeRemoved > 0 && s.peek() > nums[i]){
                s.pop();
                canBeRemoved--;
            }
            s.push(nums[i]);
        }

        while(s.size() > k){
            s.pop();
        }

        int[] ans = new int[s.size()];
        for(int i = s.size()-1 ; i>= 0 ; i--){
            ans[i] = s.pop();
        }

        return ans;

    }
}
