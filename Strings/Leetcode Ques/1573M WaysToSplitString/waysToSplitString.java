//https://leetcode.com/problems/number-of-ways-to-split-a-string/description/

public class waysToSplitString {
    public static void main(String[] args) {
        
    }
    static int numWays(String s) {
        int ones = 0 ;
        for(int i=0;i<s.length();i++)
            ones += s.charAt(i) - '0';
            
        int n = s.length() , m = 1000000007;
        if(ones == 0)
            //split can be done on first zero then 
            //n-1-1 terms remain, can be done on 2nd 0
            //then n-2-1 terms remain and so on
            return (int)((n-2L)*(n-1L)/2 % m);
        if(ones % 3 != 0)
            return 0;
        
        long waysOfOneSplit = 0 , waysOfSecondSplit = 0;
        int onesInEachSplit = ones/3;
        for(int i=0,count=0 ; i<n ; ++i){
            count += s.charAt(i)-'0';
            if(count == onesInEachSplit)
                waysOfOneSplit++;
            else if(count == 2*onesInEachSplit){
                waysOfSecondSplit++;
            }
        }
        return (int)(waysOfOneSplit*waysOfSecondSplit % m);
    }
}
