class Prime{
    public static void main(String[] args) {
        int n = 3;
        if(isPrime(n))
            System.out.println("Prime number");
    }
    static boolean isPrime(int x){
        if(x<=1)
            return false;
        for(int i=2;i*i<=x;i++){
            if(x%i==0)
                return false;
        }
        return true;
    }
}