//https://leetcode.com/contest/biweekly-contest-135/problems/find-the-winning-player-in-coin-game/

public class code1 {
    public static void main(String[] args) {
        
    }

    public String losingPlayer(int x, int y) {
        int target = 115;

        int totalTurns = 0;
        
        while(true){
            int coinsUsed = 0;
            if(x > 0 && target >= 75){
                int max75Coins = Math.min(x , target/75);
                coinsUsed += max75Coins * 75;
                x -= max75Coins;
            }
            if(y > 0 && (target-coinsUsed >= 10)){
                int max10Coins = Math.min(y,(target-coinsUsed)/10);
                coinsUsed += max10Coins * 10;
                y -= max10Coins;
            }

            if(coinsUsed < target){
                return totalTurns % 2 == 0 ? "Bob" : "Alice";
            }

            totalTurns++;
        }
    }
}
