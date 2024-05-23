//https://leetcode.com/problems/sort-array-by-increasing-frequency/description/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }
    static int[] frequencySort(int[] nums) {
          HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
          for(int i =0; i<nums.length; i++){
              if(map.containsKey(nums[i])){
                  map.put(nums[i],map.get(nums[i])+1);
                  }
                  else{
                      map.put(nums[i],1);
                  }
          }
          List<Integer> list = new ArrayList <Integer>(map.keySet());
          Collections.sort(list,(a,b)->{
              if (map.get(a) == map.get(b))
              return b - a;
              else
              return map.get(a) - map.get(b);
          });
          int result [] = new int [nums.length];
          int index = 0 ;
          for (int num : list){
              for (int i = 0 ; i <map.get(num); i++){
              result [index++] = num;
              }
          }
          return result;
    }
}
