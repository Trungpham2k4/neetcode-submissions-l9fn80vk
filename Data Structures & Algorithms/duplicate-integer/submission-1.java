class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int length = nums.length;
        for (int idx = 0; idx < length; idx++){
            if(map.containsKey(nums[idx])){
                return true;
            }
            map.put(nums[idx], 1);
        }
        return false;
    }
}