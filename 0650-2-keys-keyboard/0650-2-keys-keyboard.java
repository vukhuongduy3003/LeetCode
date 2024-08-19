class Solution {
    public int minSteps(int n) {
        if (n == 1) return 0;
        return 1 + minStepHelper(1, 1, n);
    }
    private int minStepHelper(int curr, int paste, int n) {
        if (curr == n) return 0;
        if (curr > 1000) return 1000;
        int n1 = 2 + minStepHelper(curr * 2, curr, n);
        int n2 = 1 + minStepHelper(curr + paste, paste, n);
        return Math.min(n1, n2);
    }
}