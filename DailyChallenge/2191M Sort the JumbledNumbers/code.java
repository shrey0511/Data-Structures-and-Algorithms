//https://leetcode.com/problems/sort-the-jumbled-numbers/?envType=daily-question&envId=2024-07-24

import java.util.Arrays;

public class code {
    public static void main(String[] args) {
        
    }

    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;

        int[][] mappedWithIndex = new int[n][2];

        for(int i = 0 ; i<n ; i++){
            int originalNum = nums[i] ;
            int placeVal = 1 ;
            int mappedVal = (originalNum == 0) ? mapping[0] : 0;
            
            while(originalNum > 0){
                int digit = originalNum % 10;
                mappedVal += mapping[digit]*placeVal;
                placeVal *= 10;
                originalNum /= 10;
            }
            mappedWithIndex[i][0] = mappedVal;
            mappedWithIndex[i][1] = i;

        }

        Arrays.sort(mappedWithIndex , (a,b) ->
            (a[0] == b[0]) ? a[1] - b[1] : a[0] - b[0]
        );

        int[] sorted = new int[n];
        for(int i = 0 ; i<n ; i++){
            sorted[i] = nums[mappedWithIndex[i][1]];
        }

        return sorted;
    }
}
