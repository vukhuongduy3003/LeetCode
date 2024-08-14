class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int low = 0, high = nums[n - 1] - nums[0];
        while (low < high) {
            int mid = (low + high) / 2;
            int count = countPairWithMaxDistance(nums, mid);
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    private int countPairWithMaxDistance(int[] nums, int mid) {
        int count = 0;
        int n = nums.length, left = 0;
        for (int right = 0; right < n; right++) {
            while (nums[right] - nums[left] > mid) {
                left++;
            }
            count += right - left;
        }
        return count;
    }
}