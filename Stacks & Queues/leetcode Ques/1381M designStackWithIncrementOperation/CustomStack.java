//https://leetcode.com/problems/design-a-stack-with-increment-operation/

class CustomStack {

    int[] data;
    //int DEFAULT_SIZE = 10;
    int ptr;

    public CustomStack(int maxSize) {
        this.data = new int[maxSize];
        ptr = -1;
    }
    
    public void push(int x) {
        if(ptr >= data.length-1){
            return;
        }
        ptr++;
        data[ptr] = x;
    }
    
    public int pop() {
        if(ptr == -1){
            return ptr;
        }
        return data[ptr--];
    }
    
    public void increment(int k, int val) {
        int ptr2 = ptr;
        while(ptr2+1 > k){
            ptr2--;
        }
        while(ptr2 != -1){
            data[ptr2--] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
