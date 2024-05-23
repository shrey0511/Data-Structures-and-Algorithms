

public class code {
    public static void main(String[] args) {
        
    }

    public int[] twoSum(int[] numbers, int target) {
        int start=0,end=numbers.length-1,currSum=0;
        while(start<end){
            currSum = numbers[start]+numbers[end];
            if(currSum==target){
                return new int[]{start+1,end+1};
            }else if(currSum>target){
                end=end-1;;
            }else{
                start=start+1;
            }
        }
        return new int[]{-1,-1};
    }
}
