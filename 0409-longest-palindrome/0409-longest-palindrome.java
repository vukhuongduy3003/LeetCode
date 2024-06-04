class Solution {
    public int longestPalindrome(String s) {
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
                if (map.get(c) % 2 == 0) {
                    ans += 2;
                }
            } else {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() % 2 == 1) {
                ans += 1;
                break;
            }
        }
        return ans;
    }
}