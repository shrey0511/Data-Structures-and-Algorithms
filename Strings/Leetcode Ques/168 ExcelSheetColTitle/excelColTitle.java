//https://leetcode.com/problems/excel-sheet-column-title/description/

public class excelColTitle {
    public static void main(String[] args) {
        
    }
    static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            char c = (char)(columnNumber%26 +'A');
            columnNumber /= 26;
            sb.append(c);
        }
        return sb.reverse().toString();
    }
    
}
