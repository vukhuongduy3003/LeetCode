class Solution {
    public int scoreOfString(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            ans += Math.abs(((int) s.charAt(i)) - (int) s.charAt(i + 1));
        }
        return ans;
    }
}