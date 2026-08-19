class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0,r= 1;
        while(r<nums.length){
            if(nums[l] == 0 && nums[r] ==0){
                r++;
            }
            else if(nums[r] ==0){
                l=r;
                r++;
            }
            else if(nums[l]==0){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r++;
            }
            else{
                l++;
                r++;
            }
        }
    }
}