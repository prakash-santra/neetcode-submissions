class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1)return 0;
        int profit = 0;
        int val = prices[0];
        for(int i=1; i<prices.length; i++){
            profit = Math.max(profit, prices[i] - val);
            val = Math.min(val, prices[i]);
        }
        return profit;
    }
}
