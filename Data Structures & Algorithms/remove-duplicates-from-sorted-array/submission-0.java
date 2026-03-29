class Solution {
    public int removeDuplicates(int[] nums) {
        int leftPtr = 0;
        int rightPtr = 1;
        int count = 1;
        while(rightPtr < nums.length){
            while(rightPtr < nums.length && nums[leftPtr] == nums[rightPtr]){
                rightPtr++;
            }
            if(rightPtr == nums.length) break;
            nums[leftPtr+1] = nums[rightPtr];
            leftPtr++;
            count++;
        }
        return count;
    }
}