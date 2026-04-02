class Solution {
    public int maxProfit(int[] prices) {
        // Naive solution: At each loop calculate difference of price at current position 
        // with all position after that 
        // Time complexity: O(N^2), Space complexity: O(1)
        int res = 0;
        for(int i = 0; i < prices.length - 1; i++){
            for(int j = i + 1; j < prices.length; j++){
                res = Math.max(res, prices[j] - prices[i]);
            }
        }
        return res;
    }
}
