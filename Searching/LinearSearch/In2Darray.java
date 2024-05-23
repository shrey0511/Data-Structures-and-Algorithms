import java.util.Arrays;

public class In2Darray {
    public static void main(String[] args) {
        int[][] mat={{12,15,2},
                    {5,90,87},
                    {1,55,33}
                };
        int[] result = Search(mat, 5);
        System.out.println(Arrays.toString(result));
        System.out.println(max(mat));        
    }
    static int[] Search(int[][] ans,int target){
        for(int row=0;row<ans.length;row++){
            for(int col=0;col<ans[row].length;col++){
                if(ans[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][] ans){
        int Max=Integer.MIN_VALUE;
        for(int[] ints : ans){
            for(int element : ints){
                if(element>Max){
                    Max=element;
                }
            }
        }
        return Max;
    }
}
