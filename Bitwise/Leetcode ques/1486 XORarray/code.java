//https://leetcode.com/problems/xor-operation-in-an-array/description/

public class code {
    public static void main(String[] args) {
        
    }
    static int xorOperation(int n, int start) {
        int result = 0;
        int count=0;
        while(count<n){
            result = (start + 2*count)^result;
            count++;
        }
        return result;
    }
}
