class Solution {

    private int[] used = new int[100];
    private int[] arr = new int [100];
    private List<List<Integer>> res = new ArrayList<>();

    public void backtrack(int i, int n, int[] nums,List<Integer> accumulate){
        for(int j = 1; j <= n; j++){
            if(used[j] == 0){
                used[j] = 1;
                accumulate.add(nums[j-1]);
                if(i == n){
                    ArrayList<Integer> copy = new ArrayList<>(accumulate);
                    res.add(copy);
                }else{
                    backtrack(i+1, n, nums, accumulate);
                }
                used[j] = 0;
                accumulate.removeLast();
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        backtrack(1,nums.length,nums, new ArrayList<>());
        return res;
    }
}
