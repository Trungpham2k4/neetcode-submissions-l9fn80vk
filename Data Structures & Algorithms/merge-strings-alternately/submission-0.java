class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int ptr1 = 0;
        int ptr2 = 0;
        int length1 = word1.length();
        int length2 = word2.length();
        while(ptr1 < length1 && ptr2 < length2){
            sb.append(String.valueOf(word1.charAt(ptr1)));
            sb.append(String.valueOf(word2.charAt(ptr2)));
            ptr1++;
            ptr2++;
        }
        if(ptr1 < length1){
            sb.append(word1.substring(ptr1));
        }
        if(ptr2 < length2){
            sb.append(word2.substring(ptr2));
        }
        return sb.toString();
    }
}