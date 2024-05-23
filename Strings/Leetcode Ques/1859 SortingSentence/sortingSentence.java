//https://leetcode.com/problems/sorting-the-sentence/description/

public class sortingSentence {
    public static void main(String[] args) {
        
    }
    static String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] res = new String[str.length];
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(String element : str){
            i = (element.charAt(element.length()-1)-'0');
            res[i-1] = element.substring(0,element.length()-1);
        }
        for(i=0;i<res.length-1;i++){
            sb.append(res[i]).append(" ");
        }
        sb.append(res[i]);
        return sb.toString();
    }
}
