class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            if (!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else
                map.put(nums[i], map.get(nums[i]) + 1);
        for (Integer i : map.keySet())
            if (map.get(i) == 1)
                return i;
        return 0;
    }
}