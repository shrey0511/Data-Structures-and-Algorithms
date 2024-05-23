//This is the sieve of eratosthenes method
public class SieveMethod {
    public static void main(String[] args) {
        sieve(40);
    }
    static void sieve(int n){
        boolean[] prime = new boolean[n+1];
        for(int i=2;i<=n;i++){
            prime[i] = true;
        }

        for(int i=2;i*i<=n;i++){
            if(prime[i]==true){
                for(int j=i*i;j<=n;j+=i){
                    prime[j] = false;
                }
            }
        }
        for(int i=0;i<=n;i++){
            if(prime[i])
                System.out.print(i+" ");
        }
    }
}
