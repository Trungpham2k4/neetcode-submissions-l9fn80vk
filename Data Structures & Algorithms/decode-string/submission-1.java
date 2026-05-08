class Solution {
    public String decodeString(String s) {
        Stack<String> decode = new Stack<>();
        Stack<Integer> nums = new Stack<>();
        for(int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                int sum = 0;
                while(s.charAt(i) != '['){
                    c = s.charAt(i);
                    sum = sum * 10 + Integer.valueOf(c - '0');
                    i++;
                }
                nums.push(sum);
                decode.push("[");
            }else{
                if (c == ']'){
                    StringBuilder acc = new StringBuilder();
                    while(!decode.isEmpty()){
                        String pop = decode.pop();
                        if(pop.equals("[")) break;
                        acc.insert(0, pop);
                    }
                    String raw = acc.toString();
                    int repeat = nums.pop();
                    StringBuilder finalStr = new StringBuilder();
                    for(int j = 1; j <= repeat; j++){
                        finalStr.append(raw);
                    }
                    decode.push(finalStr.toString());
                }else{
                    decode.push(String.valueOf(c));
                }
            }
        }
        StringBuilder merge = new StringBuilder();
        while(!decode.isEmpty()){
            merge.insert(0, decode.pop());
        }
        return merge.toString();
    }
}