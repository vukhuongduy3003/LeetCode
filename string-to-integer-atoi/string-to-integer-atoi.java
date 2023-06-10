class Solution {
    public int myAtoi(String s) {
        if (s.length() == 0) return 0;
        
        int index = 0;
        while (index < s.length() && s.charAt(index) == ' ') index++;
        if (index == s.length()) return 0;
        
        char c;
        boolean isNegative = (c = s.charAt(index)) == '-';
        if (isNegative || c == '+') index++;
        int maxLimit = Integer.MAX_VALUE / 10;
        int result = 0;
        while (index < s.length() && (isDigit(c = s.charAt(index)))) {
            int digit = c - '0';
            if (result > maxLimit || (result == maxLimit && digit > 7)) {
                return isNegative? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = (10 * result) + digit;
            index++;
        }
        return isNegative? -result : result;
    }
    
    private boolean isDigit(char c) {
        return '0' <= c && c <= '9';
    }
}