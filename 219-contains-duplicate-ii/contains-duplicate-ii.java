class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> h = new LinkedHashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                int prev = h.get(nums[i]);
                if(i - prev <= k){
                    return true;
                }
            }
            h.put(nums[i],i);
        }
        return false;
    }
}