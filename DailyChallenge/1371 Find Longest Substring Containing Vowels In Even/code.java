//https://leetcode.com/problems/find-the-longest-substring-containing-vowels-in-even-counts/?envType=daily-question&envId=2024-09-15

public class code {
    public static void main(String[] args) {
        
    }

    public int findTheLongestSubstring(String s) {
        int[] mapy = new int[32];
        Arrays.fill(mapy,-2);
        mapy[0] = -1;

        int maxLen = 0 , mask = 0;

        for(int i = 0 ; i<s.length() ; i++){
            char c = s.charAt(i);

            switch(c){
                case 'a':
                    mask ^= 1;
                    break;
                case 'e':
                    mask ^= 2;
                    break;
                case 'i':
                    mask ^= 4;
                    break;
                case 'o':
                    mask ^= 8;
                    break;
                case 'u':
                    mask ^= 16;
                    break;
            }
            int prev = mapy[mask];
            if(prev == -2){
                mapy[mask] = i;
            }else{
                maxLen = Math.max(maxLen , i-prev);
            }
        }
        return maxLen;
    }
}
