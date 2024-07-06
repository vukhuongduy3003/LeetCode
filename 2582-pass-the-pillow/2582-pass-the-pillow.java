class Solution {
    public int passThePillow(int n, int time) {
        int ans = 1;
        boolean flag = true;
        while (time != 0) {
            if (flag) {
                ans++;
                if (ans == n) {
                    flag = false;
                }
            } else {
                ans--;
                if (ans == 1) {
                    flag = true;
                }
            }
            time--;
        }
        return ans;
    }
}