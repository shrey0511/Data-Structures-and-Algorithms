//https://leetcode.com/problems/decode-xored-array/description/

public class code {
    public static void main(String[] args) {
        
    }
    static int[] decode(int[] encoded, int first) {
        int[] ans = new int[encoded.length+1];
        ans[0] = first;
        for(int i = 1 ; i<encoded.length+1 ; i++){
            ans[i] = ans[i-1]^encoded[i-1];
        }
        return ans;
    }
}
