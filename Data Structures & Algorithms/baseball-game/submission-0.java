class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String op : operations){
            if(op.equals("D")){
                int val1 = st.peek();
                st.push(val1 * 2);
            }
            else if(op.equals("+")){
                int val1 = st.pop();
                int val2 = st.peek();
                st.push(val1);
                st.push(val1 + val2);
            }
            else if(op.equals("C")){
                st.pop();
            }else{
                st.push(Integer.valueOf(op));
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            int val = st.pop();
            sum += val;
        }
        return sum;
    }
}