class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int lengthArr = nums.length;
        for (int idx = 0; idx < lengthArr; idx++){
            set.add(nums[idx]);
        }
        return set.size() != lengthArr;
    }
}