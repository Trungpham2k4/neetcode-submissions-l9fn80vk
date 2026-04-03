class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Naive solution: Check all pairs if it match all condition 
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j] && Math.abs(i-j) <= k){
                    return true;
                }
            }
        }
        return false;
    }
}