//https://leetcode.com/problems/maximum-product-of-three-numbers/description/

public class code {
    public static void main(String[] args) {
        
    }
    static int maximumProduct(int[] nums) {
        //We require product of last 3 if no negative nos
        //Otherwise product of last and first 2 negative makes it a positive
        int n=nums.length;
        if(n==3)  return nums[0]*nums[1]*nums[2];
        else{
            int max1=Integer.MIN_VALUE;
            int max2=Integer.MIN_VALUE;
            int max3=Integer.MIN_VALUE;
            int min1=Integer.MAX_VALUE;
            int min2=Integer.MAX_VALUE;
            for(int i:nums){
                if(i>max3){
                    if(i>max2){
                        if(i>max1){
                            max3=max2;
                            max2=max1;
                            max1=i;
                        }
                        else{
                            max3=max2;
                            max2=i;
                        }
                    }
                    else{
                        max3=i;
                    }
                }
                if(i<min2){
                    if(i<min1){
                        min2=min1;
                        min1=i;
                    }
                    else{
                        min2=i;
                    }
                }
            }
            return Math.max(max1*max2*max3,min1*min2*max1);
    }}
}
