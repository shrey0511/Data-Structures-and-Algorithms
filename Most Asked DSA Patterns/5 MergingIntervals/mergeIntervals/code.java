//https://leetcode.com/problems/merge-intervals/description/

import java.util.ArrayList;
import java.util.Arrays;

public class code {
    public static void main(String[] args) {
        
    }

    static int[][] merge(int[][] intervals) {
        ArrayList<int[]> ans = new ArrayList<>();

        Arrays.sort(intervals,(o1,o2)-> o1[0]-o2[0] );

        int start = intervals[0][0];
        int end = intervals[0][1];
        
        int i = 1;

        while(i < intervals.length){
            int s = intervals[i][0];
            int e = intervals[i][1];

            if(s <= end){
                end = Math.max(e,end);
            }else{
                ans.add(new int[]{start,end});
                start = s;
                end = e;
            }
            i++;
        }
        ans.add(new int[]{start,end});//Last pair added
        return ans.toArray(new int[0][]);
    }
}
