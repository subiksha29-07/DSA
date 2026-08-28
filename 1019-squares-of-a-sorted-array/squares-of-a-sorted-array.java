import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        int[] arr = new int[n];
        int k = n-1;
        while(l<=r){
            int ls = nums[l] * nums[l];
            int rs = nums[r] * nums[r];
            if(ls > rs){
                arr[k] = ls;
                l++;
            }
            else{
                arr[k] = rs;
                r--;
            }
            k--;
        }
        return arr;
        
    }
}