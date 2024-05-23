//https://leetcode.com/problems/rank-transform-of-an-array/description/

import java.util.Arrays;
import java.util.HashMap;

public class code {
    public static void main(String[] args) {
        
    }
    static int[] arrayRankTransform(int[] arr) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int[] copy = Arrays.copyOf(arr,arr.length);
        Arrays.sort(copy);
        int rank=1;
        for(int index = 0 ; index<copy.length ; index++){
            if(!map.containsKey(copy[index])){
                map.put(copy[index],rank++);
            }
        }    
        int[] result = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            result[i] = map.get(arr[i]);
        }
        return result;
    } 
}
