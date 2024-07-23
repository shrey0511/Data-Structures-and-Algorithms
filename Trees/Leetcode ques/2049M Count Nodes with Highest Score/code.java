//https://leetcode.com/problems/count-nodes-with-the-highest-score/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }

    public int countHighestScoreNodes(int[] parents) {
        List<List<Integer>> al = new ArrayList<>();
    
        for(int i : parents){
            al.add(new ArrayList<Integer>());
        }

        for(int i = 1 ; i<parents.length ; i++){
            al.get(parents[i]).add(i);
        }
        long[] score = new long[parents.length];
        
        dfs(al,score,0);
        long max = Arrays.stream(score).max().getAsLong();
        return (int)Arrays.stream(score).filter(v -> v == max).count();
    }

    private long dfs(List<List<Integer>> al , long[] score , int i){
        long prod = 1 , sum = 1;

        for(int j : al.get(i)){//Children of i
            long cnt = dfs(al,score,j);
            prod *= cnt;//Prod of subtree sizes
            sum += cnt;//Size of subtrees
        }
        //Calc score of each node
        score[i] = prod * Math.max(1 , al.size() - sum);
        return sum;
    }

}
