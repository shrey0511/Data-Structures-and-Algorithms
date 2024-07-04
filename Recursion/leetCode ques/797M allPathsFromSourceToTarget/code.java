//https://leetcode.com/problems/all-paths-from-source-to-target/

import java.util.ArrayList;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }

    static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(graph ,ans , new ArrayList<>() , 0);
        return ans;
    }

    private static void helper(int[][] graph , List<List<Integer>> ans , List<Integer> temp , int index){
        temp.add(index);
        //Base condition
        if(index == graph.length-1){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int j = 0 ; j<graph[index].length ; j++){
            helper(graph , ans , temp , graph[index][j]);
            temp.remove(temp.size()-1);    
        }
        return;
    }
}
