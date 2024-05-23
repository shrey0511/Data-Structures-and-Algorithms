//https://leetcode.com/problems/number-complement/description/

public class code {
    public static void main(String[] args) {
        
    }
    static int findComplement(int num) {
        int count = 0 , temp = num;
        while(temp>0){
            temp = temp>>1;
            count++;
        }
        //Creating the mask
        int mask = (1<<count)-1;
        //This will give us for example for 5(101),
        //we get 100 - 1 = 111
        return num^mask;
    }
}
