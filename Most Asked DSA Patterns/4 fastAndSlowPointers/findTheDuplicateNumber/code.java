//https://leetcode.com/problems/find-the-duplicate-number/description/

public class code {
    public static void main(String[] args) {
        
    }

    static int findDuplicate(int[] nums) {
        int slow = nums[0] , fast = nums[0];
        //slow moves one by one and fast moves 2 steps at a time
        //As there is a duplicate there will always be a cycle
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);

        fast = nums[0];
        //When they meet for the second time, it is at the starting point of the cycle
        //The duplicate number
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
