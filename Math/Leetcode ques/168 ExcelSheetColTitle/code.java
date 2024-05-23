//https://leetcode.com/problems/excel-sheet-column-title/description/

public class code {
    public static void main(String[] args) {
        System.out.println(convertToTitle(28));
    }
    static String convertToTitle(int columnNumber){
        StringBuilder ans = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            char c = (char)(columnNumber%26 + 'A');
            columnNumber /= 26;
            ans.append(c);
        }
        return ans.reverse().toString();
    }
}
