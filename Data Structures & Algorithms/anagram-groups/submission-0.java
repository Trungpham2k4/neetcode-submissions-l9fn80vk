class Solution {

    public boolean isAnagram(String str1, String str2){
        int[] counter = new int[26];
        int length1 = str1.length();
        for(int idx = 0; idx < length1; idx++){
            counter[str1.charAt(idx) - 'a']++;
        }
        int length2 = str2.length();
        for(int idx = 0; idx < length2; idx++){
            counter[str2.charAt(idx) - 'a']--;
        }
        int sum = 0;
        System.out.println(str1 + " " + str2);
        for (int num : counter){
            if(num != 0) return false;
        }

        System.out.println();
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        // Idea: Check each pair, if they are anagram of each other so put it into list 
        List<List<String>> res = new ArrayList<>();
        if (strs.length == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(strs[0]);
            res.add(list);
            return res;
        }
        boolean[] ignore = new boolean[strs.length];
        for (int idx = 0; idx < strs.length; idx++){
            if (ignore[idx]) continue;
            List<String> list = new ArrayList<>();
            list.add(strs[idx]);
            for (int j = idx + 1; j < strs.length; j++){
                if(isAnagram(strs[idx], strs[j])){
                    ignore[j] = true;
                    list.add(strs[j]);
                }
            }
            res.add(list);
        }
        return res;
    }
}
