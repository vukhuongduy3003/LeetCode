class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] arr = new int[1001];
        int[] ans = new int[1001];
        for (int n : nums1) {
            arr[n]++;
        }
        int i = 0;
        for (int n : nums2) {
            if (arr[n] > 0) {
                ans[i++] = n;
                arr[n]--;
            }
        }
        return Arrays.copyOfRange(ans, 0, i);
    }
}