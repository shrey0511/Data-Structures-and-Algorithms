//https://leetcode.com/problems/implement-stack-using-queues/

import java.util.*;

//This one is push efficient

public class MyStack {
    public static void main(String[] args) {
        
    }

    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList();
        q2 = new LinkedList();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        while(q1.size()!=1){
            q2.add(q1.remove());
        }

        int popped = q1.remove();

        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }

        return popped;
    }
    
    public int top() {
        while(q1.size()!=1){
            q2.add(q1.remove());
        }

        int peeked = q1.peek();
        q2.add(q1.remove());

        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
        
        return peeked;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}
