//https://leetcode.com/problems/find-k-th-smallest-pair-distance/?envType=daily-question&envId=2024-08-14

import java.util.Arrays;

public class code {
    public static void main(String[] args) {
        
    }

    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int minDist = 0;
        int maxDist = nums[nums.length-1] - nums[0];

        while(minDist < maxDist){
            int mid = minDist + (maxDist - minDist) / 2;
            int count = countPairsWithinK(nums , mid);

            if(count < k){
                minDist = mid+1;
            }else{
                maxDist = mid;
            }
        }
        return minDist;
    }
    public int countPairsWithinK(int[] nums , int target){
        int left = 0 , count = 0;
        for(int right = 0 ; right<nums.length ; right++){
            while(nums[right] - nums[left] > target){
                left++;
            }
            count += right - left;
        }
        return count;
    }
}
