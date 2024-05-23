//https://leetcode.com/problems/minimum-absolute-difference/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }
    static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>>listOfLists = new ArrayList<>();
        Arrays.sort(arr);
        int minDiff = arr[1]-arr[0];
        for(int i=0;i<arr.length-1;i++){
            int currDiff = arr[i+1]-arr[i]; 
            if(currDiff<=minDiff){
                if(currDiff<minDiff){
                    minDiff = currDiff;
                    listOfLists.clear();
                }
                listOfLists.add(Arrays.asList(arr[i],arr[i+1]));   
            }
        } 
        return listOfLists;
    }
}
