class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Naive solution: Find longest substring at each position
        // Time complexity: O(N^2), Space complexity: O(N)
        int res = 0;
        int n = s.length();
        for(int i = 0; i < n; i++){
            int count = 1;
            HashSet<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            res = Math.max(count,res);
            for(int j = i + 1; j < n; j++){
                if(!set.contains(s.charAt(j))){
                    count++;
                    res = Math.max(res,count);
                    set.add(s.charAt(j));
                }else{
                    break;
                }
            }
        }
        return res;
    }
}
