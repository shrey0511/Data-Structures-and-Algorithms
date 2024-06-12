//https://leetcode.com/problems/sort-colors/description/?envType=daily-question&envId=2024-06-12

public class code {
    public static void main(String[] args) {
        
    }

    static void sortColors(int[] nums){
        int left = 0 , right = nums.length-1;
        for(int i = 0 ; i<nums.length ;){
            if(nums[i] == 0){
                swap(nums, left++, i++);
            }else if(nums[i] == 1)
                ++i;
            else{
                swap(nums, i, right--);
            }
        }
        return;
    }
    static void swap(int[] arr , int left , int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
