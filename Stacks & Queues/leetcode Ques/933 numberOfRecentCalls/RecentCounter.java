//https://leetcode.com/problems/number-of-recent-calls/

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    public static void main(String[] args) {
        
    }

    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.add(t);
        while(queue.peek() < (t-3000))
            queue.remove();
        
        return queue.size();
    }
}
