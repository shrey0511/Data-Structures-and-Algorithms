public class BinarySearchSquareRoot {
    public static void main(String[] args) {
        System.out.printf("%.3f",squareRoot(40, 3));
    }
    //Time : O(logn)
    static double squareRoot(int number , int precision){
        int start = 0 , end = number ;
        double root = 0.0;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(mid*mid>number){
                end = mid - 1;
            }else if(mid*mid<number){
                start = mid + 1;
            }else{
                return mid;
            } 
        }
        double inc = 0.1;
        //For decimal part
        for(int i=0;i<precision;i++){
            while(root*root<=number){
                root += inc;
            }
            //After exceeding the value we need to go one back
            root-=inc;
            inc /= 10;
        }
        return root;
    }
}
