//https://leetcode.com/problems/robot-return-to-origin/

public class robot {
    public static void main(String[] args) {
        
    }
    static boolean judgeCircle(String moves) {
        int hr=1,v=1;
        char[] a=moves.toCharArray();
        for(char i:a)
        {
            if(i=='L')
                hr--;
            else if(i=='R')   
                hr++;
            else if(i=='U')    
                v++;
            else if(i=='D')
                v--;     
        }
        if(hr==1&&v==1)
            return true;
        else
            return false;    
    }
}
