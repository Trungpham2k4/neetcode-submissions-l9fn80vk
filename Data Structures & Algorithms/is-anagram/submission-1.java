class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> mapS = new HashMap<>();
        HashMap<Character,Integer> mapT = new HashMap<>();
        int lengthS = s.length();
        int lengthT = t.length();
        for (int idx = 0; idx < lengthS; idx++){
            if(!mapS.containsKey(s.charAt(idx))){
                mapS.put(s.charAt(idx), 1);
            }else{
                mapS.put(s.charAt(idx), mapS.get(s.charAt(idx)) + 1);
            }
            if(!mapT.containsKey(t.charAt(idx))){
                mapT.put(t.charAt(idx), 1);
            }else{
                mapT.put(t.charAt(idx), mapT.get(t.charAt(idx)) + 1);
            }
        }

        for (Map.Entry<Character,Integer> entry : mapS.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println();

        // for (Map.Entry<Character,Integer> entry : mapT.entrySet()){
        //     System.out.println(entry.getKey() + " " + entry.getValue());
        // }

        for (Map.Entry<Character,Integer> entry : mapS.entrySet()){
            if(mapT.containsKey(entry.getKey())){
                if(mapT.get(entry.getKey()).equals(entry.getValue())){
                    mapT.remove(entry.getKey());
                    System.out.println("Size T: " + mapT.size());
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return mapT.size() == 0;
    }
}
