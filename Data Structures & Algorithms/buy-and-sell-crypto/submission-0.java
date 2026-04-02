class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int min_price = 1000;
        for(int i = 0; i < prices.length; i++){
            if(min_price > prices[i]){
                min_price = prices[i];
            }else{
                res = Math.max(res, prices[i] - min_price);
            }
        }


        return res;
    }
}
