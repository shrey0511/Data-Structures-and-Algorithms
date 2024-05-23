//https://leetcode.com/problems/long-pressed-name/description/

public class pressedName {
    public static void main(String[] args) {
        
    }
    static boolean isLongPressedName(String name, String typed) {
        int m = name.length() , n = typed.length();
        int i=0,j=0;
        while(i<m && j<n){
            char c1 = name.charAt(i) , c2 = typed.charAt(j);
            if(c1!=c2) return false;
            
            int count1 = 0;
            while(i<m && c1==name.charAt(i)){
                count1++;
                i++;
            }
            int count2 = 0;
            while(j<n && c2==typed.charAt(j)){
                count2++;
                j++;
            }

            if(count2 < count1) return false;

        }
        return i==m && j==n;
    }
}
