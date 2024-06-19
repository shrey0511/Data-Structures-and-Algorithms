//https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/?envType=daily-question&envId=2024-06-19

public class code {
    public static void main(String[] args) {
        
    }

    static int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length) return -1;
        
        int min = Integer.MAX_VALUE , max = 0;
        for(int num : bloomDay){
            min = Math.min(num,min);
            max = Math.max(num,max);
        }
        int left = min , right = max;
        while(left<right){
            int mid = left + (right-left) / 2;
            if(isPossibleBouquet(bloomDay,m,k,mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
    static boolean isPossibleBouquet(int[] bloomDay , int m , int k , int day){
        int bouquet = 0;
        for(int i = 0 ; i<bloomDay.length ; i++){
            int flowers = 0;//Since they need to be adjacent
            while(i<bloomDay.length && flowers<k && bloomDay[i]<=day){
                flowers++;
                i++;
            }

            if(flowers == k){
                bouquet++;
                i--;
            }

            if(bouquet >= m)
                return true;
        }
        return false;
    }
}
