//https://leetcode.com/problems/beautiful-arrangement/

//An array is a beautiful arrangment when (arr[i] ka i) % n == 0 || n % (arr[i] ka i) == 0

public class code {
    public static void main(String[] args) {
        
    }

    static int countArrangments(int n){
        return perm(new boolean[n] , n);
    }

    static int perm(boolean[] check , int n){
        if(n == 1){
            return 1;
        }
        int count = 0;

        for(int i = check.length ; i>=1 ; i-- ){
            if(!check[i-1] && (i % n == 0 || n % i == 0)){
                check[i-1] = true;
                count += perm(check, n-1);
                check[i-1] = false;
            }
        }
        return count;
    }
}
