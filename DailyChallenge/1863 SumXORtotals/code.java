//https://leetcode.com/problems/sum-of-all-subset-xor-totals/?envType=daily-question&envId=2024-05-20

public class code {
    public static void main(String[] args) {
        
    }
    static int subsetXORSum(int[] nums) {
        return helper(nums,0,0);
    }
    static int helper(int[] nums,int index,int currValue){
        if(index == nums.length)
            return currValue;
        return helper(nums,index+1,currValue^nums[index]) + helper(nums,index+1,currValue);
    }
}
