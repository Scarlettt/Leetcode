package leetcode;

/***
����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i��ļ۸�
���һ���㷨�����������ܻ�ȡ�������������Ծ����ܵ���ɸ���Ľ��ף��������һ֧��Ʊ����
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
