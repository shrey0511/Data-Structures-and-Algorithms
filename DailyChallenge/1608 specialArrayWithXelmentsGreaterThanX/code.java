//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description/?envType=daily-question&envId=2024-05-27

public class code {
    public static void main(String[] args) {
        
    }
    static int specialArray(int[] nums) {
        for (int i = 0; i <= 100; i++) {
            if (works(nums, i)) return i; 
        }
        return -1;
    }
    static boolean works(int[] arr, int val) {
        int amt = 0;
        for (int elem : arr) if (elem >= val) amt++;
        return amt == val;
    }
}
