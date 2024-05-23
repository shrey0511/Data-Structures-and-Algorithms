//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

public class code {
    public static void main(String[] args) {
        
    }
    static int numberSteps(int num){
        int count = 0;
        while(num>0){
            num = (num&1) == 1 ? num^1 : num>>1;
            count++;
        }
        return count;
    }
}
