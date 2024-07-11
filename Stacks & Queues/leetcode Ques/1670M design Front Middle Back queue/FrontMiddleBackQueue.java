//https://leetcode.com/problems/design-front-middle-back-queue/

import java.util.ArrayDeque;
import java.util.Deque;

class FrontMiddleBackQueue {

    Deque<Integer> dq1;
    Deque<Integer> dq2;

    public FrontMiddleBackQueue() {
        dq1 = new ArrayDeque<>();
        dq2 = new ArrayDeque<>();
    }
    
    public void pushFront(int val) {
        dq1.addFirst(val);
    }
    
    public void pushMiddle(int val) {
        
        while(dq1.size()+1 < dq2.size()){
            dq1.addLast(dq2.removeFirst());
        }
        while(dq1.size() > dq2.size()){
            dq2.addFirst(dq1.removeLast());
        }
        dq1.addLast(val);
    }
    
    public void pushBack(int val) {
        dq2.addLast(val);
    }
    
    public int popFront() {
        if(!dq1.isEmpty()){
            return dq1.removeFirst();
        }
        if(!dq2.isEmpty()){
            return dq2.removeFirst();
        }
        return -1;
    }
    
    public int popMiddle() {
        if(dq1.isEmpty() && dq2.isEmpty())
            return -1;
        //Equate the sizes
        while(dq1.size() < dq2.size()){
            dq1.addLast(dq2.removeFirst());
        }
        while(dq1.size() > dq2.size()+1){
            dq2.addFirst(dq1.removeLast());
        }

        return dq1.isEmpty() ? dq2.removeFirst() : dq1.removeLast();
    }
    
    public int popBack() {
        if(!dq2.isEmpty())
            return dq2.removeLast();
        if(!dq1.isEmpty())
            return dq1.removeLast();
        return -1;
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */
