class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Idea: Use hashmap to store nums as key and indexes as value 
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }else{
                int prevIdx = map.get(nums[i]);
                if(Math.abs(prevIdx - i) <= k){
                    return true;
                }else{
                    map.put(nums[i], i);
                }
            }
        }
        return false;
    }
}