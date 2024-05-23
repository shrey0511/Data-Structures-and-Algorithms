//https://leetcode.com/problems/merge-intervals/description/

import java.util.ArrayList;
import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        
    }
    static int[][] merge(int[][] intervals) {
       
   	// sort our intervals 
     Arrays.sort(intervals, (o1,o2)->o1[0]-o2[0]);
  
       ArrayList<int[]> ans  =  new ArrayList<>();
   	// intial range 
       int start  =  intervals[0][0];
       int end =  intervals[0][1]; 
       
       int  i =1;
       while(i<intervals.length){
           int s = intervals[i][0];
           int e = intervals[i][1];
           // next interval start is smaller than prev end and array is sorted
           // so these two internal can merge
           if( s<=end  ) { 
               // so merge both intervals 
               end =  Math.max(end,e);
           }
           else{ // if merge not possible , then insert prev interval into list
               ans.add(new int[]{start,end});
               start = s;
               end =  e;                
           }
          i++;
       }
       
       ans.add(new int[] {start,end});
   	
   	return ans.toArray(new int[0][]);   
   }
}
