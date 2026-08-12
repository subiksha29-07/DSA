class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1 ,high = 0;
        for(int i:piles){
            high = Math.max(i,high);
        }
        while(low <= high){
            int mid = low +  ((high - low) >> 1);
            long hours = 0;
            for(int i:piles){
                hours += (long)Math.ceil((double) i/mid);
            }
            if(hours <= h){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}