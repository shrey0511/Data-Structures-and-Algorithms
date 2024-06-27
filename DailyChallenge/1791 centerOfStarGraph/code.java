//https://leetcode.com/problems/find-center-of-star-graph/?envType=daily-question&envId=2024-06-27

import java.util.HashMap;

public class code {
    public static void main(String[] args) {
        
    }

    static int findCenter(int[][] edges) {
        //We can see that all other nodes will have a degree of 1
        //whereas center will have degree of n-1
        HashMap<Integer,Integer> degree = new HashMap<>();

        for(int[] edge : edges){
            degree.put(edge[0], degree.getOrDefault(edge[0],0)+1);
            degree.put(edge[1], degree.getOrDefault(edge[1],0)+1);
        }
        for(int node : degree.keySet()){
            //node is the key here
            if(degree.get(node) == edges.length){
                return node;
            }
        }
        return -1;
    }

    // public int findCenter(int[][] edges) {
    //     int a = edges[0][0];
    //     int b = edges[0][1];

    //     if(a == edges[1][0] || a == edges[1][1]) 
    //         return a;
    //     else 
    //         return b;
    // }
}
