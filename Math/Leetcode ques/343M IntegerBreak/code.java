//https://leetcode.com/problems/integer-break/

public class code {
    public static void main(String[] args) {
        
    }
    static int integerBreak(int n){
        int ans = 1;
        if(n<=1)
            return 0;
        if(n==2)
            return 1;
        if(n==3)
            return 2;
        while(n>4){
            ans *= 3;//Keep dividing the number into 3 factors
            n -= 3;
        }
        ans *= n;//Multiply with the remaining factors in n after all trios are taken out
        return ans;
    }
}
