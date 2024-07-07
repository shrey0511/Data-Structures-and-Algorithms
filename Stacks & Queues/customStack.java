public class customStack {
    
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    
    int ptr = -1;

    public customStack(){
        this(DEFAULT_SIZE);
    }

    public customStack(int size){
        this.data = new int[size];
    }

    public boolean push(int x) throws stackException{
        if(isFull()){
            throw new stackException("Stack is Full !!");
        }
        ptr++;
        data[ptr] = x;
        return true;
    }

    public int pop() throws stackException{
        if(isEmpty()){
            throw new stackException("Cannot pop from an empty stack !!");
        }
        // int removed = data[ptr];
        // ptr--;
        // return removed;
        return data[ptr--];
    }

    public int peek() throws stackException{
        if(isEmpty()){
            throw new stackException("Cannot pop from an empty stack !!");
        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr == data.length - 1 ; //ptr is at the last
    }

    public boolean isEmpty(){
        return ptr == -1;
    }
}
