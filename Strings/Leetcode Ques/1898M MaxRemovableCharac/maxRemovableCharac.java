//https://leetcode.com/problems/maximum-number-of-removable-characters/description/

public class maxRemovableCharac {
    public static void main(String[] args) {
        
    }
    static int maximumRemovals(String s, String p, int[] removable) {
        char[] sArr = s.toCharArray();
        char[] pArr = p.toCharArray();

        int left = 0 , right = removable.length-1;
        //We use binary search to get the max K for which s still contains p
        while(left<=right){
            int mid = left + right-left/2;
            for(int k=left;k<=mid;k++){
                sArr[removable[k]]='.';
            }
            if(isSubSeq(sArr,pArr)){
                left = mid + 1; //Try Removing more if it is a subSequence
            }else{
                for(int k=left ; k<=mid ; k++){
                    sArr[removable[k]] = s.charAt(removable[k]);
                }
                right = mid - 1; //Remove less when it is not a subSequence
            }
        }
        return left;
    }
    static boolean isSubSeq(char[] s , char[] p){
        int i = 0 , j = 0;
        while(i<s.length && j<p.length){
            if(s[i]==p[j]){
                i++;
                j++;
            }else
                i++;
        }
        return j==p.length;
    }
}
