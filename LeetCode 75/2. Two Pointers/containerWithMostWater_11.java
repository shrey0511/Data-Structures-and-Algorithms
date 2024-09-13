//https://leetcode.com/problems/container-with-most-water/?envType=study-plan-v2&envId=leetcode-75

public class containerWithMostWater_11 {
    public static void main(String[] args) {
        
    }

    public int maxArea(int[] height) {
        int left = 0 , right = height.length-1 , 
        max = Integer.MIN_VALUE;
        while(left < right){
            int minHeight = Math.min(height[right] , height[left]);
            max = Math.max(max , (minHeight * (right-left)));
            if(height[left] > height[right])
                right--;
            else
                left++;
        }
        return max;
    }
}
