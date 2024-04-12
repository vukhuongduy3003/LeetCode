class Solution {
    public int trap(int[] height) {
        Integer n = height.length;
        int[] M_l = new int[n];
        int[] M_r = new int[n];
        Integer max_l_height = height[0];
        Integer max_r_height = height[n - 1];
        Integer sumWater = 0;
        for (int i = 0; i < n; i++) {
            max_l_height = Math.max(height[i], max_l_height);
            M_l[i] = max_l_height;
        }
        for (int i = n - 1; i >= 0; i--) {
            max_r_height = Math.max(height[i], max_r_height);
            M_r[i] = max_r_height;
        }
        for (int i = 0; i < n; i++) {
            int temp = Math.min(M_l[i], M_r[i]);
            sumWater += temp - height[i];
        }
        return sumWater;
    }
}