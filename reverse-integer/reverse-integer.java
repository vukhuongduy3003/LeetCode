class Solution {
    public int reverse(int x) {
        String s = x < 0 ?
            new StringBuilder(String.valueOf(-x)).append("-").reverse().toString() :
            new StringBuilder(String.valueOf(x)).reverse().toString();
        try {
            return Integer.parseInt(s);
        }
        catch (Exception e){
            return 0;
        }
    }
}