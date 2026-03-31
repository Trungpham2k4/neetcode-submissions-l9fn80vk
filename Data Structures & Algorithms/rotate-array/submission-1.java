class Solution {
    public void rotate(int[] nums, int k) {
        int newHead = nums.length - (k % nums.length);
        if (newHead == nums.length) newHead = 0;
        List<Integer> arr = new ArrayList<>();
        while(arr.size() != nums.length){
            arr.add(nums[newHead]);
            newHead++;
            if(newHead == nums.length) newHead = 0;
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = arr.get(i);
        }
    }
}