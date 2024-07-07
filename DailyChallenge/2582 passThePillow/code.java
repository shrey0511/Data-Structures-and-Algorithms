public class code {
    public static void main(String[] args) {
        
    }

    static int passThePillow(int n , int time){
        int completed = time / (n-1);
        int rem = time % (n-1);

        int ans = 0;
        if(completed % 2 != 0){
            ans = n - rem;
        }else{
            ans = 1 + rem;
        }
        return ans;
    }    
    
    static int passThePillow2(int n, int time) {
        int direction = 1 , i = 1+1;
        time = time-1;
        while(time > 0){
            if(i == 1 || i == n){
                direction *= -1;
            }
            if(direction > 0){
                i++;
            }else{
                i--;
            }
            time--;
        }
        return i;
    }
}
