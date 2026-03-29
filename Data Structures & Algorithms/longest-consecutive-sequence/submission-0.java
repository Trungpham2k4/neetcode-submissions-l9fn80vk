class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num,1);
        }
        int longest = 0;
        for (Map.Entry<Integer,Integer> e : map.entrySet()){
            int count = 1;
            int curKey = e.getKey();
            while(true){
                if(map.containsKey(curKey + 1)){
                    count++;
                }else{
                    break;
                }
                curKey++;
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
}
