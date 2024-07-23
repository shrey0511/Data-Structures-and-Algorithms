//https://leetcode.com/problems/validate-binary-tree-nodes/

import java.util.LinkedList;
import java.util.Queue;

public class code {
    public static void main(String[] args) {
        
    }

    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        boolean[] childNode = new boolean[n];

        for(int child : leftChild){
            if(child != -1){
                childNode[child] = true;
            }
        }
        for(int child : rightChild){
            if(child != -1){
                if(childNode[child])//Already a parent was found
                    return false;

                childNode[child] = true;
            }
        }

        int root = -1;
        for(int i = 0 ; i<n ; i++){
            if(!childNode[i]){
                if(root == -1)
                    root = i;
                else{
                    return false;
                }

            }
        }

        if(root == -1){
            //No node is present without a parent
            return false;
        }

        return isValidBinaryTree(root , leftChild , rightChild);
            
    }

    private boolean isValidBinaryTree(int root , int[] leftChild , int[] rightChild){
        boolean[] visited = new boolean[leftChild.length];
        Queue<Integer> q = new LinkedList();
        q.add(root);
        visited[root] = true;

        while(!q.isEmpty()){
            int current = q.poll();

            if(leftChild[current] != -1){
                if(visited[leftChild[current]])
                    return false;//Already visited
            
                q.add(leftChild[current]);
                visited[leftChild[current]] = true;//Visited
            }
            

            if(rightChild[current] != -1){
                if(visited[rightChild[current]]){
                    return false;//Already visited
                }

                q.add(rightChild[current]);
                visited[rightChild[current]] = true;
            }

        }

        for(boolean visit : visited)
            if(!visit)//A node was not visited
                return false;

        return true;//All cases satisfied
    }
}
