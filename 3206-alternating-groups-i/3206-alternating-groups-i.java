class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        int i = 1, count = 0;
        if (colors[n - 1] != colors[0] && colors[0] != colors[1]) {
            count++;
        }
        if (colors[n - 2] != colors[n - 1] && colors[n - 1] != colors[0]) {
            count++;
        }
        while (i != n - 1) {
            if (colors[i - 1] != colors[i] && colors[i] != colors[i + 1]) {
                count++;
            }
            i++;
        }
        return count;
    }
}