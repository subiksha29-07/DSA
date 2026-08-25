class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
       // System.out.println(nums);
        Set<Integer> s = new LinkedHashSet<>();
        int n = nums.length;
      
        for(int j =0;j<n;j++){
            if(nums[j] % k == 0){
                s.add(nums[j]);
            }
        }
        for(int j =1;j<=n+1;j++){
            if(s.contains(k*j)){
                continue;
            }
            else{
                return k*j;
            }
        }
        return -1;
    }
}