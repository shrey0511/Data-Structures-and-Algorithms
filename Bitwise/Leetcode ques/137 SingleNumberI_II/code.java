//https://leetcode.com/problems/single-number-ii/description/

public class code {
    public static void main(String[] args) {
        
    }
    int detect(int[]arr,int repeatationTime){
        int ans = 0;
        for(int i=0;i<32;i++){
            int sum = 0;
            for(int num:arr)
                sum += (num>>i)&1;
            sum %= repeatationTime;
            ans |= sum<<i;
        }
        return ans;
    }
}
