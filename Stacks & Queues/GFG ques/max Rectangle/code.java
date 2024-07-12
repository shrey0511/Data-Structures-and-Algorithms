//https://www.geeksforgeeks.org/problems/max-rectangle/1

import java.util.Stack;


public class code {
    public static void main(String[] args) {
        
    }

    public int maxArea(int M[][], int n, int m) {
        // add code here.
        if(M == null || n == 0 || m == 0)
            return 0;
            
        int maxArea = 0;
        int[] heights = new int[m];
        
        for(int i = 0 ; i<n ; i++){
            //for each row calculate height
            for(int j = 0 ; j<m ; j++){
                if(M[i][j] == 0){
                    heights[j] = 0;
                }else{
                    heights[j] += M[i][j];
                }
            }
            //Calculating area for that row
            maxArea = Math.max(maxArea , rectangleArea(heights));
        }
        return maxArea;
    }
    
    private int rectangleArea(int[] heights){
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        int n = heights.length;
        
        for(int i = 0 ; i<= n ; i++){
            int h = (i==n) ? 0 : heights[i];
            while(!st.isEmpty() && h < heights[st.peek()]){
                int height =  heights[st.pop()];
                int width = (st.isEmpty()) ? i : i - 1 - st.peek();
                maxArea = Math.max(maxArea,height * width);
            }
            st.push(i);
        }
        return maxArea;
    }
}
