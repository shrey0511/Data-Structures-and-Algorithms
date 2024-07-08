//https://leetcode.com/problems/implement-queue-using-stacks/

import java.util.*;


//This one is insert efficient
public class MyQueue {

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(5);
        q.push(3);
        int param_2 = q.pop();
        int param_3 = q.peek();
        boolean param_4 = q.empty();

        System.out.println(param_2 + " " + param_3 + " " + param_4);
    }

    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        int removed = s2.pop();

        while(!s2.empty()){
            s1.push(s2.pop());
        }

        return removed;
    }
    
    public int peek() {
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        int peek = s2.peek();

        while(!s2.empty()){
            s1.push(s2.pop());
        }

        return peek;
    }
    
    public boolean empty() {
        return s1.empty();        
    }
}

//This one is remove efficient

// public void push(int x) {

//     while(!s1.empty()){
//         s2.push(s1.pop());
//     }

//     s1.push(x);

//     while(!s2.empty){
//         s1.push(s2.pop());
//     }
// }

// public int pop() {
    
//     int removed = s1.pop();

//     return removed;
// }

// public int peek() {
    
//     int peek = s1.peek();

//     return peek;
// }
//Rest of the functions will remain the same
