//https://leetcode.com/problems/maximum-repeating-substring/description/

public class repeatingSubstring {
    public static void main(String[] args) {
        String sequence = "ababc", word = "ab";
        System.out.println(maxRepeating(sequence, word));
    }   
    static int maxRepeating(String sequence, String word) {
        int m = sequence.length() , n = word.length();
        int max=0;
        for(int i=0;i<m;i++){
            int count = 0 , k = 0;
            for(int j=i;j<m;j++){
                if(sequence.charAt(j)==word.charAt(k)) k++;
                else break;
                if(k==n){
                    k=0;
                    count++;
                }
            }
            max =  Math.max(max,count);
        }
        return max;
    } 
}
