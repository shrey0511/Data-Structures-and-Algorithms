//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

import java.util.ArrayList;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }
    static List<Integer> findDisappearedNumbers(int[] arr){
        for(int i: arr ){
            int index = Math.abs(i);
            if(arr[index-1]>0)
                arr[index-1] *= -1;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] > 0){
                ans.add(i+1);
            }
        }
        return ans;
    }
}
