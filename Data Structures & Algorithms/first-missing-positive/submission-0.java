class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, 1);
        }
        for (int i = 1; i <= 100000; i++){
            if (!map.containsKey(i)) return i;
        }
        return 100001;
    }
}