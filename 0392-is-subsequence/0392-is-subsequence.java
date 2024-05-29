class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length(), n = t.length();
        int j = 0;
        if (m == 0) {
            return true;
        }
        for (int i = 0; i < n; i++) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
            }
            if (j == m) {
                return true;
            }
        }
        return j == m;
    }
}