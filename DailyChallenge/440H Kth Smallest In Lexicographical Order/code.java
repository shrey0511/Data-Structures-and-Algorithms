//https://leetcode.com/problems/k-th-smallest-in-lexicographical-order/?envType=daily-question&envId=2024-09-22

public class code {
    public static void main(String[] args) {
        
    }

    public int findKthNumber(int n, int k) {
        int curr = 1;
        k--;

        while(k > 0){
            int steps = countSteps(n , curr , curr+1);
            if(steps <= k){
                k -= steps;
                curr += 1;
            }else{
                curr *= 10;
                k--;
            }
        }

        return curr;
    }

    private int countSteps(int n , long curr , long next){
        int steps = 0;
        while(curr <= n){
            steps += Math.min(n+1 , next) - curr;
            curr *= 10;
            next *= 10;
        }
        return steps;
    }
}
