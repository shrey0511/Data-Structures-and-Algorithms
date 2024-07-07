//https://leetcode.com/problems/water-bottles/?envType=daily-question&envId=2024-07-07

public class code {
    public static void main(String[] args) {
        
    }

    private int ans = 0; // Use an instance variable to store the result

    public int numWaterBottles(int numBottles, int numExchange) {
        // Reset the answer for each new calculation
        ans = 0;
        return drink(numBottles, numExchange);
    }

    private int drink(int numBottles, int numExchange) {
        if (numBottles < numExchange) {
            ans += numBottles;
            return ans;
        }

        ans += numBottles - (numBottles % numExchange);

        // Calculate the new number of bottles after drinking and exchanging
        int remBottles = (numBottles / numExchange) + (numBottles % numExchange);
        
        // Recursive call with the new number of bottles
        return drink(remBottles, numExchange);
    } 
}
