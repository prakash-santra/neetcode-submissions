class Solution {
    public int maxArea(int[] heights) {
        int start = 0, end = heights.length-1;
        int water = 0;
        while(start < end){
            water = Math.max(water, (end-start) *
                            Math.min(heights[start], heights[end]));
            if(heights[start] < heights[end]){
                start++;
            }else{
                end--;
            }
        }
        return water;
    }
}


// 1 7 2 5 4 7 8 7 6