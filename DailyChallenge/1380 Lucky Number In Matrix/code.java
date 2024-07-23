//https://leetcode.com/problems/lucky-numbers-in-a-matrix/?envType=daily-question&envId=2024-07-19

import java.util.ArrayList;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }

    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rowL = matrix.length , colL = matrix[0].length;
        int index = 0;

        int min = 0 , max = 0;
        for(int row = 0 ; row<rowL ; row++){
            max = 0;
            min = matrix[row][0];
            for(int col = 0 ; col < colL ; col++){
                if(matrix[row][col] < min){
                    min = matrix[row][col];
                    index = col;
                }
            }

            for(int row2 = 0 ; row2 < rowL ; row2++){
                max = Math.max(max , matrix[row2][index]);
            }

            if(min == max)
                ans.add(min);
        }
        return ans;
    }
}
