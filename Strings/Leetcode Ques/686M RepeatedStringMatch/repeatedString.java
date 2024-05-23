//https://leetcode.com/problems/repeated-string-match/description/

//'a' was subtracted so that index value can be driven out of the character
public class repeatedString {
    public static void main(String[] args) {
        
    }
    static int repeatedStringMatch(String a, String b) {
        boolean[] bucket = new boolean[26];

        for(char c : a.toCharArray()){
            bucket[c - 'a'] = true;
        }
        for(char c : b.toCharArray()){
            if(!bucket[c - 'a']) return -1;
        }
        int count = b.length()/a.length();
        StringBuilder sb = new StringBuilder(a.repeat(count));
        for(int i =0 ; i<10 ; i++){
            if(sb.indexOf(b)>=0) return count+i;
            sb.append(a);
        }
        return -1;
    }
}
