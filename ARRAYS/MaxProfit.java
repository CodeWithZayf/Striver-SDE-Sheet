class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) { // Iterate through each price
            // Update the minimum price if the current price is lower
            if (price < minPrice) {
                minPrice = price; // Found a better buying day
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Found better profit
            }
        }
        return maxProfit;
    }
}
// This code calculates the maximum profit from stock prices given in an array.