
public class code {
    public static void main(String[] args) {
        
    }   
    static int minEatingSpeed(int[] piles, int h) {
        int left=1,right=1000000000;
        while(left<right){
            int mid=left+(right-left)/2;
            if(canEatInTime(piles,mid,h)){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
    static boolean canEatInTime(int[] arr,int mid,int h){
        int hours=0;
        for(int pile:arr){
            int div = pile/mid;
            hours+=div;
            if(pile%mid!=0)
                hours++;
        }
        return hours<=h;
    } 
}
