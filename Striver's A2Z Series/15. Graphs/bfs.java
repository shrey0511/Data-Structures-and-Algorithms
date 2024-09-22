//https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1

import java.util.*;

public class bfs {
    public static void main(String[] args) {
        
    }

    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        Queue<Integer> q = new LinkedList();
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] vis = new boolean[V];
        
        q.add(0);
        vis[0] = true;
        
        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);
            
            for(Integer it : adj.get(node)){ //Getting the list of that node
                if(vis[it] == false){
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
}
