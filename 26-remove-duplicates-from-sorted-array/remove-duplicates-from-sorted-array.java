class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int l = 0; // Tracks the position of the last unique element
        
        for (int r = 1; r < nums.length; r++) {
            // Found a new unique element
            if (nums[r] != nums[l]) {
                l++;                // Move the unique pointer forward
                nums[l] = nums[r];  // Overwrite the duplicate with the new unique value
            }
        }
        
        // The number of unique elements is the index + 1
        return l + 1;
    }
}
