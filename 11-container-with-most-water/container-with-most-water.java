class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(l< r){
            int width = r - l;
            min = Math.min(height[l],height[r]);
            max = Math.max(max,(min * width));
            if(height[l] > height[r]){
                r--;
            }
            else{
                l++;

            }
            
        }
        return max;
    }
}