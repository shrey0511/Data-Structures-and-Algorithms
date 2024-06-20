//https://leetcode.com/problems/magnetic-force-between-two-balls/?envType=daily-question&envId=2024-06-20

import java.util.Arrays;

public class code {
    public static void main(String[] args) {
        
    }

    //Take a look at the right bound concept for this one
    static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left = 1 , right = position[position.length-1] - position[0];
        int ans =  -1;
        while(left <= right){
            int mid = left + (right-left) / 2;
            int lastBall = position[0] , balls = 1;
            for(int i = 1 ; i<position.length ; i++){
                if(position[i] - lastBall >= mid){
                    lastBall = position[i];
                    balls++;
                }
            }
            if(balls >= m){
                ans = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
}
