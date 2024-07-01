class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int ans = 0;
        for (int e : set) {
            if (!set.contains(e - 1)) {
                int n = e + 1;
                while (set.contains(n)) {
                    n++;
                }
                ans = Math.max(ans, n - e);
            }
        }
        return ans;
    }
}