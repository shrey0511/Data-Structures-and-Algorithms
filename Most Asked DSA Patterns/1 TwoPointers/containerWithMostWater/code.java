//https://leetcode.com/problems/container-with-most-water/

public class code {
    public static void main(String[] args) {
        
    }

    static int maxArea(int[] height) {
        int max = Integer.MIN_VALUE , currArea = 0;
        int left = 0 , right = height.length - 1;
        while(left<right){
            currArea = Math.min(height[left],height[right]) * (right-left);
            max = Math.max(max,currArea);
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return max;
    }
}
