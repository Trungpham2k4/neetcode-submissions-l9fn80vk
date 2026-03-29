class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Naive solution (Time complexity: O(N^2), S)
        int[] res = new int[2];
        int length = nums.length;
        for(int idx = 0; idx < length; idx++){
            for(int j = idx + 1; j < length; j++){
                if (nums[idx] + nums[j] == target){
                    res[0] = idx;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }
}
