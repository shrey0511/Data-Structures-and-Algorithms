//https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/?envType=daily-question&envId=2024-08-03

public class code {
    public static void main(String[] args) {
        
    }

    public boolean canBeEqual(int[] target, int[] arr) {
        //Use count sort
        int[] freq = new int[1001];
        for(int elem : target){
            freq[elem]++;
        }
        for(int elem : arr){
            freq[elem]--;
        }

        for(int elem : freq){
            if(elem!=0)
                return false;
        }

        return true;
    }
}
