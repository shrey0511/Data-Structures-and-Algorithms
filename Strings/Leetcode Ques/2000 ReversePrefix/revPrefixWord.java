//https://leetcode.com/problems/reverse-prefix-of-word/description/

public class revPrefixWord {
    public static void main(String[] args) {
        String word = "abcdefd"; char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }   
    static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(index==-1)
            return word;
        else{
            return reverse(index,index+1,word);
        } 
    }
    static String reverse(int i,int j,String word){
        StringBuilder sb = new StringBuilder();
        while(i>=0){
            sb.append(word.charAt(i--));
        }
        while(j<word.length()){
            sb.append(word.charAt(j++));
        }
        return sb.toString();
    } 
}
