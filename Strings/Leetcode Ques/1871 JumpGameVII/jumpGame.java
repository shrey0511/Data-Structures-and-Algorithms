//https://leetcode.com/problems/jump-game-vii/description/

import java.util.LinkedList;
import java.util.Queue;

public class jumpGame {
    public static void main(String[] args) {
        
    }
    static boolean canReach(String s, int minJump, int maxJump) {
        if(s.charAt(s.length()-1)!='0') return false;
        
        Queue<Integer>queue = new LinkedList<>();
        queue.add(0);

        int maxReach = 0;
        while(!queue.isEmpty()){
            int index = queue.remove();
            if(index==s.length()-1)
                return true;

            for(int j=Math.max(index+minJump,maxReach);j<=Math.min(index+maxJump,s.length()-1);j++){
                if(s.charAt(j)=='0')
                    queue.add(j);
            }
            maxReach = Math.min(index+maxJump+1,s.length()-1);
        }
        return false;
    }
}
