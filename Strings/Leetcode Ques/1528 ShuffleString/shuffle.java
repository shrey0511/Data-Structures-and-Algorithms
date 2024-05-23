//https://leetcode.com/problems/shuffle-string/description/

public class shuffle {
    public static void main(String[] args) {
        
    }
    static String restoreString(String s, int[] indices) {
        int length = indices.length;
        char[] str = new char[length];
        for(int i=0;i<indices.length;i++){
            str[indices[i]]=s.charAt(i);
        }
        return String.valueOf(str);
    }
}
