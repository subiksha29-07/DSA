class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> m = new TreeMap<>();
        LinkedList<Integer> l = new LinkedList<>();
        for(int i : nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }

        for(int k :m.keySet()){
            if(m.get(k) > 1){
                l.add(k);
            }
        }
        return l;
    }
}