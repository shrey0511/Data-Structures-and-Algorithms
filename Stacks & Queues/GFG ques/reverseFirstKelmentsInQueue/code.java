//https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1

import java.util.Queue;
import java.util.Stack;

public class code {
    public static void main(String[] args) {
        
    }

    static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Stack<Integer> s = new Stack<>();
        
        for(int j = 0 ; j<k ; j++){
            s.push(q.remove());
        }
        
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        
        for(int i = 0 ; i<q.size()-k ; i++){
            q.add(q.remove());
        }
        
        return q;
    }
}
