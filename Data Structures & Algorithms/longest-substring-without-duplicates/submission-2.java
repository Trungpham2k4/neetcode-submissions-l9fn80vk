class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Idea: Use dynamic sliding window + hashset
        // -> Use left and right pointers to iterate, right pointer always go ahead
        // If set does not have any element then push char to it
        // It it has then check if the set contains or not 
        // If it contains then capture the longest value and add left by 1, reduce current 
        // length by 1

        int res = 0;
        int leftPtr = 0;
        int rightPtr = 0;
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        while(rightPtr < n){
            if(!set.contains(s.charAt(rightPtr))){
                set.add(s.charAt(rightPtr));
                res = Math.max(res, rightPtr - leftPtr + 1);
            }else{
                while(set.contains(s.charAt(rightPtr))){
                    set.remove(s.charAt(leftPtr));
                    leftPtr++;
                }
                set.add(s.charAt(rightPtr));
            }
            rightPtr++;
        }
        return res;
    }
}
