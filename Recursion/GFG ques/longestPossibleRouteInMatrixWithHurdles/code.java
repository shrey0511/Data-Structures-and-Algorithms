//https://www.geeksforgeeks.org/longest-possible-route-in-a-matrix-with-hurdles/

public class code {
    public static void main(String[] args) {
        int[][] mat = {
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 0, 1, 1, 0, 1, 1, 0, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
        };
        int r = 0 , c = 0 , desR = 1 , desC = 7 ;
        System.out.println("Longest possible path is : "+longestPath(mat, r, c, desR, desC));
    }

    private static int longestPath(int[][] mat, int r, int c, int desR, int desC) {
        boolean[][] path = new boolean[mat.length][mat[0].length];
        return helper(mat, path, r, c, desR, desC, 0);
    }

    private static int helper(int[][] mat,boolean[][] path, int r, int c, int desR, int desC,int length) {
        if(r == desR && c == desC){
            return length;
        }

        int currLength = 0;
        path[r][c] = true;//Path taken

        
        //Move up
        if(isValid(mat,path,r-1,c)){
            currLength = Math.max(currLength,helper(mat, path, r-1, c, desR, desC, length+1));
        }
        
        //Move down
        if(isValid(mat,path,r+1,c)){
            currLength = Math.max(currLength,helper(mat, path, r+1, c, desR, desC, length+1));
        }
        
        //Move left
        if(isValid(mat,path,r,c-1)){
            currLength = Math.max(currLength,helper(mat, path, r, c-1, desR, desC, length+1));
        }
        
        //Move right
        if(isValid(mat,path,r,c+1)){
            currLength = Math.max(currLength,helper(mat, path, r, c+1, desR, desC, length+1));
        }

        path[r][c] = false; //Path change

        return currLength;

    }

    private static boolean isValid(int[][] mat, boolean[][] path, int r, int c) {
        return r>=0 && r<mat.length && c>=0 && c<mat[0].length && mat[r][c] != 0 && !path[r][c];
    }
}
