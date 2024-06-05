class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            int minCount = Integer.MAX_VALUE;
            for (String s : words) {
                int count = 0;
                for (char ch : s.toCharArray()) {
                    if (ch == c) {
                        count++;
                    }
                }
                minCount = Math.min(minCount, count);
            }
            for (int i = 0; i < minCount; i++) {
                ans.add(Character.toString(c));
            }
        }
        return ans;
    }
}