// ^ is used for XOR

public class rangeXOR {
    public static void main(String[] args) {
        //For xor of a to b: you just do xor of xor(b) and xor(a-1)
        //because anything before a is extra and if we xor it then it will turn into 0
        int a = 3;
        int b = 9;
        
        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);

        //for check you can loop for each xor
        //but this will give TLE for large numbers
        int ans2=0;
        for(int i=a;i<=b;i++){
            ans2 ^= i;
        }
        System.out.println(ans2);
    }   
    //XOR for a range (0 to a);
    private static int xor(int a){
        if(a%4 == 0)
            return a;
        if(a%4 == 1)
            return 1;
        if(a%4 == 2)
            return a+1;
        return 0;
    } 
}
