class Solution {
    public int minOperations(String[] logs) {
        int res = 0;
        for (String l : logs) {
            res += add(l, res);
        }
        return res;
    }
    private int add(String l, int res) {
        return (l.charAt(1) == '.') ? (res == 0 ? 0 : -1) : (l.charAt(0) == '.' ? 0 : 1);
    }
}