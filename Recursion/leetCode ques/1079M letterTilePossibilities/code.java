//https://leetcode.com/problems/letter-tile-possibilities/

import java.util.Arrays;

public class code {
    public static void main(String[] args) {
        
    }

    int count = 0;

    public int numTilePossibilities(String tiles) {
        char[] chars = tiles.toCharArray();
        Arrays.sort(chars);
        helper(chars , new boolean[chars.length]);
        //remove empty one
        return count - 1;
    }

    private void helper(char[] chars , boolean[] used ){
        count++;
        for(int i = 0 ; i<chars.length ; i++){
            if(used[i] || i>0 && chars[i] == chars[i-1] && !used[i-1])
                continue;
            used[i] = true;
            helper(chars , used);
            used[i] = false;
        }
    }
}
