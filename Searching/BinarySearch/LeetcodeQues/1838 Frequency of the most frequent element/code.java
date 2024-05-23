import java.util.Arrays;

public class code {
    public static void main(String[] args) {
        
    }
    static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int r=0,l=0,res=0;
        long total=0;

        while(r<nums.length){
            total+=nums[r];
            while((long)nums[r]*(r-l+1)>total+k){
                total-=nums[l];
                l++;
            }
            res=Math.max(res,(r-l+1));
            r++;
        }

        return res;
    }
}
