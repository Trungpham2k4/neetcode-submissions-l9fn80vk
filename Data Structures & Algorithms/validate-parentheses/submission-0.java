class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            } else if(st.isEmpty()){
                return false;
            } else {
                char open = st.pop();
                if (open == '(' && c != ')') return false;
                if (open == '[' && c != ']') return false;
                if (open == '{' && c != '}') return false;
            }
        }
        if (!st.isEmpty()) return false;
        return true;
    }
}
