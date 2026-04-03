class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // Idea: Use hashmap to store frequencies of char in s1, then use it to check with s2 
        // Create another map to store frequencies when use sliding window 
        // Use sliding window of size s1 to check 
        int length1 = s1.length();
        int length2 = s2.length();
        if (length1 > length2) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < length1; i++){
            if(map1.containsKey(s1.charAt(i))){
                map1.put(s1.charAt(i), map1.get(s1.charAt(i)) + 1);
            }else{
                map1.put(s1.charAt(i), 1);
            }
        }
        for(int i = 0; i < length1; i++){
            if(map2.containsKey(s2.charAt(i))){
                map2.put(s2.charAt(i), map2.get(s2.charAt(i)) + 1);
            }else{
                map2.put(s2.charAt(i), 1);
            }
        }
        if (checkEqualMap(map1,map2)) return true;
        for(int i = length1; i < length2; i++ ){
            map2.put(s2.charAt(i - length1), map2.get(s2.charAt(i - length1)) - 1);
            if (map2.get(s2.charAt(i - length1)) == 0) map2.remove(s2.charAt(i - length1));
            if (map2.containsKey(s2.charAt(i))){
                map2.put(s2.charAt(i), map2.get(s2.charAt(i)) + 1);
            }else{
                map2.put(s2.charAt(i), 1);
            }
            if (checkEqualMap(map1, map2)) return true;
        }
        return false;
    }

    public boolean checkEqualMap(Map<Character, Integer> map1, Map<Character, Integer> map2){
        if (map1.size() != map2.size()) return false;
        boolean track = true;
        for(Map.Entry<Character,Integer> e : map1.entrySet()){
            if (map2.get(e.getKey()) == null){
                return false;
            }
            track = track && (map2.get(e.getKey()).equals(e.getValue()));
        }
        return track;
    }
}
