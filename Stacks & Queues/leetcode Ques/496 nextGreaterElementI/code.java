//https://leetcode.com/problems/next-greater-element-i/

import java.util.HashMap;
import java.util.Stack;

public class code {
    public static void main(String[] args) {
        
    }

    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        int[] ans = new int[nums1.length];

        for(int num : nums2){
            while(!stack.isEmpty() && num > stack.peek()){
                map.put(stack.pop() , num);
            }
            stack.push(num);
        }

        int j = 0;
        for(int num : nums1){
            ans[j++] = map.getOrDefault(num , -1);
        }

        return ans;
    }

    //Brute force
    public int[] nextGreaterElementBrute(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++) {
            int greaterIdx = -1, j = nums2.length - 1;
            while(j >= 0 && nums2[j] != nums1[i]) {
                if(nums2[j] > nums1[i]){
                    greaterIdx = nums2[j];
                }
                j--;
            }
            ans[i] = greaterIdx;
        }

        return ans;
    }
}
