//https://leetcode.com/problems/132-pattern/

import java.util.Stack;

public class code {
    public static void main(String[] args) {
        
    }

    static boolean find132pattern(int[] nums) {
        if(nums.length < 3) return false;

        Stack<Integer> s = new Stack<>();
        int third = Integer.MIN_VALUE;

        for(int i = nums.length-1 ; i>=0 ; i--){
            if(nums[i] < third) return true; //Since third is less than second
            while(!s.isEmpty() && s.peek() < nums[i]){
                third = s.pop();
            }
            s.push(nums[i]);
        }
        return false;
    }
}
