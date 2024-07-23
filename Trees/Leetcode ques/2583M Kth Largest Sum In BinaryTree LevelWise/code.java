//https://leetcode.com/problems/kth-largest-sum-in-a-binary-tree/

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class code {
    public static void main(String[] args) {
        
    }

    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> p = new PriorityQueue<>(Comparator.reverseOrder());
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);

        while(!q.isEmpty()){
            long sum = 0;
            int size = q.size();
            for(int i = 0 ; i<size ; i++){   
                TreeNode popped = q.poll();
                if(popped.left != null){
                    q.offer(popped.left);
                } 
                if(popped.right != null){
                    q.offer(popped.right);
                } 
                sum += popped.val;
            }
            p.add(sum);
        }
        while(k > 1 && !p.isEmpty()){
            k--;
            p.poll();
        }
        if(p.isEmpty())
            return -1;
        return p.peek();
    }
}
