//https://www.geeksforgeeks.org/problems/fruit-into-baskets-1663137462/1

import java.util.HashMap;

public class FruitsIntoBaskets_gfg {
    public static void main(String[] args) {
        
    }

    public static int totalFruits(Integer[] arr) {
        // code here
        int left = 0 , max = 0 , right = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for( ; right<arr.length ; right++){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            
            while(map.size()>2){//Since only 2 baskets are available
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left]) == 0){
                    map.remove(arr[left]);
                }
                left++;
            }
            
            max = Math.max(max , right-left+1);
        }
        return max;
    }
}
