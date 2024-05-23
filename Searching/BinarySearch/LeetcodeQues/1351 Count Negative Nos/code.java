

public class code {
    public static void main(String[] args) {
       
    }

    static int countNegatives(int[][] grid) {
        int count=0,n=grid.length,pointer=0,        m=grid[0].length,r=n-1; 
        while(r>=0&&pointer<m){
            if(grid[r][pointer]<0){
                --r;
                count+=m-pointer;
            }else{
                pointer++;
            }
        }
        return count;
    }
}
