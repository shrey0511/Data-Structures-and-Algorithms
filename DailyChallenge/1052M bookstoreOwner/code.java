//https://leetcode.com/problems/grumpy-bookstore-owner/?envType=daily-question&envId=2024-06-21

public class code {
    public static void main(String[] args) {
        
    }

    static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int currCust = 0 , maxCust = 0;
        int n = customers.length;

        //Not grumpy ones added
        for(int i = 0;i<n ; i++){
            if(grumpy[i] == 0)
                currCust += customers[i];
        }

        //Now for the grumpy ones
        int left = 0 , right = 0;
        for( ; right<n ; right++){
            if(grumpy[right] == 1){
                currCust += customers[right];
            }
            maxCust = Math.max(currCust , maxCust);
            if(right >= minutes-1){
                if(grumpy[left]==1){
                    currCust -= customers[left];
                }
                left++;
            }
        }
        return maxCust;
    }
}
