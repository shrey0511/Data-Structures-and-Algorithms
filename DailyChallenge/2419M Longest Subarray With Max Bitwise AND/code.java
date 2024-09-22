package 2419M Longest Subarray With Max Bitwise AND;

public class code {
    public int longestSubarray(int[] nums) {
        if(nums.length == 1)
            return 1;
        int max = 0 , length = 0 , count = 0;

        for(int num : nums){
            max = Math.max(max , num);
        }

        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i] == max){
                count++;
                length = Math.max(count , length);
            }else{
                count = 0;
            }
        }
        return length;
    }
}
