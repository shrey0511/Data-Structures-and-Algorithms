//https://leetcode.com/problems/squares-of-a-sorted-array/description/

public class code {
    public static void main(String[] args) {
        
    }
    static int[] sortedSquares(int[] nums) {
        int left=0, right=nums.length-1 , index=nums.length-1;
        int[] result = new int[nums.length];
        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                result[index] = nums[left]*nums[left];
                left++;
            }else{
                result[index] = nums[right]*nums[right];
                right--;
            }
            index--;
        }
        return result;
    }  
}
