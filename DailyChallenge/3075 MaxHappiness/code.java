//https://leetcode.com/problems/maximize-happiness-of-selected-children/description/?envType=daily-question&envId=2024-05-09

public class code {
    public static void main(String[] args) {
        
    }
    static long maximumHappinessSum(int[] happiness, int k) {
        long sum = 0;
        int turns = 0;
        int n = happiness.length-1;
        Arrays.sort(happiness);
        for(int i=0;i<k;i++){
            int value = happiness[n--] - turns++;
            if(value>0){
                sum+=value;
            }
        }
        return sum;
    }
}
