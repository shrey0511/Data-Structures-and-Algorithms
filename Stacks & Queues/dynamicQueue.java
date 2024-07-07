public class dynamicQueue extends circularQueue{
    public dynamicQueue(){
        super();
    }

    public dynamicQueue(int x){
        super(x);
    }

    @Override
    public boolean insert(int element){
        //This takes care of it being full
        if(this.isFull()){
            //Create a new array with double the size
            int[] temp = new int[data.length * 2];

            //Copy all the previous elements
            for(int i = 0 ; i<data.length ; i++){
                temp[i] = data[(front+i)%data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        
        }

        //Insert item as at this point now the array is not full
        return super.insert(element);

    }
}
