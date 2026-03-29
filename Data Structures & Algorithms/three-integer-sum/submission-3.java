class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int currVal = 1000000;
        for(int i = 0; i < nums.length - 2; i++){
            if(currVal == nums[i]) continue;
            currVal = nums[i];
            int leftPtr = i + 1;
            int rightPtr = nums.length - 1;
            while(leftPtr < rightPtr){
                List<Integer> candidate = new ArrayList<>();
                if(nums[leftPtr] + nums[rightPtr] + nums[i] > 0){
                    rightPtr--;
                }else if(nums[leftPtr] + nums[rightPtr] + nums[i] < 0){
                    leftPtr++;
                }else{
                    candidate.add(nums[i]);
                    candidate.add(nums[leftPtr]);
                    candidate.add(nums[rightPtr]);
                    if(res.size() != 0){
                        List<Integer> compare = res.get(res.size() - 1);
                        if(compare.get(0) != candidate.get(0) || 
                        compare.get(1) != candidate.get(1) ||
                        compare.get(2) != candidate.get(2)){
                            res.add(candidate);
                        }
                    }else{
                        res.add(candidate);
                    }
                    leftPtr++;
                    rightPtr--;
                }
            }
        }
        return res;
    }
}
