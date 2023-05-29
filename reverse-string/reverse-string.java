class Solution {
    public void reverseString(char[] s) {
        // My way
        // int n = s.length;
        // for (int i = 0; i < n / 2; i++){
        //     char temp = s[i];
        //     s[i] = s[n - 1 - i];
        //     s[n - 1 - i] = temp;
        // }
        
        // Different way
        int r = s.length - 1;
        int l = 0;
        while (l < r){
            char c = s[l];
            s[l] = s[r];
            s[r] = c;
            l++;
            r--;
        }
    }
}