class Solution {
    public int singleNumber(int[] nums) {
        // int ans = 0;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++)
        //     if (!map.containsKey(nums[i]))
        //         map.put(nums[i], 1);
        //     else
        //         map.put(nums[i], map.get(nums[i]) + 1);
        // for (Integer i : map.keySet())
        //     if (map.get(i) == 1)
        //         return i;
        // return 0;
        
        // Different ways
        // int n = nums.length;
        // Arrays.sort(nums);
        // if (n == 1) return nums[0];
        // for (int i = 0; i < n - 1; i += 2)
        //     if (nums[i] != nums[i + 1]) return nums[i];
        // return nums[n - 1];
        
        // Different ways: bit manipulation
        int ans = 0;
        for (int i = 0; i < nums.length; i++)
            ans = ans ^ nums[i];
        return ans;
    }
}