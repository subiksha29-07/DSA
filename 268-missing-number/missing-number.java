class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int i : nums){
            s.add(i);
        }
        int i = 0 ;
        while(s.contains(i)){
            i++;
        }
        return i;
    }
}