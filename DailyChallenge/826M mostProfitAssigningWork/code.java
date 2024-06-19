//https://leetcode.com/problems/most-profit-assigning-work/?envType=daily-question&envId=2024-06-18

import java.util.ArrayList;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }

    static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        List<int[]> infos = new ArrayList<>();
        //add difficult and profit as a pair
        for(int i=0;i<difficulty.length;i++){
            infos.add(new int[]{difficulty[i],profit[i]});
        }
        //Sort the list according to difficulty
        infos.sort((a,b)-> a[0] - b[0] );

        List<int[]> maxProfitForDiffi = new ArrayList<>();
        int maxp = 0;
        for(int[] info : infos){
            int d = info[0] , p = info[1];
            maxp = Math.max(p,maxp);
            maxProfitForDiffi.add(new int[]{d,maxp});
        }

        int maxProfit = 0;
        for(int w : worker){
            int val = binarySearch(maxProfitForDiffi,w);
            if(val >= 0 && w >= maxProfitForDiffi.get(val)[0])
                maxProfit += maxProfitForDiffi.get(val)[1];
        }
        return maxProfit;
    }

    static int binarySearch(List<int[]> list,int target){
        int left = 0 , right = list.size()-1;
        while(left <= right){
            int mid = left + (right-left) / 2;
            if(list.get(mid)[0] <= target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return right;
    }
}
