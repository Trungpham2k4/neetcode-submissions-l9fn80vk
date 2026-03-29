class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Naive solution
        int[] res = new int[2];
        for(int idx = 0; idx < nums.length; idx++){
            for(int j = idx + 1; j < nums.length; j++){
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
