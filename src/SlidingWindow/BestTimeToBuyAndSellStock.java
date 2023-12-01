package SlidingWindow;

/*
    Problem 121
    You are given an array prices where prices[i] is the price of a
    given stock on the ith day.
    You want to maximize your profit by choosing a single day to buy
    one stock and choosing a different day in the future to sell that stock.
    Return the maximum profit you can achieve from this transaction.
    If you cannot achieve any profit, return 0.
 */

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        int ptrLeft = 0;
        int ptrRight = 1;
        int profit;
        int maxProfit = 0;

        while (ptrRight < prices.length) {

            if (prices[ptrLeft] < prices[ptrRight]) {
                profit = prices[ptrRight] - prices[ptrLeft];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                ptrLeft = ptrRight;
            }
            ptrRight++;
        }

        return maxProfit;

    }

}
