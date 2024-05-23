public class SquareRoot_69 {
    public static void main(String[] args) {
        System.out.println(sqRoot(1));
    }
    static int sqRoot(int x){
        if(x<2)
            return x;
        int start=1,end=x/2;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid*mid==x){
                return mid;
            }else if(mid*mid>x){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return end;
    }
}
