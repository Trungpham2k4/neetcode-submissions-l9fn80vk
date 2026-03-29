class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
            else {
                map.put(num, 1);
            }
            
        }
        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() > nums.length / 3){
                res.add(e.getKey());
            }
        }
        return res;
    }
}