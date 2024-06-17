//https://leetcode.com/problems/patching-array/?envType=daily-question&envId=2024-06-16

public class code {
    public static void main(String[] args) {
        
    }   
    
    static int minPatches(int[] nums,int n){
        int miss = 1;
        int moves = 0;
        int index = 0;

        while(miss <= n){
            if(index < nums.length && nums[index]<=miss){//Add the number if we have patched upto that number
                miss += nums[index];
                index++;
            }else{
                miss += miss;
                moves++;
            }
        }
        return moves;
    }
}
