//https://www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1

import java.util.Stack;

public class code {
    public static void main(String[] args) {
        
    }

    static int[] calculateSpan(int price[], int n) {
        // Your code here
        Stack<Integer> st = new Stack<>();
        
        int[] ans = new int[n];
        
        ans[0] = 1;
        
        //Push the current index onto the stack
        st.push(0);
        
        for(int i = 1 ; i<n ; i++){
            
            while(!st.isEmpty() && price[i] >= price[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = i+1;
            }else{
                ans[i] = i - st.peek();
            }
            st.push(i);
        }
        return ans;
    }

}


