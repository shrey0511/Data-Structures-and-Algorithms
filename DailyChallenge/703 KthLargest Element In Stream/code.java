//https://leetcode.com/problems/kth-largest-element-in-a-stream/?envType=daily-question&envId=2024-08-12

import java.util.PriorityQueue;

public class code {
    int k;
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    public code(int k , int[] nums){
        this.k = k;
        for(var n : nums) add(n);
    }

    public int add(int val){
        pq.offer(val);
        if(pq.size() > k){
            pq.poll();
        }
        return pq.peek();
    }
}
