public class countZeroes {
    public static void main(String[] args) {
        System.out.println(count(302040));
    }

    static int count(int n){
        return helper(n,0);
    }

    //special patter of how to pass a value to above calls, count value here
    static int helper(int n,int count){
        if(n == 0)
            return count;
        if(n%10 == 0){
            return helper(n/10, count+1);
        }
        return helper(n/10, count);
    }
}
