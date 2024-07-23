//https://leetcode.com/problems/sort-array-by-increasing-frequency/?envType=daily-question&envId=2024-07-23

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }

    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i<nums.length ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list , (a,b) -> {
            if(map.get(a) == map.get(b)){
                return b-a;
            }else{
                return map.get(a) - map.get(b);
            }
        });

        int[] result = new int[nums.length];
        int i = 0;
        for(int num : list){
            for(int j = 0 ; j<map.get(num) ; j++){
                result[i++] = num;
            } 
        }
        return result;
    }
}
