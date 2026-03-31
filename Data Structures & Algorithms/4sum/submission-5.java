class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 4) return res;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++){
            if (i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i + 1; j < nums.length - 2; j++){
                if (j > i + 1 && nums[j] == nums[j-1]) continue;
                int leftPtr = j + 1;
                int rightPtr = nums.length - 1;
                while(leftPtr < rightPtr){
                    List<Integer> candidate = new ArrayList<>();
                    long sum = (long)nums[i] + nums[j] + nums[leftPtr] + nums[rightPtr];
                    if (sum == target){
                        candidate.add(nums[i]);
                        candidate.add(nums[j]);
                        candidate.add(nums[leftPtr]);
                        candidate.add(nums[rightPtr]);
                        res.add(candidate);
                        leftPtr++;
                        rightPtr--;
                        while (leftPtr < rightPtr && nums[leftPtr] == nums[leftPtr - 1]) leftPtr++;
                        while (leftPtr < rightPtr && nums[rightPtr] == nums[rightPtr + 1]) rightPtr--;
                    }else if (nums[i] + nums[j] + nums[leftPtr] + nums[rightPtr] > target){
                        rightPtr--;
                    }else{
                        leftPtr++;
                    }
                }
            }
        }
        return res;
    }
}