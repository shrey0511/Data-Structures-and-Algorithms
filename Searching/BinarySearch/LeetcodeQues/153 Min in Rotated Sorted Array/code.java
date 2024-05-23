
public class code {
    public static void main(String[] args) {
        
    }   
    
    static int findMin(int[] nums) {
        int start = 0 , end = nums.length-1, ans = 1500;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[start]<=nums[mid]){
                ans= Math.min(ans,nums[start]);
                start=mid+1;
            }else{
                ans= Math.min(ans,nums[mid]);
                end=mid-1;
            }
        }
        return ans;
    }
}
