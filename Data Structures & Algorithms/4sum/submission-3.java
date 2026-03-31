class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 4) return res;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++){
            for(int j = i + 1; j < nums.length - 2; j++){
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
                        if(res.size() != 0){
                            if(!checkDuplicate(res, candidate)){
                                res.add(candidate);
                            }
                        }else{
                            res.add(candidate);
                        }
                        leftPtr++;
                        rightPtr--;
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
    private boolean checkDuplicate(List<List<Integer>> res, List<Integer> candidate){
        int length = res.size();
        for(int i = 0; i < length; i++){
            int firstCompare = res.get(i).get(0);
            int secondCompare = candidate.get(0);
            if(firstCompare > secondCompare) break;
            List<Integer> compare = res.get(i);
            if(compare.get(0).equals(candidate.get(0)) && compare.get(1).equals(candidate.get(1)) &&
            compare.get(2).equals(candidate.get(2)) && compare.get(3).equals(candidate.get(3))){
                return true;
            }
        }
        return false;
    }
}