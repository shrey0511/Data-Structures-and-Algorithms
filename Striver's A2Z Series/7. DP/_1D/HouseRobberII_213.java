//https://leetcode.com/problems/house-robber-ii/

public class HouseRobberII_213 {
    public static void main(String[] args) {
        
    }

    public int helper(int[] nums) {

        int prev = nums[0];
        int prev2 = Integer.MIN_VALUE;
        int ans = 0;

        for(int i = 1 ; i<nums.length ; i++){
            int take = nums[i];
            if(i>1) take += prev2;
            int notTake = prev;

            ans = Math.max(take , notTake);

            prev2 = prev; 
            prev = ans;
        }
        return prev;
    }
    public int rob(int[] nums){
        if(nums.length == 1) return nums[0];

        int[] temp1 = new int[nums.length-1], temp2 = new int[nums.length-1];
        int ind1 = 0 , ind2 = 0;

        //Avoid having First and last number in one calculation
        for(int i = 0 ; i<nums.length ; i++){
            //Removing first number
            if(i != 0) temp1[ind1++] = nums[i];
            //Removing last number
            if(i != nums.length-1) temp2[ind2++] = nums[i];
        }

        return Math.max(helper(temp1) , helper(temp2));
    }
}
