class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int num : nums){
            if (num != val) count++;
        }
        if (nums.length - count == nums.length) return count;
        if (count == nums.length) return count;
        int rightPtr = 0;
        int res = count;
        int leftPtr = 0;
        while(rightPtr < nums.length){
            while(rightPtr < nums.length && nums[rightPtr] == val) rightPtr++;
            if (rightPtr < nums.length){
                nums[leftPtr] = nums[rightPtr];
            }else{
                break;
            }
            leftPtr++;
            rightPtr++;
        }
        return res;
    }
}