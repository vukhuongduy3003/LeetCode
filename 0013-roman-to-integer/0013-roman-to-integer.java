class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        Map<Character, Integer> numerals = new HashMap<>();
        numerals.put('I', 1);
        numerals.put('V', 5);
        numerals.put('X', 10);
        numerals.put('L', 50);
        numerals.put('C', 100);
        numerals.put('D', 500);
        numerals.put('M', 1000);
        for (int i = 0; i < s.length() - 1; i++) {
            if (numerals.get(s.charAt(i)) < numerals.get(s.charAt(i + 1))) {
                ans -= numerals.get(s.charAt(i));
            }
            else {
                ans += numerals.get(s.charAt(i));
            }
        }
        ans += numerals.get(s.charAt(s.length() - 1));
        return ans;
    }
}