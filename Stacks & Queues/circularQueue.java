public class circularQueue {

    protected static int[] data;

    protected static int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public circularQueue(){
        this(DEFAULT_SIZE);
    }

    public circularQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int x){
        if(isFull()){
            return false;
        }

        data[end++] = x;
        end %= data.length;
        size++;

        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty !!");
        }

        int removed = data[front++];
        front %= data.length;
        size--;

        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty !!");
        }

        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty !");
            return;
        }

        int i = front; 
        do {
            System.out.print(data[i]+" -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }
}
