class Solution {
    public int missingInteger(int[] nums) {
        //int l = 0,r =1;
        ArrayList<Integer> li = new ArrayList<>();
        for(int n:nums){
            li.add(n);
        }
        int sum = 0;
        sum += nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]+1){
                sum += nums[i];
            }
            else{
                break;
            }
        }

        while(li.contains(sum)){
            sum++;
        }
        return sum;
        
    }
}