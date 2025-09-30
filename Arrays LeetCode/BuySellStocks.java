public class BuySellStocks {

    // Optimal solution: O(n) time, O(1) space
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int minPrice = prices[0];   // track minimum price so far
        int maxProfit = 0;          // track maximum profit

        for (int i = 1; i < n; i++) {
            int cost = prices[i] - minPrice;          // profit if sold today
            maxProfit = Math.max(maxProfit, cost);    // update max profit
            minPrice = Math.min(minPrice, prices[i]); // update min price
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + maxProfit(prices));
    }
}


