class Solution {
    public int trap(int[] height) {
        // Idea: Monotonic stack 
        Stack<Integer> st = new Stack<>();
        int res = 0;
        for(int i = 0; i < height.length; i++){
            while (!st.isEmpty() && height[i] >= height[st.peek()]){
                int bottom = st.pop();
                if(!st.isEmpty()){
                    int leftWall = st.peek();
                    int high = Math.min(height[i], height[leftWall]) - height[bottom];
                    res += (i - leftWall - 1) * high;
                }
            }
            st.push(i);
        }
        return res;
    }
}
