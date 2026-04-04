class Solution {
    public int characterReplacement(String s, int k) {
        // Idea: Apply sliding window with each character (just unique using hashset) 
        // -> The size of sliding window will be right - left + 1 
        // -> Then minus count so it <= k 
        // -> count is number of character that equal the character 
        // -> right - left + 1 - count = number of chars that differ from the target char 
        
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            set.add(s.charAt(i));
        }
        int res = 0;
        for (char c : set){
            int leftPtr = 0;
            int rightPtr = 0;
            int count = 0;
            while(rightPtr < n){
                if (s.charAt(rightPtr) != c){
                    while(rightPtr - leftPtr + 1 - count > k){
                        if(s.charAt(leftPtr) == c) count--;
                        leftPtr++;
                    }
                }else{
                    count++;
                }
                res = Math.max(res, rightPtr - leftPtr + 1);
                rightPtr++;
            }
        }
        return res;

    }
}
