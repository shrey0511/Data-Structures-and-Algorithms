//https://leetcode.com/problems/happy-number/description/

public class code {
    public static void main(String[] args) {
        
    }

    static boolean isHappy(int n) {
        int slow = n , fast = n;
        do{
            slow = findDigitsSquare(slow);
            fast = findDigitsSquare(findDigitsSquare(fast));
        }while(slow != fast);

        //We stop after slow = fast because we found a cycle, dont calculate further
        if(slow == 1)
            return true;
        return false;
    }
    static int findDigitsSquare(int n){
        int ans = 0;
        while(n>0){
            int digit = n % 10;
            ans += digit*digit;
            n /= 10;
        }
        return ans;
    }
}
