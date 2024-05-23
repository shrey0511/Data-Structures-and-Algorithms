//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/

public class code {
    public static void main(String[] args) {
        
    }
    static double average(int[] salary) {
        int max = 0 , min = 100000 , sum = 0;
        for(int element : salary){
            if(element<min)
                min = element;
            if(element>max)
                max = element;
            sum+=element;        
        }
        return (double)(sum-min-max)/(salary.length-2);
    }
}
