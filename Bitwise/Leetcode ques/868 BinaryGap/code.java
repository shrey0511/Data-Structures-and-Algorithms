//https://leetcode.com/problems/binary-gap/description/

public class code {
    public static void main(String[] args) {
        
    }
    static int binaryGap(int x){
        int indexOne = -1 , longestDist = 0;
        for(int i=0;i<32;i++){
            if(((x>>i)&1)==1){
                if(indexOne!=-1){
                    longestDist = Math.max(longestDist,i-indexOne);
                }
                indexOne = i;
            }
        }
        return longestDist;
    }
}
