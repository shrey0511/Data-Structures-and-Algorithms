// /https://leetcode.com/problems/single-number/description/

public class code {
    public static void main(String[] args) {
        
    }
    static int singleNumber(int[] nums) {
        int ans =0;
        for(int i=0;i<nums.length;i++){
            ans ^= nums[i];
        }
        return ans;
    }
}
