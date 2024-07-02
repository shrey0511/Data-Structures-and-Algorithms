//https://leetcode.com/problems/find-the-winner-of-the-circular-game/

public class code {
    public static void main(String[] args) {
        
    }

    //Time : O(n) Space : O(n) call stacks

    static int findTheWinner(int n, int k) {
        return helper(n,k) + 1; // increase the index by 1
    }

    static int helper(int n , int k ){
        if(n == 1)
            return 0; //index of the winner

        //Increase the previous answer by k steps and
        //use % to keep it inside range of n
        return (helper(n-1 , k) + k) % n;
    }
}
