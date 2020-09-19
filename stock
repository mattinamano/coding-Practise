O(n)

Iterative

class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            minSoFar = Math.min(minSoFar, price);
            maxProfit = Math.max(maxProfit, price - minSoFar);
        }

        return maxProfit;
    }
}
Recursive

class Solution {
        public int maxProfit(int[] prices) {
            return helper(prices, 0, Integer.MAX_VALUE, 0);
        }

        private int helper(int[] prices, int i, int minStockPrice, int maxProfit) {
            if (i == prices.length)
                return maxProfit;
            maxProfit = Math.max(maxProfit, prices[i] - minStockPrice);
            minStockPrice = Math.min(minStockPrice, prices[i]);
            return helper(prices, i + 1, minStockPrice, maxProfit);
        }
    }
