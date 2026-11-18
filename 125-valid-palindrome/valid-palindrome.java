class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb = new StringBuilder(s).reverse();
        String ss = sb.toString();
        if(s.equals(ss)){
            return true;
        }
        return false;

        
    }
}