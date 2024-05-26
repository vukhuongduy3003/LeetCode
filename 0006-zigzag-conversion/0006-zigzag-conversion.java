class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        
        String ans = "";
        String[] arr = new String[numRows];
        Arrays.fill(arr, "");
        int n = s.length();
        int step = 1;
        
        for (int i = 0, j = 0; i < n; i++) {
            arr[j] += s.charAt(i);
            if (j == 0) {
                step = 1;
            } else if (j == numRows - 1) {
                step = -1;
            }
            j += step;
        }
        
        for (String a : arr) {
            ans += a;
        }
        return ans;
    }
}