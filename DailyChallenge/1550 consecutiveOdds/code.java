//https://leetcode.com/problems/three-consecutive-odds/?envType=daily-question&envId=2024-07-01

public class code {
    public static void main(String[] args) {
        
    }

    static boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length<3)
            return false;

        int left = -1 , right = 0;
        for(; right<arr.length ; right++){

            if(arr[right] % 2 == 0){
                left = right;
            }
            if(right - left >= 3)
                return true;

        }
        return false;
    }

    //Another way to do it (Bitwise &)
    static boolean threeConsecutiveOdds2(int[] arr){
        if(arr.length < 3)
            return false;

        int len = 0;
        for(int i = 0 ; i<arr.length ; i++){
            if((arr[i] & 1) == 0)
                len = 0;
            else
                len++;

            if(len == 3)
                return true;
        }
        return false;
    }
}
