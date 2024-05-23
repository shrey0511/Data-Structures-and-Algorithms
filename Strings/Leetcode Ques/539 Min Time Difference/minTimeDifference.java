//https://leetcode.com/problems/minimum-time-difference/description/

import java.util.Arrays;
import java.util.List;

public class minTimeDifference {
    public static void main(String[] args) {
        
    }
    static int findMinDifference(List<String> timePoints) {
        int[] c = new int[timePoints.size()];
        int res = Integer.MAX_VALUE;
        for(int i=0;i<timePoints.size();i++){
            String s = timePoints.get(i);
            c[i] = Integer.parseInt(s.substring(0,2))*60+Integer.parseInt(s.substring(3,5));
        }
        Arrays.sort(c);
        for(int i=1;i<timePoints.size();i++){
            res = Math.min(res,c[i]-c[i-1]);
        }
        res = Math.min(res,c[0] + (24*60 - c[timePoints.size()-1]));
        return res;
    }
}
