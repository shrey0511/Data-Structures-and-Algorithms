//https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/description/

public class findKth {
    public static void main(String[] args) {
        
    }
    static char findKthBit(int n, int k) {
        if(n==1)
            return '0';
        int noColumns = (int)(Math.pow(2,n)-1);
        int mid = noColumns/2;

        if(k<=mid){
            return findKthBit(n-1,k);
        }else if(k==mid+1){
            return '1';
        }else{
            k = noColumns - k + 1;
            char c = findKthBit(n-1,k);
            return c == '0'? '1':'0';
        }
    }
}
