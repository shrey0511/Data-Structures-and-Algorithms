//https://leetcode.com/problems/sum-of-square-numbers/?envType=daily-question&envId=2024-06-17

public class code {
    public static void main(String[] args) {
        
    }

    static boolean judgeSquareSum(int c) {
        long sum = 0;
        long left = 0 , right =(int) Math.sqrt(c);

        while(left <= right){
            sum = (left*left) + (right*right);
            if(sum > c)
                right--;
            else if(sum < c)
                left++;
            else
                return true;
        }
        return false;
    }
    //To find the integer square root of c we can also use binary search
    // long l = 1 , r = c , root = 0;
    // while(l <= r){
    //     long mid = l + (r-l) / 2;
    //     long prod = mid * mid;
    //     if(prod == c) return true
    //     if(prod > c)
    //         r = mid - 1;
    //     else{
    //         l = mid + 1;
    //         root = mid;
    //     }
    // } 
}
