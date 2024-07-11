//https://www.geeksforgeeks.org/problems/the-celebrity-problem/1

import java.util.Stack;

public class code {
    public static void main(String[] args) {
        
    }

    //Function to find if there is a celebrity in the party or not.
    static int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack<Integer> s = new Stack<>();
    	
    	for(int i = 0 ; i<n ; i++){
    	    s.push(i);
    	}
    	
    	
    	while(s.size() > 1){
    	    //Take out two people
    	    int a = s.pop();
    	    int b = s.pop();   
    	    
    	    if(M[a][b] == 1){
    	        //Means a knows b and b can be a celebrity
    	        s.push(b);
    	    }else{
    	        //a can be a celebrity
    	        s.push(a);
    	    }
    	}
    	
    	//Check if the candidate is a celebrity
    	int candidate = s.pop();
    	
    	for(int i = 0 ; i<n ; i++){
    	    if( i != candidate && M[candidate][i] == 1)
    	        return -1;
    	        
    	   if( i != candidate && M[i][candidate] == 0)
    	        return -1;
    	}
    	return candidate;
    }
}
