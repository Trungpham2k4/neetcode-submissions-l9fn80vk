class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < asteroids.length;i++){
            if(st.isEmpty()) st.push(i);
            else{
                int idx = st.peek();
                boolean canInsert = false;
                if(asteroids[idx] > 0 && asteroids[i] < 0){
                    while(!st.isEmpty() && asteroids[idx] > 0 && asteroids[i] < 0){
                        if(Math.abs(asteroids[i]) == asteroids[idx]){
                            st.pop();
                            canInsert = false;
                            break;
                        } else if (Math.abs(asteroids[i]) > asteroids[idx]){
                            st.pop();
                            canInsert = true;
                        } else{
                            canInsert = false;
                            break;
                        }
                        if(!st.isEmpty()){
                            idx = st.peek();
                        }
                    }
                    if(canInsert){
                        st.push(i);
                    }
                }else{
                    st.push(i);
                }
            }
        }
        int[] res;
        if(!st.isEmpty()){
            res = new int[st.size()];
            for(int i = st.size() - 1; i >= 0; i--){
                res[i] = asteroids[st.pop()];
            }
        }else{
            res = new int[0];
        }
        return res;
    }
}