//https://leetcode.com/problems/the-number-of-beautiful-subsets/?envType=daily-question&envId=2024-05-23

import java.util.HashMap;
import java.util.Map;

class code{
    public static void main(String[] args) {
        
    }

    private int count = 0;
    private Map<Integer,Integer> visited;

    public code(){
        this.count = 0;
        this.visited = new HashMap<>();
    } 

    public int beautifulSubsets(int[] nums, int k) {
        explore(nums,k,0);
        return count - 1;//To remove the empty subset
    }

    private void explore(int[] nums,int k,int index){
        if(index == nums.length){
            count++;
            return;
        }
        int num = nums[index];

        if(!visited.containsKey(num-k) && !visited.containsKey(num+k)){
            visited.put(num , visited.getOrDefault(num,0)+1);
            explore(nums,k,index+1);
            visited.put(num , visited.get(num)-1);
            if(visited.get(num) == 0)
                visited.remove(num);
        }
        explore(nums,k,index+1);
    }
}