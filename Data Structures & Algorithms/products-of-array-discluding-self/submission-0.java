class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int [nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        for(int i = 0; i < nums.length;i++){
            if (i == 0) left[i] = nums[i];
            else left[i] = left[i-1] * nums[i];
        }
        for(int i = nums.length - 1; i >= 0; i--){
            if (i == nums.length - 1) right[i] = nums[i];
            else right[i] = right[i+1] * nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            if(i == 0) res[i] = right[i+1];
            else if(i == nums.length - 1) res[i] = left[i - 1];
            else res[i] = left[i - 1] * right[i + 1];
        }
        return res;
    }
}  
