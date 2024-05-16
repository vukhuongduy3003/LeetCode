class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) {
            if (!frequency.containsKey(num)) {
                frequency.put(num, 1);
            }
            else {
                frequency.put(num, frequency.get(num) + 1);
            }
            if (frequency.get(num) > n / 2) {
                return num;
            }
        }
        return 0;
    }
}