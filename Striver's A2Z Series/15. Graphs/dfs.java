//https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1

import java.util.*;

public class dfs {
    public static void main(String[] args) {
        
    }

    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] vis = new boolean[V+1];
        vis[0] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0 , vis , adj , ls);
        
        return ls;
    }
    
    public static void dfs(int node , boolean[] vis , ArrayList<ArrayList<Integer>> adj , ArrayList<Integer> ls){
        ls.add(node);
        vis[node] = true;
        
        //Traverse all its neighbors
        for(Integer it : adj.get(node)){
            if(vis[it] == false){
                dfs(it , vis , adj , ls);
            }
        }
    }

    //T.C : For every node : SUM of degrees
    //So O(N) + 2*Edges
    //S.C : O(N) , be it recursion space or Visiting of node
}
