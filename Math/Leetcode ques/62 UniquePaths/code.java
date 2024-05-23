//https://leetcode.com/problems/unique-paths/

public class code {
    public static void main(String[] args) {
        
    }
    static int uniquePaths(int m, int n) {
        long ans =1;
        for(int i=1;i<=m-1;i++){
            ans = ans * (n-1+i) / i; //Combinational formula is used
        }// NcR where N = (n-1) + (m-1) and r = (m-1)
        return (int)ans;
    }
}
