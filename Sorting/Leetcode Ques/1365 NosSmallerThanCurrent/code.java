//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

public class code {
    public static void main(String[] args) {
        
    }
    //Count Sort is used
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] bucket = new int[101]; //look at the constraints
        for(int i=0;i<nums.length;i++){
            bucket[nums[i]]+=1;
        }
        for(int j=1;j<bucket.length;j++){
            bucket[j]+=bucket[j-1];
        }
        for(int k=0;k<nums.length;k++){
            int pos=nums[k];
            nums[k] = pos==0? 0 : bucket[pos-1];
        }
        return nums;
    }
}
