//https://leetcode.com/problems/frequency-of-the-most-frequent-element/

import java.util.Arrays;

public class freqOfMostFrequentElement {
    public static void main(String[] args) {
        
    }

    static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int l = 0 , r = 0 , res = 0;
        long total = 0;
        while(r<nums.length){
            total += nums[r];
            while((long)nums[r] * (r-l+1) > total + k){
                total -= nums[l];
                l++;
            }
            res = Math.max(res , r-l+1);
            r++;
        }
        return res;
    }
}
