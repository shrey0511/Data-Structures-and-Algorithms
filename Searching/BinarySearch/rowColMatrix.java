import java.util.Arrays;
//Not strictly sorted but rows and cols sorted not the matrix, a different file on that check
public class rowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {10,20,30,40},
            {12,22,33,44},
            {14,24,34,46},
            {19,27,36,50}
        };
        System.out.println(Arrays.toString(search(matrix, 36)));
    }
    static int[] search(int[][] matrix,int target){
        int r = 0, c = matrix.length-1;
        while(r<matrix.length && c>=0){
            //Apply 3 checks like binary to minimize the search space
            if(target==matrix[r][c]){
                return new int[]{r,c};
            }
            else if(matrix[r][c]<target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
