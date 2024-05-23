//https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/description/

public class code {
    public static void main(String[] args) {
        
    }
    static int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for(int value=left;value<=right;value++){
            int count = 0;
            int i = value;
            while(i>0){
                i = i & (i-1);
                count++;
            }
            if(isPrime(count))
                ans++;
        }
        return ans;
    }
    static boolean isPrime(int x){
        if(x<=1)
            return false;
        if(x==2||x==3)
            return true;
        for(int i = 2;i*i<=x;i++){
            if(x%i==0)
                return false;
        }
        return true;
    }
}
