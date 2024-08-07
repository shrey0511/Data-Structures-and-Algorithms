//https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/?envType=daily-question&envId=2024-08-06

public class code {
    public static void main(String[] args) {
        
    }

    public int minimumPushes(String word) {
        int[] count = new int[26];

        for(char c : word.toCharArray()){
            ++count[c - 'a'];
        }

        Arrays.sort(count);

        int push = 0;
        for(int i = 0 ; i<26 ; i++){
            push += count[26-i-1] * ((i/8)+1);
        }

        return push;
    }
}
