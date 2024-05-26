class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length, min_slen = Integer.MAX_VALUE;
        String ans = "";
        for (String s : strs) {
            min_slen = Math.min(min_slen, s.length());
        }
        for (int i = 0; i < min_slen; i++) {
            char c = strs[0].charAt(i);
            boolean flag = true;
            for (int j = 1; j < n; j++) {
                if (c != strs[j].charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ans += c;
            }
            else {
                break;
            }
        }
        return ans;
    }
}