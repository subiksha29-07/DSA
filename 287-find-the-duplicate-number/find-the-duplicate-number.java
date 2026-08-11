class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> m = new LinkedHashMap<>();
        for(int i : nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(int key : m.keySet()){
            if(m.get(key) > 1){
                return key;
            }
        }
        return 0;
    }
}