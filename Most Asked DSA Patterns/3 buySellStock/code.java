//https://www.geeksforgeeks.org/best-time-to-buy-and-sell-stock/

class code{
    public static void main(String[] args) {
        int[] prize = {7,1,5,6,4};
        int n = prize.length;
        System.out.println(maxProfit(prize, n));
    }

    //In a day you can only buy or sell a stock
    static int maxProfit(int[] prize,int n){
        int buy = prize[0];
        int profit = 0;
        for(int i = 1 ; i<n ; i++){
            if(prize[i] < buy)
                buy = prize[i];
            else if(prize[i] - buy > profit )
                profit = prize[i] - buy;
        }
        return profit;
    }


    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
    //Same day sell and buy the stock
    static int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;
        int profit = 0;
        int prize = prices[0];
        for(int i = 1 ; i<prices.length ; i++){
            if(prices[i]<prize)
                prize = prices[i];
            else if(prices[i] > prize){
                profit += (prices[i]-prize);
                prize = prices[i];
            }
        }
        return profit;
    }
}