class Solution {
    // Ways 1
    // public boolean containsDuplicate ( int[] nums){
    //         int n = nums.length;
    //         Arrays.sort(nums);
    //         for (int i = 0; i < n - 1; i++)
    //             if (nums[i] == nums[i + 1])
    //                 return true;
    //         return false;
    // }
    
    // Ways 2
    // public boolean containsDuplicate ( int[] nums){
    //         int n = nums.length;
    //         HashMap<Integer, Integer> map = new HashMap<>();
    //         for (int i = 0; i < n; i++)
    //             if (map.containsKey(nums[i]))
    //                 return true;
    //             else
    //                 map.put(nums[i], 1);
    //         return false;
    // }
    
    // Ways 3
    public boolean containsDuplicate ( int[] nums){
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++)
            if (set.contains(nums[i]))
                return true;
            else set.add(nums[i]);
        return false;
    }
}