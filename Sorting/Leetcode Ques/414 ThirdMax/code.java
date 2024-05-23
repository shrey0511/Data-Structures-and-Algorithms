//https://leetcode.com/problems/third-maximum-number/description/
//Long is used to accomodate the range

public class code {
    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        int thirdMaxNo = thirdMax(nums);
        System.out.println(thirdMaxNo);
    }
    static int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE; 
        long max3 = Long.MIN_VALUE;
        for(int num: nums){    
            if(num> max1){
                max3 =max2;
                max2 = max1;
                max1 = num; 
            } else if (max1 > num && num > max2){
                max3 = max2;
                max2 = num;
            }else if (max2 > num && num > max3){
                max3 = num;
            }
        }
        return max3 == Long.MIN_VALUE ? (int) max1 : (int) max3;  
    }
}
