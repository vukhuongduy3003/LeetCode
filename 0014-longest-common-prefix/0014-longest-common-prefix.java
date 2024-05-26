class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length;
        int index = 0;
        while (index < strs[0].length() && index < strs[n - 1].length() ) {
            if (strs[0].charAt(index) == strs[n - 1].charAt(index)) {
                index++;
            }
            else {
                break;
            }
        }
        return strs[0].substring(0, index);
    }
}