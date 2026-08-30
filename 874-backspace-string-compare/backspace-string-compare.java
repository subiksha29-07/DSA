class Solution {
    public boolean backspaceCompare(String s, String t) {

        int i = s.length() - 1;
        int j = t.length() - 1;

        while (i >= 0 || j >= 0) {

            // Find next valid character in s
            int skipS = 0;

            while (i >= 0) {

                if (s.charAt(i) == '#') {
                    skipS++;
                    i--;
                }
                else if (skipS > 0) {
                    skipS--;
                    i--;
                }
                else {
                    break;
                }
            }


            // Find next valid character in t
            int skipT = 0;

            while (j >= 0) {

                if (t.charAt(j) == '#') {
                    skipT++;
                    j--;
                }
                else if (skipT > 0) {
                    skipT--;
                    j--;
                }
                else {
                    break;
                }
            }


            // Compare the valid characters
            if (i >= 0 && j >= 0) {
                if (s.charAt(i) != t.charAt(j)) {
                    return false;
                }
            }
            else if (i >= 0 || j >= 0) {
                return false;
            }

            // Move to next character
            i--;
            j--;
        }

        return true;
    }
}