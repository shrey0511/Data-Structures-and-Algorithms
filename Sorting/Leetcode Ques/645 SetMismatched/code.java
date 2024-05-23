

public class code {
    public static void main(String[] args) {
        int[] arr = {2,1,4,2,6,5};
        findErrorNums(arr);
    }   
    static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return new int[]{nums[index],index+1};
            }   
        }
        return new int[]{-1,-1};
    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    } 
}
