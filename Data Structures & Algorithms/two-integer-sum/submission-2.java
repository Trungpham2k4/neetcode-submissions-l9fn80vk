class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Use hash table
        HashMap<Integer,Integer> map = new HashMap<>();
        int length = nums.length;
        int[] res = new int[2];
        for(int idx = 0; idx < length; idx++){
            if(map.containsKey(target - nums[idx])){
                res[0] = map.get(target-nums[idx]);
                res[1] = idx;
                break;
            }
            map.put(nums[idx], idx);
        }
        return res;
    }
}
