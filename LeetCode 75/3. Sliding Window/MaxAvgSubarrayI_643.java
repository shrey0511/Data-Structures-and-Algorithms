//https://leetcode.com/problems/maximum-average-subarray-i/?envType=study-plan-v2&envId=leetcode-75

public class MaxAvgSubarrayI_643 {
    public static void main(String[] args) {
        
    }

    public double findMaxAverage(int[] nums, int k) {
        double maxVal = Double.NEGATIVE_INFINITY;
        double val = 0;
        int ptr1 = 0 , ptr2 = 0;

        while(ptr2 < nums.length){
            val += nums[ptr2];

            if(ptr2-ptr1+1 == k){
                maxVal = Math.max(val , maxVal);
                val -= nums[ptr1++];
            }
            ptr2++;
        }
        return maxVal/k;
    }
}
