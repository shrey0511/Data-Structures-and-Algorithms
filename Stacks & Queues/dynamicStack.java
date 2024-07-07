public class dynamicStack extends customStack {
    public dynamicStack(){
        super();
    }

    public dynamicStack(int x){
        super(x);
    }

    @Override
    public boolean push(int element) throws stackException{
        //This takes care of it being full
        if(this.isFull()){
            //Create a new array with double the size
            int[] temp = new int[data.length * 2];

            //Copy all the previous elements
            for(int i = 0 ; i<data.length ; i++){
                temp[i] = data[i];
            }
            data = temp;
        
        }

        //Insert item as at this point now the array is not full
        return super.push(element);

    }

}
