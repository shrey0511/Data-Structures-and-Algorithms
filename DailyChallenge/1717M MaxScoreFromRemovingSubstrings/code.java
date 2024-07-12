//https://leetcode.com/problems/maximum-score-from-removing-substrings/?envType=daily-question&envId=2024-07-12

class code{
    public static void main(String[] args) {
        
    }

    static int maximumGain(String s, int x, int y) {
        if(x < y){//Ensuring x to be greater all the time
            int temp = x;
            x = y;
            y = temp;
            s = new StringBuilder(s).reverse().toString();
        }

        int aCount = 0 , bCount = 0 , totalPoints = 0;

        for(char c : s.toCharArray()){
            if(c == 'a'){
                aCount++;
            }else if(c == 'b'){
                if(aCount > 0){
                    //ab can be formed
                    aCount--;
                    totalPoints += x;
                }else{
                    //keep the b for later ba pairs
                    bCount++;
                }
            }else{
                //Characters other than a and b are encountered
                //Just count the ba pairs untill now and reset the counters
                totalPoints += Math.min(aCount , bCount) * y;
                aCount = 0; bCount = 0;
            }
        }
        //There can still be pairs remaining so for that
        totalPoints += Math.min(aCount , bCount) * y;

        return totalPoints;
    }
}