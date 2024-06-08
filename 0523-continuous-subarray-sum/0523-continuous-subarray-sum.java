class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        List<Integer> l = new ArrayList<>();
        l.add(0);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            l.add((l.get(l.size() - 1) + nums[i]) % k);
        }
        for (int i = 0; i <= n; i++) {
            if (!map.containsKey(l.get(i) % k)) {
                map.put(l.get(i) % k, i);
            }
            if (map.containsKey(l.get(i) % k)) {
                if (i - map.get(l.get(i) % k) > 1) {
                    return true;
                }
            }
        }
        return false;
    }
}