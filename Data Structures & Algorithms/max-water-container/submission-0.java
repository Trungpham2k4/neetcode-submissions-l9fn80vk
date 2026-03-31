class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int leftPtr = 0;
        int rightPtr = heights.length - 1;
        while(leftPtr < rightPtr){
            int area = Math.min(heights[leftPtr], heights[rightPtr]) * (rightPtr - leftPtr);
            maxArea = Math.max(area, maxArea);
            if(heights[leftPtr] <= heights[rightPtr]) leftPtr++;
            else rightPtr--;
        }
        return maxArea;
    }
}
