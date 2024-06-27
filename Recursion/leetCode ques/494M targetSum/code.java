//https://leetcode.com/problems/target-sum/

//Code can be improved with DP , try it after learning about it

public class code {
    public static void main(String[] args) {
        
    }

    static int findTargetSumWays(int[] nums, int target) {
        int ans = 0;
        ans = helper(nums,target,0,0);
        return ans;
    }

    static int helper(int[] nums,int target,int sum,int i){
        
        if(i == nums.length){
            if(sum == target){
                return 1;
            }else{
                return 0;
            }
        }

        int count = 0;

        count += helper(nums,target,sum+nums[i],i+1);

        count += helper(nums,target,sum-nums[i],i+1);

        return count;
    }



    // Complexity :
        // Time complexity:O(2^n)
        // Space complexity:O(n)
}
