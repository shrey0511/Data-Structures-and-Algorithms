//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

public class code {
    public static void main(String[] args) {
        
    }

    static int numberOfSteps(int n){
        return helper(n , 0);
    }

    static int helper(int n,int count){
        if(n == 0)
            return count;

        if(n%2 == 0)
            return helper(n/2, count+1);
            
        return helper(n-1,count+1);
    }
}
