public class FirstBadVersion_278 {
    public static void main(String[] args) {
        
    }
    static int firstBadVersion(int n) {
        int start=1,end=n,fbv=-1;
        while(start<=end){
            int mid=start + (end-start)/2;
            if(isBadVersion(mid)){  //was provided in the question
                fbv = mid;
                end = mid - 1;
            }else{
                start = mid+1;
            }
        }
        return fbv;
    }
}
