//https://leetcode.com/problems/binary-watch/description/

import java.util.ArrayList;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }
    static List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList();
        for(int hour=0;hour<12;hour++){
            for(int minute=0;minute<60;minute++){
                if(Integer.bitCount(hour)+Integer.bitCount(minute) == turnedOn){
                    if(minute<10) ans.add(String.format("%d:0%d",hour,minute));
                    else ans.add(String.format("%d:%d",hour,minute));
                }   
            }
        }
        return ans;
    }
}
