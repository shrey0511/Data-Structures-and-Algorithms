//https://leetcode.com/problems/count-good-numbers/

public class code {
    public static void main(String[] args) {
        
    }
    int mod = (int) 1e9 + 7;
    public int countGoodNumbers(long n) {
        long first = (n%2 == 0 ? ( n/2 ) : (n/2) + 1);
        long second = n/2;
        long mul1 = power(5,first)%mod;
        long mul2 = power(4,second)%mod;
        long ans = 1;
        ans = (ans * mul1) % mod;
        ans = (second == 0)? ans : ans*mul2 % mod;
        return (int)(ans%mod); 
    }

    private long power(long x , long y ){
        if(y == 0) return 1;
        long temp;
        temp = power(x,y/2);
        if(y%2 == 0){
            return (temp * temp) % mod;
        }else{
            return (x * temp * temp) % mod;
        }
    }
}
