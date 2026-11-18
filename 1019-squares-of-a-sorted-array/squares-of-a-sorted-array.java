class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        int i = 0;
        int j = nums.length - 1;
        int[] temp = new int[nums.length];
        int k = nums.length - 1;
        while(i<=j){
            if(nums[i] <= nums[j]){
                temp[k] = nums[j];
                j--;
                k--; 
            }
            else{
                temp[k] = nums[i];
                i++;
                k--;
            }
        }
        return temp;
        
    }
}