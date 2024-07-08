//https://leetcode.com/problems/largest-rectangle-in-histogram/

import java.util.Stack;

public class code {
    public static void main(String[] args) {
        
    }

    static int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();

        int max = 0;

        s.push(0);
        
        for(int i = 1 ; i<heights.length ; i++){
            while(!s.isEmpty() && heights[i] < heights[s.peek()]){
                max = getMax(heights,s,max,i);
            }
            s.push(i);
        }

        int i = heights.length;
        while(!s.isEmpty()){
            max = getMax(heights,s,max,i);
        }

        return max;
    }

    private static int getMax(int[] arr , Stack<Integer> stack , int max , int i){
        int area;
        int popped = stack.pop();
        if(stack.isEmpty()){
            area = arr[popped] * i;
        }else{
            area = arr[popped] * (i - 1 - stack.peek());
        }
        return Math.max(max,area);
    }
}
