class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for (String s : details) {
            char chuc = s.charAt(11), dv = s.charAt(12);
            if (chuc > '6' || (chuc == '6' && dv > '0')) {
                ans++;
            }
        }
        return ans;
    }
}