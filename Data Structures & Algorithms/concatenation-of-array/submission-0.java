class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] solution = new int[length * 2];
        for(int index = 0; index < length; index++){
            solution[index] = nums[index];
            solution[index + length] = nums[index];
        }
        return solution;
    }
}