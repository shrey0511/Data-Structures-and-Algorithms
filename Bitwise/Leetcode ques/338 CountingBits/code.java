//https://leetcode.com/problems/counting-bits/description/

public class code {
    public static void main(String[] args) {
        
    }
    static int[] countBits(int n) {
        int[] ans = new int[n+1];
        int count = 0;
        for(int i=0;i<=n;i++){
            int value = i;
            while(value>0){
                count++;
                value = value & (value-1);
            }
            ans[i] = count;
            count=0;
        }
        return ans;
    }
}
