class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i : nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int max = 0;
        int ans = 0;
        for(Map.Entry<Integer,Integer> e : m.entrySet()){
            if(e.getValue() > max){
                max = e.getValue();
                ans = e.getKey();
            }
        }
        return ans;
    }
}