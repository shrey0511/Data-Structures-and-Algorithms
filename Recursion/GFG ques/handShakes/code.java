//https://www.geeksforgeeks.org/problems/handshakes1303/1

import java.util.HashMap;

public class code {
    public static void main(String[] args) {
        
    }

    //To remove repeatitive calculation we used memoization to store calculations

    static int count(int N) 
    { 
        // code here
        HashMap<Integer,Integer> memo = new HashMap<>();
        int ans = 0;
        
        if(N == 0 || N == 2)
            return 1;
            
        if(memo.containsKey(N))
            return memo.get(N);
            
        for(int i=0 ; i < N-1 ; i+=2){
            ans += count(i) * count(N-2-i);
        }
        
        memo.put(N,ans);
        
        return ans;
        
    }
}
