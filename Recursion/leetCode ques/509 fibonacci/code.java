//https://leetcode.com/problems/fibonacci-number/

public class code {
    public static void main(String[] args) {
        
    }

    static int fib(int n) {
        //Base case
        if(n<2){
            return n;
        }
        
        //recurrence relation
        return fib(n-1) + fib(n-2);
    }
}
