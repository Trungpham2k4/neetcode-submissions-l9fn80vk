class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        for (int idx = 0; idx < nums.length; idx++){
            if(nums[idx] != val){
                list.add(nums[idx]);
            }
        }
        for (int idx = 0; idx < list.size(); idx++){
            nums[idx] = list.get(idx);
        }
        return list.size();
    }
}