public class code {
    public static void main(String[] args) {
        
    }

    static int findTheWinner(int n, int k) {
        return helper(n, k) + 1; //Since we returning index from the helper function
    }

    static int helper(int n , int k){
        if(n == 1){
            return 0;
        }

        return ( helper((n-1),k) + k ) % n;
    }
}
