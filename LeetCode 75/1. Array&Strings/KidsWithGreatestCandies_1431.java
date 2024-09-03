//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestCandies_1431 {
    public static void main(String[] args) {
        
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for(int x : candies){
            max = Math.max(max , x);
        }

        List<Boolean> ans = new ArrayList<>();
        for(int elem : candies){
            if(elem + extraCandies >= max)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}
