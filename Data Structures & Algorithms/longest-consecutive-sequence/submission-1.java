class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            map.put(num,1);
        }
        for (Map.Entry<Integer,Integer> e : map.entrySet()){
            if(!map.containsKey(e.getKey() - 1)){
                set.add(e.getKey());
            }
        }

        int longest = 0;
        for(int num : set){
            int count = 1;
            int currKey = num;
            while(true){
                if(map.containsKey(currKey + 1)){
                    count++;
                }else{
                    break;
                }
                currKey++;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}
