class Solution {
    public int trap(int[] height) {
        int[] prefix = new int[height.length]; // Left maximum for each position
        int[] suffix = new int[height.length]; // Right maximum for each position 
        
        int maximum = 0;
        for(int i = 0; i < height.length; i++){
            if(maximum < height[i]) maximum = height[i];
            else prefix[i] = maximum;
        }
        maximum = 0;
        for(int i = height.length - 1; i >= 0; i--){
            if(maximum < height[i]) maximum = height[i];
            else suffix[i] = maximum;
        }
        int res = 0;
        for (int i = 0; i < height.length; i++){
            if(prefix[i] == 0 || suffix[i] == 0) continue;
            res += Math.min(prefix[i], suffix[i]) - height[i];
        }
        return res;
    }
}
