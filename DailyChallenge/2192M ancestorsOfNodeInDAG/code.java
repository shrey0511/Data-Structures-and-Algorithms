//https://leetcode.com/problems/all-ancestors-of-a-node-in-a-directed-acyclic-graph/?envType=daily-question&envId=2024-06-29

import java.util.ArrayList;
import java.util.List;


public class code {
    public static void main(String[] args) {
        
    }

    static List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(new ArrayList<>());
        }

        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
        }

        for (int i = 0; i < n; i++) {
            dfs(graph, i, i, res, new boolean[n]);
        }

        for (int i = 0; i < n; i++) {
            res.get(i).sort(Integer::compareTo);
        }

        return res;
    }

    static void dfs(ArrayList<Integer>[] graph, int parent, int curr, List<List<Integer>> res, boolean[] visit) {
        visit[curr] = true;
        for (int dest : graph[curr]) {
            if (!visit[dest]) {
                res.get(dest).add(parent);
                dfs(graph, parent, dest, res, visit);
            }
        }
    }
}
