//https://leetcode.com/problems/flood-fill/

import java.util.Stack;

public class code {
    public static void main(String[] args) {
        
    }
    
    int[] r = {-1,1,0,0};
    int[] c = {0,0,-1,1};

    //Using Stack

    static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalCol = image[sr][sc];
        if(originalCol == color)
            return image;
        
        Stack<int[]> stack = new Stack<>();

        stack.push(new int[]{sr,sc});

        while(!stack.isEmpty()){
            int[] cell = stack.pop();

            int row = cell[0];
            int col = cell[1];

            image[row][col] = color;

            for(int i = 0 ; i<4 ; i++){

                int newRow = row + r[i];
                int newCol = col + c[i];

                if(isValid(image,newRow,newCol,originalCol,color)){
                    stack.push(new int[]{newRow,newCol});
                }
            }
        }
        return image;
    }

    static boolean isValid(int[][] image , int r , int c ,int originalColor, int color){
        return r<image.length && c<image[0].length && r >= 0 && c >= 0 && image[r][c] == originalColor && image[r][c] != color ;
    }


    //Using recursion
    static int[][] floodFillRec(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color)
            return image;

        helperRec(image,sr,sc,image[sr][sc],color);
        return image;
    }

    static void helperRec(int[][] image , int sr , int sc ,int originalColor, int newColor){
        image[sr][sc] = newColor;  

        for(int i = 0 ; i<4 ; i++){

            int newRow = sr + r[i];
            int newCol = sc + c[i];

            if(isValidRec(image , newRow , newCol , newColor , originalColor)){
                helper(image,newRow,newCol,image[newRow][newCol],newColor);
            }
        }

    }

    static boolean isValidRec(int[][] image , int r , int c , int color , int val){
        return r<image.length && c<image[0].length && r>=0 && c>=0 && image[r][c] == val && image[r][c] != color;
    }
}
