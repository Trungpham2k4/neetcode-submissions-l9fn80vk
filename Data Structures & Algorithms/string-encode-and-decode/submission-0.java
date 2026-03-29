class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(String.valueOf(str.length()));
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int pointer = 0;
        int length = str.length();
        System.out.println(str);
        while(pointer < length){
            int numChar = 0;
            while(str.charAt(pointer) != '#'){
                numChar = numChar*10 + Integer.valueOf(str.charAt(pointer) - '0');
                pointer++;
            }
            pointer++;
            System.out.println(pointer + " " + numChar);
            String decode = str.substring(pointer, pointer + numChar);
            res.add(decode);
            pointer += numChar;
        }
        return res;
    }
}
