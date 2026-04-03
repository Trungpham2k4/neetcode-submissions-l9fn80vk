class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Sliding window: Use sliding window with size = k or size = n if k > n 
        // If k == 0 return false as distinct indices always differ at least 1
        // Use a hashset to store nums 
        if (k == 0) return false;
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        k = k < n ? k + 1 : n;
        for(int i = 0; i < k; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                return true;
            }
        }
        for(int i = k; i < n; i++){
            set.remove(nums[i - k]);
            if(set.contains(nums[i])) return true;
            else set.add(nums[i]);
        }
        return false;
    }
}