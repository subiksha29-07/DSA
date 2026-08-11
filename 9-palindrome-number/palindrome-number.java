class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        StringBuilder st = new StringBuilder(s).reverse();
        String t = st.toString();
        if(s.equals(t)){
            return true;
        }
        return false;
        
    }
}