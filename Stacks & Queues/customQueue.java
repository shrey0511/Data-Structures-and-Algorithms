public class customQueue {
    private static int[] data;

    private static int DEFAULT_SIZE = 10;

    int end = 0;

    public customQueue(){
        this(DEFAULT_SIZE);
    }

    public customQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int x){
        if(isFull()){
            return false;
        }

        data[end++] = x;

        return true;
    }

    //This takes O(N) time to shift all elements so we use circular queue
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty !!");
        }

        int removed = data[0];

        //shifting the remaining elements
        for(int i = 1 ; i<data.length ; i++){
            data[i-1] = data[i];
        }
        end--;

        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty !!");
        }

        return data[0];
    }

    public void display(){
        for(int i = 0 ; i<end ; i++){
            System.out.println(data[i] + " ");
        }
        System.out.println("END");
    }
}
