//https://leetcode.com/problems/design-circular-queue/

class MyCircularQueue {

    int[] data;
    int front, back , size;

    public MyCircularQueue(int k) {
        data = new int[k];
        front = -1;
        back = -1;
        size = 0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        if(isEmpty()){
            front++;
        }
            
        back++;
        back %= data.length;
        data[back] = value;
        size++;

        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        if(front == back){ //Both of them are same then empty
            front = -1;
            back = -1;
        }else{
            front++;
            front %= data.length;
        }
        size--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return data[front];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return data[back];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == data.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
