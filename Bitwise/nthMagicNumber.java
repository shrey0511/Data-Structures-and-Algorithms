//Magic number is each binary position which is equal to 1 , that multiplied by 5^index 

public class nthMagicNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(ans(n));
    }
    static int ans(int n){
        int sum = 0;
        int index = 1;
        while(n>0){
            sum += (n & 1)*(Math.pow(5, index));
            n = n>>1;
            index++;
        }
        return sum;
    }
}
