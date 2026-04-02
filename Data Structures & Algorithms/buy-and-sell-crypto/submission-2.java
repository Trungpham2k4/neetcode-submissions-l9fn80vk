class Solution {
    public int maxProfit(int[] prices) {
        // Idea: Always update minimum value at each position, if cannot update 
        // -> prices at that position greater than min so calculate the difference 
        // -> then update max of profit
        // -> Time complexity: O(N), Space complexity: O(1)
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
