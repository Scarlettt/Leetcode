package leetcode;

/***
给定一个数组，它的第 i 个元素是一支给定股票第 i天的价格。
设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
122
***/

public class StockMaxProfit_2 {
	public int maxProfit(int[] prices) {
        int profit;
        profit = 0;
        for(int i = 1;i <= prices.length-1;i++){
            if(prices[i] > prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}
