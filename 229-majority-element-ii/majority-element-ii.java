class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        for(int i : nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int max = (nums.length / 3);
        for(Map.Entry<Integer,Integer> e : m.entrySet()){
            if(e.getValue() > max){
                //max = e.getValue();
                l.add(e.getKey());
            }
        }
        return l;
    }
}
    