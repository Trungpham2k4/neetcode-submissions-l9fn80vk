class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Double iteration -> 1st to find shortest string, 2nd to loop through all substrings
        // Base case length of array = 1 => return str[0]

        if (strs.length == 1) return strs[0];

        String shortest = strs[0];
        int length = strs.length;
        for(int idx = 1; idx < length; idx++){
            if (strs[idx].length() < shortest.length()){
                shortest = strs[idx];
            }
        }
        String res = "";
        for(int idx = 0; idx < shortest.length(); idx++){
            String check = shortest.substring(0, idx + 1);
            for(int j = 0; j < length; j++){
                if(!strs[j].startsWith(check)){
                    return res;
                }
            }
            res = check;
        }
        return res;
    }
}