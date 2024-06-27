//https://leetcode.com/problems/k-th-symbol-in-grammar/

public class code {
    public static void main(String[] args) {
        
    }

    static int kthGrammar(int n, int k) {
        if(n==1)
            return 0;
        
        int noColumns = (int) Math.pow(2,n-1);
        int mid = noColumns/2;

        if(k <= mid){
            return kthGrammar(n-1,k);
        }else{
            k = k-mid;
            int x = kthGrammar(n-1,k);
            return (x==0)? 1 : 0;
        }
    }
}
