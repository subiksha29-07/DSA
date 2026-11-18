class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(l<r){
            min = Math.min(height[l],height[r]);
            int b = r - l;
            max = Math.max(max,(b*min));
            if(height[l] <= height[r]){
                l++;
            }
            else{
                r--;
            }    
        }
        return max;
    }
}