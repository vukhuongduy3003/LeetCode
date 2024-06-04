class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int ans = 0;
        for (Character c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
                ans += 2;
            } else {
                set.add(c);
            }
        }
        return set.size() > 0 ? ans + 1 : ans;
    }
}