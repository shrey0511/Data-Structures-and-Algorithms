//https://leetcode.com/problems/sum-of-all-subset-xor-totals/description/

public class code {
    public static void main(String[] args) {
        
    }
    static int subsetXORSum(int[] nums) {
        int n = nums.length;
        int total = 0;
        for(int i=1;i<(1<<n);i++){
            int currTotal = 0;
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0) currTotal ^= nums[j];
            }
            total+=currTotal;
        }
        return total;
    }
    //Do using backtracking and learn backtracking
}
