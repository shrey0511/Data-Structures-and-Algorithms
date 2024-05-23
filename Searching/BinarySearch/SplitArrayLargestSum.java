//Have a look again and try to optimize

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        
    }
    public int splitArray(int[] nums, int k) {
        int start = 0,end = 0;
        for(int i=0;i<nums.length;i++){
            start = Math.max(start, nums[i]); //returns the max of the array
            end += nums[i]; // returns the sum of all elements of the array             
        }
        while(start<end){
            int mid = start + (end-start)/2;
            int pieces = 1,sum=0;
            for(int num : nums){
                if(sum + num > mid){
                    sum=num;
                    pieces++;
                }else{
                    sum+=num;
                }
            }
            if(pieces>k)
                start = mid + 1;
            else
                end = mid;           
        }
        return end; //this is when start==end
    }
}
